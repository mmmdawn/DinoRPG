package game.tiles;


import game.gfx.Assets;

public class SandTile extends Tile {

	public SandTile( int id) {
		super(Assets.sand, id);
	}

	@Override
	public boolean isObstacle() {
		return false;
	}
	
}
