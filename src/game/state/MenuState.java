package game.state;

import java.awt.Color;
import java.awt.Graphics;
import game.Handler;
import game.gfx.Animation;
import game.gfx.Assets;
import game.gfx.Text;
import game.ui.ClickListener;
import game.ui.UIImageBackground;
import game.ui.UIImageButton;
import game.ui.UIManager;

public class MenuState extends State{
	public UIManager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		uiManager.addObject(new UIImageBackground(new Animation(100, Assets.background), 0, 0, 1366, 768));
		uiManager.addObject(new UIImageBackground(new Animation(10000, Assets.bestScore), 20, 650, 346, 82));
		uiManager.addObject(new UIImageButton(583, 536, 200, 81, Assets.button_play, new ClickListener() {
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
		}));
		uiManager.addObject(new UIImageButton(583, 637, 200, 81, Assets.button_exit, new ClickListener() {
			public void onClick() {
				System.exit(0);
			}
		}));
	}
	
	@Override
	public void tick() {
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);

		String bestScore = String.format("%s%7d", "Best Score:", handler.getGame().getGameInfo().getBestScore());
		Text.drawString(g,bestScore, 40, 700, false, Color.BLACK, Assets.font1);
	}
	
}
