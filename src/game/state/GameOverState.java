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

public class GameOverState extends State {
	private UIManager uiManager;
	public GameOverState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);

		UIImageButton back = new UIImageButton(620, 570, 103, 103, Assets.button_back, new ClickListener() {
			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(new MenuState(handler));
			}
		});

		uiManager.addObject(new UIImageBackground(new Animation(100, Assets.background), 0, 0, 1366, 768));
		uiManager.addObject(new UIImageBackground(new Animation(10000, Assets.over), (int)280, 10, 793, 746));
		uiManager.addObject(back);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		uiManager.render(g);
		
		String yourScore = String.format("YOUR SCORE: %d", handler.getGame().getGameInfo().getScore());
		String bestScore = String.format("BEST SCORE: %d", handler.getGame().getGameInfo().getBestScore());
		Text.drawString(g,"GAME OVER", 380, 130, false, Color.BLACK, Assets.font2);
		Text.drawString(g, yourScore, 330, 280, false, Color.BLACK, Assets.font3);
		Text.drawString(g, bestScore, 330, 380, false, Color.BLACK, Assets.font3);
	}

}
