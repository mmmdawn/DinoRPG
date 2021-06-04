package game.entities.items;

import game.Handler;

public class CoinGenerator {
	private static final long SPAWN_DELAY = 5000;
	private float x, y, xOffset, yOffset;
	
	private long timer, lastTime;
	
	public CoinGenerator() {
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public Coin getRandomCoin(Handler handler) {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		if (timer >= SPAWN_DELAY) {
			timer = 0;
			xOffset = handler.getGameCamera().getxOffset();
			yOffset = handler.getGameCamera().getyOffset();
			x = game.utils.Utils.getRandomFloat(xOffset, xOffset + 1366);
			y = game.utils.Utils.getRandomFloat(yOffset, yOffset + 768);
			return new Coin(handler, x, y);
		} else return null;
	}
}
