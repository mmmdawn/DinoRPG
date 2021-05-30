package Game.SimpleRPG.tilegame.entities.statics;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.entities.Entity;

public abstract class StaticEntity extends Entity {
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
