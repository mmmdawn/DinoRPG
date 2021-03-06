package game.entities.items;

import java.awt.Graphics;

import game.Handler;
import game.entities.Entity;
import game.gfx.Animation;

public abstract class Item extends Entity{
	protected Animation animation;
	
	protected abstract void makeEffect();
	
	public Item(Animation animation, Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		this.animation = animation;
	}

	@Override
	public void tick() {
		animation.tick();
		if (handler.getWorld().getEntityManager().getPlayer().getCollisionBounds(0f, 0f).intersects(this.getCollisionBounds(0f, 0f))) {
			this.hurt(1);
		}
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getCurrentFrame(), (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.blue);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}

	@Override
	public void die() {
		makeEffect();
	}

}
