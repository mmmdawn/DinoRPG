package game.state;

import java.awt.Graphics;
import game.Handler;
import game.gfx.Assets;
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
		uiManager.addObject(new UIImageBackground(0, 0, 1366, 768));
		uiManager.addObject(new UIImageButton(900, 500, 256, 360, Assets.btn_start, new ClickListener() {
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
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
	}
	
}
