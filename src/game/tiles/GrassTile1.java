package game.tiles;


import game.gfx.Assets;

public class GrassTile1 extends Tile {

	public GrassTile1( int id) {
		super(Assets.grass1, id);
	}

	@Override
	public boolean isObstacle() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
