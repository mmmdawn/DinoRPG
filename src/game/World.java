package game;

import java.awt.Graphics;
import game.entities.EntityManager;
import game.entities.creatures.Player;
import game.entities.items.Coin;
import game.entities.items.CoinGenerator;
import game.entities.meteor.Meteor;
import game.entities.meteor.MeteorGenerator;
import game.entities.statics.*;
import game.gfx.Assets;
import game.tiles.Tile;
import game.utils.Utils;

public class World {
	private EntityManager entityManager;
	private MeteorGenerator meteorGenerator;
	private CoinGenerator coinGenerator;
	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public World(Handler handler, String path) {
		this.handler = handler;
		meteorGenerator = new MeteorGenerator(handler);
		coinGenerator = new CoinGenerator();
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));

		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);

	}
	public void tick() {
		entityManager.tick();
	}
	
	public void render(Graphics g) {
		int xStart = (int)Math.max(0, handler.getGameCamera().getxOffset()/Tile.TILEWIDTH );
		int xEnd = (int)Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth())/Tile.TILEWIDTH +1);
		int yStart = (int)Math.max(0, handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT );;
		int yEnd = (int)Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight())/Tile.TILEHEIGHT +1);
		for(int y = yStart; y < yEnd; y++) {
			for(int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), 
						(int)(y *Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		entityManager.render(g);
	}
	  
	public Tile getTile(int x, int y) {
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile1;
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null) {
			return Tile.water;
		}
		return t;
	}
	private void loadWorld(String path) {
		int temp = 0;
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				temp = Utils.parseInt(tokens[(x+y*width) +4]);
				if (temp < 10) {
					tiles[x][y] = temp;
					continue;
				} else {
					tiles[x][y] = temp % Assets.NUMBER_OF_TILES;
					temp = (int) temp / Assets.NUMBER_OF_TILES;
					
					if (temp == 1) 
						entityManager.addEntity(new Tree1(handler, (float)x * Tile.TILEWIDTH, (float)y * Tile.TILEHEIGHT));
					else if (temp == 2)
						entityManager.addEntity(new Tree2(handler, (float)x * Tile.TILEWIDTH, (float)y * Tile.TILEHEIGHT));
					else if (temp == 3)
						entityManager.addEntity(new Tree3(handler, (float)x * Tile.TILEWIDTH, (float)y * Tile.TILEHEIGHT));
					else if (temp == 4)
						entityManager.addEntity(new Tree4(handler, (float)x * Tile.TILEWIDTH, (float)y * Tile.TILEHEIGHT));
					else if (temp == 5)
						entityManager.addEntity(new Rock1(handler, (float)x * Tile.TILEWIDTH, (float)y * Tile.TILEHEIGHT));
					else if (temp == 6)
						entityManager.addEntity(new Rock2(handler, (float)x * Tile.TILEWIDTH, (float)y * Tile.TILEHEIGHT));
				}
			}
		}
	}
	
	public MeteorGenerator getMeteorGenerator() {
		return meteorGenerator;
	}

	public CoinGenerator getCoinGenerator() {
		return coinGenerator;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
