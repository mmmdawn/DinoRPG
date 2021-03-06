package game.entities.meteor;

import game.Handler;

public class MeteorGenerator {
	private static final long MAX_SPAWN_DELAY = 500;
	private static long spawn_delay = MAX_SPAWN_DELAY;
	private float x, y, xOffset, yOffset;
	
	private Handler handler;
	private long timer, lastTime;
	
	public MeteorGenerator(Handler handler) {
		this.handler = handler;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public Meteor getRandomMeteor(Handler handler) {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		if (timer >= spawn_delay) {
			timer = 0;
			xOffset = handler.getGameCamera().getxOffset();
			yOffset = handler.getGameCamera().getyOffset();
			x = game.utils.Utils.getRandomFloat(xOffset, xOffset + 1366);
			y = game.utils.Utils.getRandomFloat(yOffset, yOffset + 768) - 500;
			return new Meteor(handler, x, y);
		} else return null;
	}
	
	public void resetDifficulty() {
		spawn_delay = MAX_SPAWN_DELAY;
		handler.getGame().getGameInfo().setDifficulty(0);
	}

	public void increaseDifficulty() {
		if (spawn_delay >= 100) {
			spawn_delay -= 50;
			handler.getGame().getGameInfo().setDifficulty((int)(MAX_SPAWN_DELAY - spawn_delay)/50);
		} else if (spawn_delay > 0) {
			spawn_delay -= 10;
			handler.getGame().getGameInfo().setDifficulty(handler.getGame().getGameInfo().getDifficulty() + 1);
		}
	}
}
