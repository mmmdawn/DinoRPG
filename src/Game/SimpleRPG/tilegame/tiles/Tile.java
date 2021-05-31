package Game.SimpleRPG.tilegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	// Static variables
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile brickTile = new BrickTile(2);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile water = new WaterTile(5);
	
	// Non-static 
	protected BufferedImage texture;
	protected final int id;

	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	public int getId() {
		return id;
	}
		 
	
}
