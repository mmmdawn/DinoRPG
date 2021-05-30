package Game.SimpleRPG.tilegame.tiles;

import Game.SimpleRPG.tilegame.gfx.Assets;

public class WaterTile extends Tile{
	public WaterTile(int id) {
		super(Assets.water, id);
	}
	
	public boolean isSolid() {
		return true;
	}
}
