package game.state;

import java.awt.Color;
import java.awt.Graphics;

import game.Game;
import game.Handler;
import game.World;
import game.entities.creatures.Player;
import game.entities.statics.Tree1;
import game.tiles.Tile;
import game.ui.UIImageBackground;
import game.ui.UIManager;
import game.gfx.Animation;
import game.gfx.Assets;
import game.gfx.Text;

public class GameState extends State{
//	private Player player;
	private World world;
	private int lastScore;
	private UIManager uiManager;
	
	public GameState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		world = new World(handler, "res/worlds/world1.txt");

		uiManager.addObject(new UIImageBackground(new Animation(10000, Assets.score), 10, 10, 260, 40));
		uiManager.addObject(new UIImageBackground(new Animation(10000, Assets.score), 10, 58, 260, 40));
		
		handler.setWorld(world);
		handler.getGame().getGameInfo().setScore(0);
		lastScore = handler.getGame().getGameInfo().getScore();
	}

	@Override
	public void tick() {
		uiManager.tick();
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
		uiManager.render(g);
		
		String score = String.format("%s%8d", "Score:", handler.getGame().getGameInfo().getScore());
		String difficulty = String.format("%s%-4d", "Difficulty: ", handler.getGame().getGameInfo().getDifficulty());
		Text.drawString(g, score, 20, 38, false, Color.WHITE, Assets.font1);
		Text.drawString(g, difficulty, 20, 85, false, Color.WHITE, Assets.font1);
	}

}
