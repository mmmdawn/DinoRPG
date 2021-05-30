package Game.SimpleRPG.tilegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile brickTile = new BrickTile(2);
	public static Tile houseTile = new HouseTile(3);
//	public static Tile waterTop = new WaterTopTile(4);
	public static Tile water = new WaterTile(5);
//	public static Tile waterLeft = new WaterLeftTile(6);
	public static Tile treeTile = new Tree1Tile(7);
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
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
