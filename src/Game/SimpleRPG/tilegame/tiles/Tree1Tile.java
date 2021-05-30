package Game.SimpleRPG.tilegame.tiles;

import Game.SimpleRPG.tilegame.gfx.Assets;

public class Tree1Tile extends Tile{
	public Tree1Tile(int id) {
		super(Assets.tree1, id);
	}
	
	public boolean isSolid() {
		return true;
	}
}
