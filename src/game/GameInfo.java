package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GameInfo {
	private int difficulty = 0;
	private int bestScore = 0;
	private int score = 0;
	File file = new File("data.bin");
	FileReader fileReader;
	FileWriter fileWriter;

	public GameInfo(Handler handler) throws IOException {
		score = 0;
		
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			file.createNewFile();
			fileWriter = new FileWriter(file);
			fileReader = new FileReader(file);
			fileWriter.write(score);
			fileWriter.close();
		} finally {
			bestScore = fileReader.read();
			fileReader.close();
		}
	}
	
	public void tick() {
		if (score > bestScore) {
			bestScore = score;
		}
	}
	
	public void writeBestScore() throws IOException {
			fileWriter = new FileWriter(file);
			fileWriter.write(bestScore);
			fileWriter.close();
	}
	
	public int getBestScore() {
		return bestScore;
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
