package game.tiles;


import game.gfx.Assets;

public class GrassTile2 extends Tile {

	public GrassTile2( int id) {
		super(Assets.grass2, id);
	}

	@Override
	public boolean isObstacle() {
		return false;
	}
	
}
