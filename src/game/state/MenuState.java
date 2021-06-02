package game.state;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.Game;
import game.Handler;
import game.gfx.Assets;
import game.ui.ClickListener;
import game.ui.UIImageBackground;
import game.ui.UIImageButton;
import game.ui.UIManager;

public class MenuState extends State{
	private BufferedImage background;

	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		uiManager.addObject(new UIImageButton(900, 500, 256, 360, Assets.btn_start, new ClickListener() {
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
			}));
		uiManager.addObject(new UIImageBackground(0, 0, 1366, 768, Assets.background));
		uiManager.addObject(new UIImageButton(900, 500, 256, 360, Assets.btn_start, new ClickListener() {
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
			}));
		
	}
	
	public UIManager uiManager;
	
	
	@Override
	public void tick() {
		uiManager.tick();
	}
	@Override
	public void render(Graphics g) {
		uiManager.render(g);
		
	}
	
}
