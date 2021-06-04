package game.state;

import java.awt.Graphics;

import game.Handler;
import game.gfx.Animation;
import game.gfx.Assets;
import game.ui.UIImageBackground;
import game.ui.UIManager;

public class GameOverState extends State {
	private UIManager uiManager;
	public GameOverState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);

		uiManager.addObject(new UIImageBackground(new Animation(100, Assets.background), 0, 0, 1366, 768));
		uiManager.addObject(new UIImageBackground(new Animation(10000, Assets.over), (int)286.5, 10, 793, 746));
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
	}

}
