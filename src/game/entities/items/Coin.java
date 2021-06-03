package game.entities.items;

import java.awt.Graphics;

import game.Handler;
import game.gfx.Animation;
import game.gfx.Assets;

public class Coin extends Item {
	private static int weight = 1;

	public Coin(Handler handler, float x, float y) {
		super(new Animation(50, Assets.coin), handler, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void makeEffect() {
		// TODO Auto-generated method stub
		handler.getGame().setScore(handler.getGame().getScore() + 10 * weight);
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

}
