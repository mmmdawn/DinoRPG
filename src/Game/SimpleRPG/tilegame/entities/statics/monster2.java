package Game.SimpleRPG.tilegame.entities.statics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Animation;
import Game.SimpleRPG.tilegame.gfx.Assets;
import Game.SimpleRPG.tilegame.items.Item;

public class monster2 extends StaticEntity{
	
	private Animation animaLeft, animaRight;
	public monster2(Handler handler, float x, float y) {
		super(handler, x, y, 70 , 80);
		bounds.x = 16;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);
		
		animaLeft = new Animation(500, Assets.quai2_trai);
		animaRight = new Animation(500, Assets.quai2_phai);

	}

	@Override
	public void tick() {
		animaLeft.tick();
		animaRight.tick();
		
		if (x<1202 && j1==0) {
			for(int i = (int) x; i <= 1200; i++) {
				x = (float) (x + 0.001);
				if(x == 1200) { j1=1;  break;}
					
				
			}
			for(int j = (int) y; j <= 600; j++) {
				y = (float) (y + 0.001);
				if(y == 600) break;
					
				
			}
		}
		if (x>898 && j1==1)
		{
		for(int i = (int) x; i >= 899; i--) {
			x = (float) (x - 0.001);
			if(x == 899) {
				 j1=0;
				break;
			}
				
			
		}
		for(int j = (int) y; j >=  599; j--) {
			y = (float) (y - 0.001);
			if(y == 599) break;
				
			
		}
		}
		System.out.println(x);
		System.out.println(y);
		
	}

	@Override
	public void render(Graphics g) {
		
		
		g.drawImage(getCurrentAnimationFrame(),(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame() {
	
		if(j1 == 0) {
			return animaRight.getCurrentFrame();
		}
		if(j1 == 1) {
			return animaLeft.getCurrentFrame();
		}
		return null;
		
	}

	@Override
	public void die() {
		handler.getWorld().getItemManager().addItem(Item.chuyItem.createNew((int)x,(int) y));
		
	}
	
}
