package game.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import game.gfx.Animation;
import game.gfx.Assets;

public class UIImageBackground extends UIObject {
	private Animation animation;

	public UIImageBackground(Animation animation, int x, int y, int width, int height) {
		super(x, y, width, height);
		this.animation = animation;
	}

	@Override
	public void tick() {
		animation.tick();
	}

	@Override
	public void render(Graphics g) {
			g.drawImage(animation.getCurrentFrame(), (int)x, (int)y, width, height, null);
	}

	@Override
	public void onClick() {
	} 
	
}

