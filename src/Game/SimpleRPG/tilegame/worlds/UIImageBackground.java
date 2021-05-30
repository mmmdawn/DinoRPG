package Game.SimpleRPG.tilegame.worlds;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Game.SimpleRPG.tilegame.ui.ClickListener;

public class UIImageBackground extends UIObject {
	
	private BufferedImage[] images;
	private ClickListener clicker;
	public UIImageBackground(float x, float y, int width, int height, BufferedImage[] images) {
		super(x, y, width, height);
		this.images = images;
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		
			g.drawImage(images[0], (int)x, (int)y, width, height, null);
	
		
	}

	@Override
	public void onClick() {
		clicker.onClick();
		
	} 
	
}

