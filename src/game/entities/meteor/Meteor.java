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
		super(handler, x, y, 100, 400);
		animation = new MeteorAnimation(35, Assets.meteor);
		this.setBounds(new Rectangle(5, 350, 90, 50));
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
		g.drawImage(getCurrentFrame(), (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);

//		g.setColor(Color.blue);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	public boolean isDealDamage() {
		return animation.isDealDamage();
	}
	
	public BufferedImage getCurrentFrame() {
		return animation.getCurrentFrame();
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
	}
}
