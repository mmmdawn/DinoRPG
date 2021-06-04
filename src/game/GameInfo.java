package game;

public class GameInfo {
	private int bestScore = 0;
	private int score = 0;
	private int difficulty = 0;
	public GameInfo(Handler handler) {
		// TODO Auto-generated constructor stub
		score = 0;
	}
	
	public void tick() {
		if (score > bestScore) {
			bestScore = score;
		}
	}
	
	public int getBestScore() {
		return bestScore;
	}
	public void setBestScore(int bestScore) {
		this.bestScore = bestScore;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	
}
