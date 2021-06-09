package game.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FontLoader {
	public static Font loadFont(String path, float size){
		try {
			InputStream fileStream = FontLoader.class.getResourceAsStream(path);
			Font myFont = Font.createFont(Font.TRUETYPE_FONT, fileStream);
			return myFont.deriveFont(Font.PLAIN, size);
//			return Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(Font.PLAIN, size);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}