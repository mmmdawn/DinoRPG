package game.state;

public class StateManager {
	private State currentState = null;
	public StateManager() {
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	public State getState() {
		return this.currentState;
	}
}
