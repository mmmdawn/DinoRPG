package game.entities.statics;

import java.awt.Graphics;

import game.Handler;
import game.gfx.Assets;

public class Tree5 extends StaticEntity{
	public Tree5(Handler handler, float x, float y) {
		super(Assets.tree5, handler, x, y, 64 , 64 );
		bounds.x = 8;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);
	}
}