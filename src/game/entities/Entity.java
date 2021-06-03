package game.entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import game.Handler;
import game.entities.items.Item;
import game.entities.meteor.Meteor;

public abstract class Entity {
	
	public static final int DEFAULT_HEALTH = 1;

	protected Handler handler;
	protected Rectangle bounds;
	protected boolean active = true;
	protected float x, y;
	protected int width, height;
	protected int health;
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract void die();
	
	public boolean isActive() {
		return active;
	}

	public Entity(Handler handler, float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.handler = handler;
		health = DEFAULT_HEALTH;
		bounds = new Rectangle(0, 0 , width, height);
	}

	public void hurt(int amt) {
		health -= amt;
		if(health <= 0) {
			active = false;
			die();
		}
	}
	
	public boolean checkEntityCollisions(float xOffset, float yOffset) {
		for(Entity e: handler.getWorld().getEntityManager().getEntities()) {
			if(e.equals(this)|| e instanceof Meteor || e instanceof Item)
				continue;
			if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
				return true;
		}
		return false;
	}
	
	public Rectangle getCollisionBounds(float xOffset, float yOffset ) {
		return new Rectangle((int)(x + bounds.x + xOffset), (int)(y + bounds.y + yOffset), bounds.width, bounds.height);
	}
	
	// getter, setter
	public float getX() {
		return x;
		
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
}