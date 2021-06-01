package Game.SimpleRPG.tilegame.state;

import java.awt.Graphics;

import Game.SimpleRPG.tilegame.Game;
import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.entities.creatures.Player;
import Game.SimpleRPG.tilegame.entities.statics.Tree1;
import Game.SimpleRPG.tilegame.tiles.Tile;
import Game.SimpleRPG.tilegame.worlds.World;

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
