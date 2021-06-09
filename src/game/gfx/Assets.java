package game.gfx;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.utils.FontLoader;
import game.utils.ImageLoader;

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

			bestScore[0] = ImageLoader.loadImage("/ui/bestScore.png");
			score[0] = ImageLoader.loadImage("/ui/score.png");
			over[0] = ImageLoader.loadImage("/ui/over.png");
			
			coin[0] = ImageLoader.loadImage("/coin/coin0.png");
			coin[1] = ImageLoader.loadImage("/coin/coin1.png");
			coin[2] = ImageLoader.loadImage("/coin/coin2.png");
			coin[3] = ImageLoader.loadImage("/coin/coin3.png");
			coin[4] = ImageLoader.loadImage("/coin/coin4.png");
			coin[5] = ImageLoader.loadImage("/coin/coin5.png");
			coin[6] = ImageLoader.loadImage("/coin/coin6.png");
			coin[7] = ImageLoader.loadImage("/coin/coin7.png");
			coin[8] = ImageLoader.loadImage("/coin/coin8.png");
			coin[9] = ImageLoader.loadImage("/coin/coin9.png");
			coin[10] = ImageLoader.loadImage("/coin/coin10.png");
			coin[11] = ImageLoader.loadImage("/coin/coin11.png");
			coin[12] = ImageLoader.loadImage("/coin/coin12.png");
			coin[13] = ImageLoader.loadImage("/coin/coin13.png");
			coin[14] = ImageLoader.loadImage("/coin/coin14.png");
			coin[15] = ImageLoader.loadImage("/coin/coin15.png");
			
			button_play[0] = ImageLoader.loadImage("/ui/play1.png");
			button_play[1] = ImageLoader.loadImage("/ui/play2.png");
			button_exit[0] = ImageLoader.loadImage("/ui/exit1.png");
			button_exit[1] = ImageLoader.loadImage("/ui/exit2.png");
			button_back[0] = ImageLoader.loadImage("/ui/back0.png");
			button_back[1] = ImageLoader.loadImage("/ui/back1.png");
			
			background[0] = ImageLoader.loadImage("/ui/background1.png");
			background[1] = ImageLoader.loadImage("/ui/background2.png");
			background[2] = ImageLoader.loadImage("/ui/background3.png");
			background[3] = ImageLoader.loadImage("/ui/background4.png");
			background[4] = ImageLoader.loadImage("/ui/background5.png");
			background[5] = ImageLoader.loadImage("/ui/background6.png");
			
			playerDown[0] = ImageLoader.loadImage("/move/phai1.png");
			playerDown[1] = ImageLoader.loadImage("/move/phai2.png");
			playerDown[2] = ImageLoader.loadImage("/move/phai3.png");
			playerDown[3] = ImageLoader.loadImage("/move/phai4.png");
			playerDown[4] = ImageLoader.loadImage("/move/phai5.png");
			playerDown[5] = ImageLoader.loadImage("/move/phai6.png");
			
			playerUp[0] = ImageLoader.loadImage("/move/trai1.png");
			playerUp[1] = ImageLoader.loadImage("/move/trai2.png");
			playerUp[2] = ImageLoader.loadImage("/move/trai3.png");
			playerUp[3] = ImageLoader.loadImage("/move/trai4.png");
			playerUp[4] = ImageLoader.loadImage("/move/trai5.png");
			playerUp[5] = ImageLoader.loadImage("/move/trai6.png");
			
			playerLeft[0] = ImageLoader.loadImage("/move/trai1.png");
			playerLeft[1] = ImageLoader.loadImage("/move/trai2.png");
			playerLeft[2] = ImageLoader.loadImage("/move/trai3.png");
			playerLeft[3] = ImageLoader.loadImage("/move/trai4.png");
			playerLeft[4] = ImageLoader.loadImage("/move/trai5.png");
			playerLeft[5] = ImageLoader.loadImage("/move/trai6.png");

			playerRight[0] = ImageLoader.loadImage("/move/phai1.png");
			playerRight[1] = ImageLoader.loadImage("/move/phai2.png");
			playerRight[2] = ImageLoader.loadImage("/move/phai3.png");
			playerRight[3] = ImageLoader.loadImage("/move/phai4.png");
			playerRight[4] = ImageLoader.loadImage("/move/phai5.png");
			playerRight[5] = ImageLoader.loadImage("/move/phai6.png");
			
			playerIdleRight[0] = ImageLoader.loadImage("/move/idleRight1.png");
			playerIdleRight[1] = ImageLoader.loadImage("/move/idleRight2.png");
			playerIdleRight[2] = ImageLoader.loadImage("/move/idleRight3.png");
			playerIdleRight[3] = ImageLoader.loadImage("/move/idleRight4.png");

			playerIdleLeft[0] = ImageLoader.loadImage("/move/idleLeft1.png");
			playerIdleLeft[1] = ImageLoader.loadImage("/move/idleLeft2.png");
			playerIdleLeft[2] = ImageLoader.loadImage("/move/idleLeft3.png");
			playerIdleLeft[3] = ImageLoader.loadImage("/move/idleLeft4.png");

			tomb = ImageLoader.loadImage("/move/rip.png");

			meteor[0] = ImageLoader.loadImage("/meteor/meteor01.png");
			meteor[1] = ImageLoader.loadImage("/meteor/meteor02.png");
			meteor[2] = ImageLoader.loadImage("/meteor/meteor03.png");
			meteor[3] = ImageLoader.loadImage("/meteor/meteor04.png");
			meteor[4] = ImageLoader.loadImage("/meteor/meteor05.png");
			meteor[5] = ImageLoader.loadImage("/meteor/meteor06.png");
			meteor[6] = ImageLoader.loadImage("/meteor/meteor07.png");
			meteor[7] = ImageLoader.loadImage("/meteor/meteor08.png");
			meteor[8] = ImageLoader.loadImage("/meteor/meteor09.png");
			meteor[9] = ImageLoader.loadImage("/meteor/meteor10.png");
			meteor[10] = ImageLoader.loadImage("/meteor/meteor11.png");
			meteor[11] = ImageLoader.loadImage("/meteor/meteor12.png");
			meteor[12] = ImageLoader.loadImage("/meteor/meteor13.png");
			meteor[13] = ImageLoader.loadImage("/meteor/meteor14.png");
			meteor[14] = ImageLoader.loadImage("/meteor/meteor15.png");
			meteor[15] = ImageLoader.loadImage("/meteor/meteor16.png");
			meteor[16] = ImageLoader.loadImage("/meteor/meteor17.png");
			meteor[17] = ImageLoader.loadImage("/meteor/meteor18.png");
			meteor[18] = ImageLoader.loadImage("/meteor/meteor19.png");
			meteor[19] = ImageLoader.loadImage("/meteor/meteor20.png");
			meteor[20] = ImageLoader.loadImage("/meteor/meteor21.png");
			
			//Tiles
			grass1 = ImageLoader.loadImage("/textures/grass1.png");
			grass2 = ImageLoader.loadImage("/textures/grass2.png");
			grass3 = ImageLoader.loadImage("/textures/grass3.png");
			water = ImageLoader.loadImage("/textures/water.png");
			sand = ImageLoader.loadImage("/textures/sand.png");
			
			//static Entities
			tree1 = ImageLoader.loadImage("/textures/tree1.png");
			tree2 = ImageLoader.loadImage("/textures/tree2.png");
			tree3 = ImageLoader.loadImage("/textures/tree3.png");
			tree4 = ImageLoader.loadImage("/textures/tree4.png");
			rock1 = ImageLoader.loadImage("/textures/rock1.png");
			rock2 = ImageLoader.loadImage("/textures/rock2.png");
	}
}
