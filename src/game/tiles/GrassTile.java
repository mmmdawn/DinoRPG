package game.tiles;


import game.gfx.Assets;

public class GrassTile extends Tile {

	public GrassTile( int id) {
		super(Assets.grass, id);
	}

	@Override
	public boolean isObstacle() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
