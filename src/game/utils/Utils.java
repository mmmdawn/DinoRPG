package game.utils;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Utils {
	private static Random random = new Random();
	
	public static String loadFileAsString(String path)  {
		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while((line = br.readLine()) != null)
				builder.append(line +"\n");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return builder.toString();
		
	}
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}

	}
	
//	public static int getRandomInteger(float min, float max) {
//		return random.nextInt(max - min) + min;
//	}
	
	public static float getRandomFloat(float min, float max) {
		return (float) (Math.random() * (max - min) + min);
	}
}
