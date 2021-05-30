package Game.SimpleRPG.tilegame.entities.statics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Assets;

public class Monster1 extends StaticEntity{
	public Monster1(Handler handler, float x, float y) {
		super(handler, x, y, 200 , 200);
		bounds.x = 16;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
//		for(int i = 1; i < 100; i++) {
//			x = (float) (x + 0.005);
//			if(x == 800) break;
//		}
//		System.out.println(x);
		
		g.drawImage(Assets.house2,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	
}
