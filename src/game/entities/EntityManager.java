package game.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import game.Handler;
import game.entities.creatures.Player;

public class EntityManager {

	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	private Queue<Entity> newEntityQueue;
	private Comparator<Entity> renderSorter = new Comparator<Entity>() {
		public int compare(Entity a, Entity b) {
			if(a.getY() + a.getHeight() < b.getY() +b.getHeight())
				return -1;
			return 1;
		}
	};
	
	public EntityManager(Handler handler, Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
		newEntityQueue = new LinkedList<Entity>();
		addEntity(player);
	}
	
	
	public void tick() {
		this.addEntity(handler.getWorld().getMeteorGenerator().getRandomMeteor(handler));
		this.addEntity(handler.getWorld().getCoinGenerator().getRandomCoin(handler));

		Entity e;
		Iterator<Entity> it = entities.iterator();
		while(it.hasNext()){
			e = it.next();
			e.tick();
			if(!e.isActive()) {
				it.remove();
			}
		}
		
		while ((e = newEntityQueue.poll()) != null) {
			addEntity(e);
		}
		entities.sort(renderSorter);
	}

	public void render(Graphics g) {
		for(Entity e: entities) {
			e.render(g);
		}
	}
	
	public void addEntity(Entity e) {
		if (e == null) {
			return;
		} else {
			entities.add(e);
		}
	}

	public Player getPlayer() {
		return player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public Queue<Entity> getNewEntityQueue() {
		return this.newEntityQueue;
	}
}
