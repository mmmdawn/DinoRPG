package Game.SimpleRPG.tilegame.worlds;

import java.awt.Graphics;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.entities.EntityManager;
import Game.SimpleRPG.tilegame.entities.creatures.Player;
import Game.SimpleRPG.tilegame.entities.statics.Bird;
import Game.SimpleRPG.tilegame.entities.statics.House;
import Game.SimpleRPG.tilegame.entities.statics.House2;
import Game.SimpleRPG.tilegame.entities.statics.House3;
import Game.SimpleRPG.tilegame.entities.statics.House4;
import Game.SimpleRPG.tilegame.entities.statics.Monster3;
import Game.SimpleRPG.tilegame.entities.statics.Monster4;
import Game.SimpleRPG.tilegame.entities.statics.Monster5;
import Game.SimpleRPG.tilegame.entities.statics.Tree1;
import Game.SimpleRPG.tilegame.entities.statics.Tree2;
import Game.SimpleRPG.tilegame.entities.statics.Tree3;
import Game.SimpleRPG.tilegame.entities.statics.Tree4;
import Game.SimpleRPG.tilegame.entities.statics.monster2;
import Game.SimpleRPG.tilegame.entities.statics.rock1;
import Game.SimpleRPG.tilegame.entities.statics.rock2;
import Game.SimpleRPG.tilegame.items.ItemManager;
import Game.SimpleRPG.tilegame.tiles.Tile;
import Game.SimpleRPG.tilegame.utils.Utils;
public class World {
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	public EntityManager getEntityManager() {
		return entityManager;
	}

	private Handler handler;
	
	//Entities
	private EntityManager entityManager;
	
	//item
	private ItemManager itemManager;
	
	public World(Handler handler, String path) {
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
//		entityManager = new EntityManager(handler, new Monster(handler, 100, 100));
		itemManager = new ItemManager(handler);
		entityManager.addEntity(new Tree1(handler, 64, 64));
		entityManager.addEntity(new Tree1(handler, 128, 50));
		entityManager.addEntity(new Tree1(handler, 192, 64));
		entityManager.addEntity(new Tree1(handler, 256, 50));
		entityManager.addEntity(new Tree1(handler, 320, 64));
		entityManager.addEntity(new Tree1(handler, 64, 100));
		entityManager.addEntity(new Tree1(handler, 128, 128));
		entityManager.addEntity(new Tree1(handler, 64, 190));
		entityManager.addEntity(new Tree1(handler, 128, 192));
		entityManager.addEntity(new Tree1(handler, 64, 370));
		entityManager.addEntity(new Tree1(handler, 64, 490));
		entityManager.addEntity(new Tree1(handler, 64, 730));
		entityManager.addEntity(new Tree1(handler, 64, 850));
		entityManager.addEntity(new Tree1(handler, 64, 970));
		entityManager.addEntity(new Tree1(handler, 64, 1030));
		entityManager.addEntity(new Tree1(handler, 64, 1090));

	
		
		entityManager.addEntity(new Tree2(handler, 710, 64));
		entityManager.addEntity(new Tree3(handler, 710, 128));
		entityManager.addEntity(new Tree4(handler, 774, 64));
		
		entityManager.addEntity(new Tree2(handler, 1400, 64));
		entityManager.addEntity(new Tree2(handler, 1300, 100));
		entityManager.addEntity(new Tree2(handler, 1300, 200));
		entityManager.addEntity(new Tree2(handler, 1400, 130));
		entityManager.addEntity(new Tree2(handler, 1400, 340));
		entityManager.addEntity(new Tree2(handler, 1400, 500));
		entityManager.addEntity(new Tree2(handler, 1400, 600));
		entityManager.addEntity(new Tree2(handler, 1400, 930));
		entityManager.addEntity(new Tree2(handler, 1400, 1000));
		entityManager.addEntity(new Tree2(handler, 1400, 1050));
		entityManager.addEntity(new Tree2(handler, 1400, 1100));
		
		
		
		entityManager.addEntity(new Tree3(handler, 64, 1600));
		entityManager.addEntity(new Tree3(handler, 120, 1600));
		entityManager.addEntity(new Tree3(handler, 240, 1600));
		entityManager.addEntity(new Tree3(handler, 280, 1600));
		entityManager.addEntity(new Tree3(handler, 64, 1550));
		entityManager.addEntity(new Tree3(handler, 120, 1550));	
		entityManager.addEntity(new Tree3(handler, 120, 1500));
		entityManager.addEntity(new Tree3(handler, 170, 1500));
		entityManager.addEntity(new Tree3(handler, 64, 1460));
		entityManager.addEntity(new Tree3(handler, 64, 1400));
		entityManager.addEntity(new Tree3(handler, 64, 1350));
		
		entityManager.addEntity(new Tree4(handler, 250, 780));
		entityManager.addEntity(new Tree2(handler, 320, 880));
		entityManager.addEntity(new Tree4(handler, 410, 950));
		
		
		
		entityManager.addEntity(new Tree1(handler, 700, 350));
		entityManager.addEntity(new Tree2(handler, 700, 500));
		entityManager.addEntity(new Tree2(handler, 850, 500));
		entityManager.addEntity(new Tree1(handler, 850, 350));
		
		
		entityManager.addEntity(new Tree1(handler, 700, 600));
		entityManager.addEntity(new Tree3(handler, 700, 750));
		
		entityManager.addEntity(new Tree1(handler, 720, 1050));
		entityManager.addEntity(new Tree2(handler, 720, 1200));
		entityManager.addEntity(new Tree2(handler, 850, 1200));
		entityManager.addEntity(new Tree1(handler, 850, 1050));
		
		entityManager.addEntity(new Tree4(handler, 1400, 1500));
		entityManager.addEntity(new Tree4(handler, 1400, 1600));
		entityManager.addEntity(new Tree4(handler, 1400, 1450));
		entityManager.addEntity(new Tree4(handler, 1400, 1400));
		entityManager.addEntity(new Tree4(handler, 1400, 1350));
		entityManager.addEntity(new Tree4(handler, 1250, 1400));
		entityManager.addEntity(new Tree4(handler, 1200, 1600));
		
		entityManager.addEntity(new Tree1(handler, 1000, 350));
		entityManager.addEntity(new Tree1(handler, 500, 500));
		entityManager.addEntity(new Tree1(handler, 500, 350));
		entityManager.addEntity(new Tree1(handler, 350, 700));
		entityManager.addEntity(new Tree1(handler, 500, 1200));
		entityManager.addEntity(new Tree1(handler, 1100, 800));
		entityManager.addEntity(new Tree1(handler, 1200, 900));
		entityManager.addEntity(new Tree1(handler, 1250, 800));
		entityManager.addEntity(new Tree1(handler, 1250, 1100));
		entityManager.addEntity(new Tree1(handler, 1250, 1200));
		entityManager.addEntity(new Tree1(handler, 700, 1400));
		entityManager.addEntity(new Tree1(handler, 800, 1400));
		entityManager.addEntity(new Tree1(handler, 850, 1430));
	
		
		entityManager.addEntity(new rock1(handler, 460, 80));
		entityManager.addEntity(new rock1(handler, 410, 10));
		entityManager.addEntity(new rock1(handler, 810, 80));
		entityManager.addEntity(new rock1(handler, 870, 10));
		entityManager.addEntity(new rock1(handler, 670, 110));
		entityManager.addEntity(new rock2(handler, 590, 200));
		
		entityManager.addEntity(new monster2(handler, 900, 400));
		entityManager.addEntity(new Monster3(handler, 400, 500));
		entityManager.addEntity(new Monster4(handler, 500, 1000));
		entityManager.addEntity(new Monster5(handler, 900, 1300));

		
		
		
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
//		
//		entityManager.getMonster().setX(400);
//		entityManager.getMonster().setY(400);
	}
	public void tick() {
		entityManager.tick();
		itemManager.tick();
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
		//items
		itemManager.render(g);
		// entities
		entityManager.render(g);
	}
	  
	public Handler getHandler() {
		return handler;
	}
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	public ItemManager getItemManager() {
		return itemManager;
	}
	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}
	public Tile getTile(int x, int y) {
		
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null) {
			return Tile.dirtTile;
		}
		return t;
	}
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x+y*width) +4]);
			}
		}
	}
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
