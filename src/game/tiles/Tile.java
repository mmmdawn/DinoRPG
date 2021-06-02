package game.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Tile {
	// Static variables
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile brickTile = new BrickTile(1);
	public static Tile water = new WaterTile(2);
	public static Tile dirtTile = new DirtTile(3);
	
	// Non-static 
	protected BufferedImage texture;
	protected final int id;

	// Can be stepped on or not 
	public abstract boolean isObstacle();

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
	
	public int getId() {
		return id;
	}
}
