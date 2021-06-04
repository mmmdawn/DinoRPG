package game.state;

import java.awt.Color;
import java.awt.Graphics;

import game.Game;
import game.Handler;
import game.World;
import game.entities.creatures.Player;
import game.entities.statics.Tree1;
import game.tiles.Tile;
import game.gfx.Assets;
import game.gfx.Text;

public class GameState extends State{
//	private Player player;
	private World world;
	private int lastScore;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		handler.getGame().getGameInfo().setScore(0);
		lastScore = handler.getGame().getGameInfo().getScore();
	}

	@Override
	public void tick() {
		world.tick();
		int newScore = handler.getGame().getGameInfo().getScore();
		int delta = newScore - lastScore;
		if (delta >= 50) {
			handler.getWorld().getMeteorGenerator().increaseDifficulty();
			lastScore = newScore;
		}
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);

		String score = String.format("%-12s%4d", "Score:", handler.getGame().getGameInfo().getScore());
		String difficulty = String.format("%-12s%4d", "Difficulty:", handler.getGame().getGameInfo().getDifficulty());
		Text.drawString(g, score, 20, 40, false, Color.WHITE, Assets.font1);
		Text.drawString(g, difficulty, 20, 70, false, Color.WHITE, Assets.font1);
	}

}
