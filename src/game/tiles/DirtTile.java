package game.tiles;


import game.gfx.Assets;

public class DirtTile extends Tile{

	public DirtTile( int id) {
		super(Assets.dirt, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isObstacle() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}