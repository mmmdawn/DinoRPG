package game.entities.statics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import game.Handler;
import game.entities.Entity;
import game.entities.items.Coin;
import game.entities.meteor.Meteor;

public abstract class StaticEntity extends Entity {
	protected BufferedImage img;
	
	public StaticEntity(BufferedImage img, Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		this.img = img;
	}

	@Override
	public void tick() {
		checkMeteorCollision();
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img ,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
//		handler.getWorld().getEntityManager().addEntity(new Coin(handler, this.x, this.y));
		handler.getWorld().getEntityManager().getNewEntityQueue().add(new Coin(handler, this.x, this.y));
	}
	
	public void checkMeteorCollision() {
		for(Entity e: handler.getWorld().getEntityManager().getEntities())
			if (e.isInCamera())
				if (e instanceof Meteor)
					if(e.getCollisionBounds(0, 0).intersects(getCollisionBounds(0, 0)) && ((Meteor)e).isDealDamage()) {
						this.hurt(1);
						break;
		}
	}
}
