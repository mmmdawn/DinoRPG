package Game.SimpleRPG.tilegame.entities.statics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Animation;
import Game.SimpleRPG.tilegame.gfx.Assets;

public class Meteor extends StaticEntity{

	private Animation animation;
	
	public Meteor(Handler handler, float x, float y) {
		// TODO Auto-generated constructor stub
		super(handler, x, y, 100, 400);
		animation = new Animation(40, Assets.meteor);
		this.setBounds(new Rectangle(0, 336, 100, 64));
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		animation.tick();		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(getCurrentFrame(), (int)(x - handler.getGameCamera().getxOffset()), (int)(x - handler.getGameCamera().getyOffset()), width, height, null);

		g.setColor(Color.red);
		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
				bounds.width, bounds.height);
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
