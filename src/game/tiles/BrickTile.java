package game.tiles;

import game.gfx.Assets;

public class BrickTile extends Tile {
	public BrickTile(int id) {
		super(Assets.brick, id);
	}
	
	public boolean isObstacle() {
		return true;
	}
} 
