package game.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import game.Handler;
import game.entities.Entity;
import game.entities.meteor.Meteor;
import game.gfx.Animation;
import game.gfx.Assets;

public class Player extends Creature {
	private Animation animationDown, animationUp, animationLeft, animationRight, animationIdleRight, animationIdleLeft;
	private float xMoveTemp = 0f, yMoveTemp = 0f;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		bounds.x = 25;
		bounds.y = 37;
		bounds.width = 20;
		bounds.height = 15;
		
		//animation
		animationDown = new Animation(100, Assets.playerDown);
		animationUp = new Animation(100, Assets.playerUp);
		animationLeft = new Animation(100, Assets.playerLeft);
		animationRight = new Animation(100, Assets.playerRight);
		animationIdleRight = new Animation(100, Assets.playerIdleRight);
		animationIdleLeft = new Animation(100, Assets.playerIdleLeft);
	}

	@Override
	public void tick() {
		// Animations
		animationDown.tick();
		animationUp.tick();
		animationLeft.tick();
		animationRight.tick();
		animationIdleRight.tick();
		animationIdleLeft.tick();
		//movement
		getInput();
		move();

		handler.getGameCamera().setCameraPosition(this);
		
		checkMeteorCollision();
	}
	
	public void checkMeteorCollision() {
		for(Entity e: handler.getWorld().getEntityManager().getEntities()) {
			if(e.getCollisionBounds(0, 0).intersects(getCollisionBounds(0, 0)) && e instanceof Meteor && ((Meteor)e).isDealDamage()) {
				this.hurt(1);
				break;
			}
		}
	}

	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove -= speed;
		if(handler.getKeyManager().down)
			yMove += speed;
		if(handler.getKeyManager().left)
			xMove -= speed;
		if(handler.getKeyManager().right)
			xMove += speed;	
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(),(int)(x - handler.getGameCamera().getxOffset()),
				(int)(y - handler.getGameCamera().getyOffset()), width, height, null);
		
		// dev mode :D 
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		xMoveTemp = xMove != 0 ? xMove : xMoveTemp;
		yMoveTemp = yMove != 0 ? yMove : yMoveTemp;
		if(xMove < 0) {
			return animationLeft.getCurrentFrame();
		} else if (xMove > 0) {
			return animationRight.getCurrentFrame();
		} else if (yMove < 0) {
			return animationUp.getCurrentFrame();
		} else if (yMove > 0){
			return animationDown.getCurrentFrame();
		} else if (xMove == 0 && yMove == 0 && xMoveTemp > 0) {
			return animationIdleRight.getCurrentFrame();
		} else if (xMove == 0 && yMove == 0 && xMoveTemp < 0) {
			return animationIdleLeft.getCurrentFrame();
		} else if (xMove == 0 && yMove == 0 && yMoveTemp > 0) {
			return animationIdleRight.getCurrentFrame();
		} else if (xMove == 0 && yMove == 0 && yMoveTemp < 0) {
			return animationIdleLeft.getCurrentFrame();
		} else return animationIdleRight.getCurrentFrame();
	}

	public void die() {
		System.out.println("you lose!!");
		System.out.println(handler.getGame().getScore());
	}

}
