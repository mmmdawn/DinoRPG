package game.state;

import java.awt.Graphics;

import game.Game;
import game.Handler;

public abstract class State {
	private static State currentState = null;

	protected Handler handler;
	
	public abstract void tick();
	public abstract void render(Graphics g);

	//CLASS
	
	public State(Handler handler) {
		this.handler = handler;
	}

	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
}
