package game.entities.statics;

import java.awt.Graphics;

import game.Handler;
import game.entities.Entity;
import game.gfx.Assets;

public class Tomb extends StaticEntity {

	public Tomb(Handler handler, float x, float y) {
		super(Assets.tomb, handler, x, y, 64, 64);
	}
	
	@Override
	public void tick() {}
}
