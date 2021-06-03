package game.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import game.Handler;
import game.gfx.Assets;
import game.tiles.Tile;

public class rock1 extends StaticEntity {

	public rock1(Handler handler, float x, float y) {
		super(Assets.rock1, handler, x, y, 200, 200 );
		bounds.x =3;
		bounds.y =(int)(height/2f);
		bounds.width= width -6;
		bounds.height =(int)(height - height/2f);
	}
}
