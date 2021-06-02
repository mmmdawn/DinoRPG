package game.entities.meteor;

import game.Handler;

public class MeteorGenerator {
	private static final long SPAWN_DELAY_TIME = 20;
	
	private Handler handler;
	private long timer, lastTime;
	
	public MeteorGenerator(Handler handler) {
		// TODO Auto-generated constructor stub
		this.handler = handler;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public Meteor getRandomMeteor(Handler handler) {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		if (timer >= SPAWN_DELAY_TIME) {
			timer = 0;
			float x = game.utils.Utils.getRandomFloat(2 * 64, 30 * 64);
			float y = game.utils.Utils.getRandomFloat(2 * 64, 30 * 64);
			return new Meteor(handler, x, y);
		} else return null;
	}
}
