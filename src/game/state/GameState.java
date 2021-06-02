package game.state;

import java.awt.Graphics;

import game.Game;
import game.Handler;
import game.World;
import game.entities.creatures.Player;
import game.entities.statics.Tree1;
import game.tiles.Tile;

public class GameState extends State{
//	private Player player;
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
//		player = new Player(handler, 100, 100);
		
	}

	@Override
	public void tick() {
		world.tick();
//		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
//		player.render(g);
		
	}

}
