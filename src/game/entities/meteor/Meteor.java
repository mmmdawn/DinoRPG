package game.entities.meteor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import game.Handler;
import game.entities.Entity;
import game.entities.statics.StaticEntity;
import game.gfx.Animation;
import game.gfx.Assets;
import game.gfx.MeteorAnimation;

public class Meteor extends Entity{

	private MeteorAnimation animation;
	
	public Meteor(Handler handler, float x, float y) {
		// TODO Auto-generated constructor stub
		super(handler, x, y, 100, 400);
		animation = new MeteorAnimation(40, Assets.meteor);
		this.setBounds(new Rectangle(0, 336, 100, 64));
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		animation.tick();		
		
		if (animation.isEnd()) {
			this.hurt(1);
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(getCurrentFrame(), (int)(x - handler.getGameCamera().getxOffset()), (int)(x - handler.getGameCamera().getyOffset()), width, height, null);

//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}

	@Override
	public Rectangle getCollisionBounds(float xOffset, float yOffset ) {
		return new Rectangle(0,0,0,0);
	}
	
	public BufferedImage getCurrentFrame() {
		return animation.getCurrentFrame();
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
	}

}
