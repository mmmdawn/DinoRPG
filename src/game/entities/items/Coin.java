package game.entities.items;

import game.Handler;
import game.gfx.Animation;
import game.gfx.Assets;

public class Coin extends Item {
	private static final int COIN_WIDTH = 32;
	private static final int COIN_HEIGHT = 32;

	public Coin(Handler handler, float x, float y) {
		super(new Animation(50, Assets.coin), handler, x, y, COIN_WIDTH, COIN_HEIGHT);
	}

	@Override
	protected void makeEffect() {
		handler.getGame().getGameInfo().setScore(handler.getGame().getGameInfo().getScore() + 10);
	}
}
