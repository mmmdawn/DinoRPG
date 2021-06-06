package game.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Tile {
	// Static variables
	public static final int TILEWIDTH = 64;
	public static final int TILEHEIGHT = 64;

	public static final Tile[] tiles = new Tile[256];
	public static final Tile water = new WaterTile(0);
	public static Tile sand = new SandTile(1);
	public static Tile grassTile1 = new GrassTile1(2);
	public static Tile grassTile2 = new GrassTile2(3);
	public static Tile grassTile3 = new GrassTile3(4);
	
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
