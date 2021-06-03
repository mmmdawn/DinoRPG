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
	private int lastScore;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		handler.getGame().setScore(0);
		lastScore = handler.getGame().getScore();
	}

	@Override
	public void tick() {
		world.tick();
		int newScore = handler.getGame().getScore();
		int delta = newScore - lastScore;
		if (delta >= 50) {
			handler.getWorld().getMeteorGenerator().increaseDifficulty();
			lastScore = newScore;
		}
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
//		player.render(g);
		
	}

}
