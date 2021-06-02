package game.entities.meteor;

import game.Handler;

public class MeteorGenerator {
	private static final long SPAWN_DELAY_TIME = 30;
	private float x, y, xOffset, yOffset;
	
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
			xOffset = handler.getGameCamera().getxOffset();
			yOffset = handler.getGameCamera().getyOffset();
			x = game.utils.Utils.getRandomFloat(xOffset, xOffset + 1366);
			y = game.utils.Utils.getRandomFloat(yOffset, yOffset + 768) - 500;
//			System.out.println(String.valueOf(x) + ", " + String.valueOf(y));
			return new Meteor(handler, x, y);
		} else return null;
	}
}
