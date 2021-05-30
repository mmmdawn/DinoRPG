package Game.SimpleRPG.tilegame.state;

import java.awt.Graphics;

import Game.SimpleRPG.tilegame.Game;
import Game.SimpleRPG.tilegame.Handler;

public abstract class State {
	private static State currentState = null;
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	//CLASS
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
