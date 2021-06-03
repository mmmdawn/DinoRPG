package game.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import game.Handler;
import game.gfx.Assets;
import game.items.Item;

public class Tree4 extends StaticEntity{
	public Tree4(Handler handler, float x, float y) {
		super(handler, x, y, 64 , 64 );
		bounds.x = 8;
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
		g.drawImage(Assets.tree4,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}

	@Override
	public void die() {
		handler.getWorld().getItemManager().addItem(Item.woodItem.createNew((int)x,(int) y));

		
	}
}