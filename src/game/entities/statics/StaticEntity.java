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
		if (checkMeteorCollision()) {
			System.out.println("Deleted");
//			this.hurt(1);
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img ,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		handler.getWorld().getEntityManager().addEntity(new Coin(handler, this.x, this.y));
	}
	
	public boolean checkMeteorCollision() {
		for(Entity e: handler.getWorld().getEntityManager().getEntities())
			if(e.getCollisionBounds(0, 0).intersects(getCollisionBounds(0, 0)) && e instanceof Meteor && ((Meteor)e).isDealDamage()) {
				return true;
		}
		return false;
	}
}
