package game.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import game.Handler;
import game.gfx.Assets;
import game.tiles.Tile;

public class rock2 extends StaticEntity {

	public rock2(Handler handler, float x, float y) {
		super(handler, x, y, 100, 100);
		
		bounds.x =3;
		bounds.y =(int)(height/2f);
		bounds.width= width -6;
		bounds.height =(int)(height - height/2f);
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.rock2,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	@Override
	public void die() {
//		handler.getWorld().getItemManager().addItem(Item.rockItem.createNew((int)x,(int) y));
	}

}
