package game.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import game.Handler;
import game.gfx.Assets;
import game.tiles.Tile;

public class rock2 extends StaticEntity {

	public rock2(Handler handler, float x, float y) {
		super(Assets.rock2, handler, x, y, 100, 100);
		bounds.x =3;
		bounds.y =(int)(height/2f);
		bounds.width= width -6;
		bounds.height =(int)(height - height/2f);
	}
}
