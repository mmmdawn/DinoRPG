package game.tiles;


import game.gfx.Assets;

public class GrassTile3 extends Tile {

	public GrassTile3( int id) {
		super(Assets.grass3, id);
	}

	@Override
	public boolean isObstacle() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
