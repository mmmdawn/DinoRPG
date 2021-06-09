package game.gfx;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.utils.FontLoader;

public class Assets {
	public static final int NUMBER_OF_TILES = 10;
	
	public static Font font1, font2, font3, font4, font5;
	public static BufferedImage grass1, grass2, grass3, water, tomb, sand;
	public static BufferedImage tree1, tree2, tree3, tree4 ;
	public static BufferedImage rock1, rock2, rockitem, wooditem;
	public static BufferedImage[] playerIdleLeft, playerIdleRight, playerDown, playerUp, playerLeft, playerRight;
	public static BufferedImage[] meteor;
	public static BufferedImage[] button_play, button_exit, button_back;
	public static BufferedImage[] background;
	public static BufferedImage[] over;
	public static BufferedImage[] bestScore, score;
	public static BufferedImage[] coin;
	public static String world = "/worlds/world.txt";
	public static String world1 = "/worlds/world1.txt";
	public static String world2 = "/worlds/world2.txt";


	public static void init() {
		try {
			font1 = FontLoader.loadFont("/fonts/pixeboy.ttf", 28);
			font2 = FontLoader.loadFont("/fonts/pixeboy.ttf", 150);
			font3 = FontLoader.loadFont("/fonts/pixeboy.ttf", 90);
			font4 = FontLoader.loadFont("/fonts/pixeboy.ttf", 50);
			font5 = FontLoader.loadFont("/fonts/pixeboy.ttf", 50);
			button_play  = new BufferedImage[2];
			button_exit  = new BufferedImage[2];
			button_back  = new BufferedImage[2];
			background = new BufferedImage[6];
			bestScore = new BufferedImage[1];
			score = new BufferedImage[1];
			coin = new BufferedImage[16];
			over = new BufferedImage[1];

			playerUp = new BufferedImage[6];
			playerLeft = new BufferedImage[6];
			playerDown = new BufferedImage[6];
			playerRight = new BufferedImage[6];
			playerIdleLeft = new BufferedImage[4];
			playerIdleRight = new BufferedImage[4];

			meteor = new BufferedImage[21];

			bestScore[0] = ImageIO.read(new File("/ui/bestScore.png"));
			score[0] = ImageIO.read(new File("/ui/score.png"));
			over[0] = ImageIO.read(new File("/ui/over.png"));
			
			coin[0] = ImageIO.read(new File("/coin/coin0.png"));
			coin[1] = ImageIO.read(new File("/coin/coin1.png"));
			coin[2] = ImageIO.read(new File("/coin/coin2.png"));
			coin[3] = ImageIO.read(new File("/coin/coin3.png"));
			coin[4] = ImageIO.read(new File("/coin/coin4.png"));
			coin[5] = ImageIO.read(new File("/coin/coin5.png"));
			coin[6] = ImageIO.read(new File("/coin/coin6.png"));
			coin[7] = ImageIO.read(new File("/coin/coin7.png"));
			coin[8] = ImageIO.read(new File("/coin/coin8.png"));
			coin[9] = ImageIO.read(new File("/coin/coin9.png"));
			coin[10] = ImageIO.read(new File("/coin/coin10.png"));
			coin[11] = ImageIO.read(new File("/coin/coin11.png"));
			coin[12] = ImageIO.read(new File("/coin/coin12.png"));
			coin[13] = ImageIO.read(new File("/coin/coin13.png"));
			coin[14] = ImageIO.read(new File("/coin/coin14.png"));
			coin[15] = ImageIO.read(new File("/coin/coin15.png"));
			
			button_play[0] = ImageIO.read(new File("/ui/play1.png"));
			button_play[1] = ImageIO.read(new File("/ui/play2.png"));
			button_exit[0] = ImageIO.read(new File("/ui/exit1.png"));
			button_exit[1] = ImageIO.read(new File("/ui/exit2.png"));
			button_back[0] = ImageIO.read(new File("/ui/back0.png"));
			button_back[1] = ImageIO.read(new File("/ui/back1.png"));
			
			background[0] = ImageIO.read(new File("/ui/background1.png"));
			background[1] = ImageIO.read(new File("/ui/background2.png"));
			background[2] = ImageIO.read(new File("/ui/background3.png"));
			background[3] = ImageIO.read(new File("/ui/background4.png"));
			background[4] = ImageIO.read(new File("/ui/background5.png"));
			background[5] = ImageIO.read(new File("/ui/background6.png"));
			
			playerDown[0] = ImageIO.read(new File("/move/phai1.png"));
			playerDown[1] = ImageIO.read(new File("/move/phai2.png"));
			playerDown[2] = ImageIO.read(new File("/move/phai3.png"));
			playerDown[3] = ImageIO.read(new File("/move/phai4.png"));
			playerDown[4] = ImageIO.read(new File("/move/phai5.png"));
			playerDown[5] = ImageIO.read(new File("/move/phai6.png"));
			
			playerUp[0] = ImageIO.read(new File("/move/trai1.png"));
			playerUp[1] = ImageIO.read(new File("/move/trai2.png"));
			playerUp[2] = ImageIO.read(new File("/move/trai3.png"));
			playerUp[3] = ImageIO.read(new File("/move/trai4.png"));
			playerUp[4] = ImageIO.read(new File("/move/trai5.png"));
			playerUp[5] = ImageIO.read(new File("/move/trai6.png"));
			
			playerLeft[0] = ImageIO.read(new File("/move/trai1.png"));
			playerLeft[1] = ImageIO.read(new File("/move/trai2.png"));
			playerLeft[2] = ImageIO.read(new File("/move/trai3.png"));
			playerLeft[3] = ImageIO.read(new File("/move/trai4.png"));
			playerLeft[4] = ImageIO.read(new File("/move/trai5.png"));
			playerLeft[5] = ImageIO.read(new File("/move/trai6.png"));

			playerRight[0] = ImageIO.read(new File("/move/phai1.png"));
			playerRight[1] = ImageIO.read(new File("/move/phai2.png"));
			playerRight[2] = ImageIO.read(new File("/move/phai3.png"));
			playerRight[3] = ImageIO.read(new File("/move/phai4.png"));
			playerRight[4] = ImageIO.read(new File("/move/phai5.png"));
			playerRight[5] = ImageIO.read(new File("/move/phai6.png"));
			
			playerIdleRight[0] = ImageIO.read(new File("/move/idleRight1.png"));
			playerIdleRight[1] = ImageIO.read(new File("/move/idleRight2.png"));
			playerIdleRight[2] = ImageIO.read(new File("/move/idleRight3.png"));
			playerIdleRight[3] = ImageIO.read(new File("/move/idleRight4.png"));

			playerIdleLeft[0] = ImageIO.read(new File("/move/idleLeft1.png"));
			playerIdleLeft[1] = ImageIO.read(new File("/move/idleLeft2.png"));
			playerIdleLeft[2] = ImageIO.read(new File("/move/idleLeft3.png"));
			playerIdleLeft[3] = ImageIO.read(new File("/move/idleLeft4.png"));

			tomb = ImageIO.read(new File("/move/rip.png"));

			meteor[0] = ImageIO.read(new File("/meteor/meteor01.png"));
			meteor[1] = ImageIO.read(new File("/meteor/meteor02.png"));
			meteor[2] = ImageIO.read(new File("/meteor/meteor03.png"));
			meteor[3] = ImageIO.read(new File("/meteor/meteor04.png"));
			meteor[4] = ImageIO.read(new File("/meteor/meteor05.png"));
			meteor[5] = ImageIO.read(new File("/meteor/meteor06.png"));
			meteor[6] = ImageIO.read(new File("/meteor/meteor07.png"));
			meteor[7] = ImageIO.read(new File("/meteor/meteor08.png"));
			meteor[8] = ImageIO.read(new File("/meteor/meteor09.png"));
			meteor[9] = ImageIO.read(new File("/meteor/meteor10.png"));
			meteor[10] = ImageIO.read(new File("/meteor/meteor11.png"));
			meteor[11] = ImageIO.read(new File("/meteor/meteor12.png"));
			meteor[12] = ImageIO.read(new File("/meteor/meteor13.png"));
			meteor[13] = ImageIO.read(new File("/meteor/meteor14.png"));
			meteor[14] = ImageIO.read(new File("/meteor/meteor15.png"));
			meteor[15] = ImageIO.read(new File("/meteor/meteor16.png"));
			meteor[16] = ImageIO.read(new File("/meteor/meteor17.png"));
			meteor[17] = ImageIO.read(new File("/meteor/meteor18.png"));
			meteor[18] = ImageIO.read(new File("/meteor/meteor19.png"));
			meteor[19] = ImageIO.read(new File("/meteor/meteor20.png"));
			meteor[20] = ImageIO.read(new File("/meteor/meteor21.png"));
			
			//Tiles
			grass1 = ImageIO.read(new File("/textures/grass1.png"));
			grass2 = ImageIO.read(new File("/textures/grass2.png"));
			grass3 = ImageIO.read(new File("/textures/grass3.png"));
			water = ImageIO.read(new File("/textures/water.png"));
			sand = ImageIO.read(new File("/textures/sand.png"));
			
			//static Entities
			tree1 = ImageIO.read(new File("/textures/tree1.png"));
			tree2 = ImageIO.read(new File("/textures/tree2.png"));
			tree3 = ImageIO.read(new File("/textures/tree3.png"));
			tree4 = ImageIO.read(new File("/textures/tree4.png"));
			rock1 = ImageIO.read(new File("/textures/rock1.png"));
			rock2 = ImageIO.read(new File("/textures/rock2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
