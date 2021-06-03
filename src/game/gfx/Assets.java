package game.gfx;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Assets {
	
//	private static final int width = 64, height = 64;

	public static Font font1, font2;
	public static BufferedImage dirt, grass, brick, water;
	public static BufferedImage tree1, tree2, tree3, tree4, tree5;
	public static BufferedImage rock1, rock2, rockitem, wooditem;
	public static BufferedImage[] playerIdleLeft, playerIdleRight, playerDown, playerUp, playerLeft, playerRight;
	public static BufferedImage[] meteor;
	public static BufferedImage[] button_play, button_exit;
	public static BufferedImage[] background;
	public static BufferedImage[] coin;


	public static void init() {
		try {
			font1 = FontLoader.loadFont("res/fonts/slkscr.ttf", 28);
			font2 = FontLoader.loadFont("res/fonts/slkscr.ttf", 40);
			button_play  = new BufferedImage[2];
			button_exit  = new BufferedImage[2];
			background = new BufferedImage[6];
			coin = new BufferedImage[16];

			playerDown = new BufferedImage[6];
			playerUp = new BufferedImage[6];
			playerLeft = new BufferedImage[6];
			playerRight = new BufferedImage[6];
			playerIdleRight = new BufferedImage[4];
			playerIdleLeft = new BufferedImage[4];

			meteor = new BufferedImage[21];
			
			coin[0] = ImageIO.read(new File("res/coin/coin0.png"));
			coin[1] = ImageIO.read(new File("res/coin/coin1.png"));
			coin[2] = ImageIO.read(new File("res/coin/coin2.png"));
			coin[3] = ImageIO.read(new File("res/coin/coin3.png"));
			coin[4] = ImageIO.read(new File("res/coin/coin4.png"));
			coin[5] = ImageIO.read(new File("res/coin/coin5.png"));
			coin[6] = ImageIO.read(new File("res/coin/coin6.png"));
			coin[7] = ImageIO.read(new File("res/coin/coin7.png"));
			coin[8] = ImageIO.read(new File("res/coin/coin8.png"));
			coin[9] = ImageIO.read(new File("res/coin/coin9.png"));
			coin[10] = ImageIO.read(new File("res/coin/coin10.png"));
			coin[11] = ImageIO.read(new File("res/coin/coin11.png"));
			coin[12] = ImageIO.read(new File("res/coin/coin12.png"));
			coin[13] = ImageIO.read(new File("res/coin/coin13.png"));
			coin[14] = ImageIO.read(new File("res/coin/coin14.png"));
			coin[15] = ImageIO.read(new File("res/coin/coin15.png"));
			
			button_play[0] = ImageIO.read(new File("res/ui/play1.png"));
			button_play[1] = ImageIO.read(new File("res/ui/play2.png"));
			button_exit[0] = ImageIO.read(new File("res/ui/exit1.png"));
			button_exit[1] = ImageIO.read(new File("res/ui/exit2.png"));

			background[0] = ImageIO.read(new File("res/ui/background1.png"));
			background[1] = ImageIO.read(new File("res/ui/background2.png"));
			background[2] = ImageIO.read(new File("res/ui/background3.png"));
			background[3] = ImageIO.read(new File("res/ui/background4.png"));
			background[4] = ImageIO.read(new File("res/ui/background5.png"));
			background[5] = ImageIO.read(new File("res/ui/background6.png"));
			
			playerDown[0] = ImageIO.read(new File("res/dichuyen/phai1.png"));
			playerDown[1] = ImageIO.read(new File("res/dichuyen/phai2.png"));
			playerDown[2] = ImageIO.read(new File("res/dichuyen/phai3.png"));
			playerDown[3] = ImageIO.read(new File("res/dichuyen/phai4.png"));
			playerDown[4] = ImageIO.read(new File("res/dichuyen/phai5.png"));
			playerDown[5] = ImageIO.read(new File("res/dichuyen/phai6.png"));
			
			playerUp[0] = ImageIO.read(new File("res/dichuyen/trai1.png"));
			playerUp[1] = ImageIO.read(new File("res/dichuyen/trai2.png"));
			playerUp[2] = ImageIO.read(new File("res/dichuyen/trai3.png"));
			playerUp[3] = ImageIO.read(new File("res/dichuyen/trai4.png"));
			playerUp[4] = ImageIO.read(new File("res/dichuyen/trai5.png"));
			playerUp[5] = ImageIO.read(new File("res/dichuyen/trai6.png"));
			
			playerLeft[0] = ImageIO.read(new File("res/dichuyen/trai1.png"));
			playerLeft[1] = ImageIO.read(new File("res/dichuyen/trai2.png"));
			playerLeft[2] = ImageIO.read(new File("res/dichuyen/trai3.png"));
			playerLeft[3] = ImageIO.read(new File("res/dichuyen/trai4.png"));
			playerLeft[4] = ImageIO.read(new File("res/dichuyen/trai5.png"));
			playerLeft[5] = ImageIO.read(new File("res/dichuyen/trai6.png"));

			playerRight[0] = ImageIO.read(new File("res/dichuyen/phai1.png"));
			playerRight[1] = ImageIO.read(new File("res/dichuyen/phai2.png"));
			playerRight[2] = ImageIO.read(new File("res/dichuyen/phai3.png"));
			playerRight[3] = ImageIO.read(new File("res/dichuyen/phai4.png"));
			playerRight[4] = ImageIO.read(new File("res/dichuyen/phai5.png"));
			playerRight[5] = ImageIO.read(new File("res/dichuyen/phai6.png"));
			
			playerIdleRight[0] = ImageIO.read(new File("res/dichuyen/idleRight1.png"));
			playerIdleRight[1] = ImageIO.read(new File("res/dichuyen/idleRight2.png"));
			playerIdleRight[2] = ImageIO.read(new File("res/dichuyen/idleRight3.png"));
			playerIdleRight[3] = ImageIO.read(new File("res/dichuyen/idleRight4.png"));

			playerIdleLeft[0] = ImageIO.read(new File("res/dichuyen/idleLeft1.png"));
			playerIdleLeft[1] = ImageIO.read(new File("res/dichuyen/idleLeft2.png"));
			playerIdleLeft[2] = ImageIO.read(new File("res/dichuyen/idleLeft3.png"));
			playerIdleLeft[3] = ImageIO.read(new File("res/dichuyen/idleLeft4.png"));

			meteor[0] = ImageIO.read(new File("res/meteor/meteor01.png"));
			meteor[1] = ImageIO.read(new File("res/meteor/meteor02.png"));
			meteor[2] = ImageIO.read(new File("res/meteor/meteor03.png"));
			meteor[3] = ImageIO.read(new File("res/meteor/meteor04.png"));
			meteor[4] = ImageIO.read(new File("res/meteor/meteor05.png"));
			meteor[5] = ImageIO.read(new File("res/meteor/meteor06.png"));
			meteor[6] = ImageIO.read(new File("res/meteor/meteor07.png"));
			meteor[7] = ImageIO.read(new File("res/meteor/meteor08.png"));
			meteor[8] = ImageIO.read(new File("res/meteor/meteor09.png"));
			meteor[9] = ImageIO.read(new File("res/meteor/meteor10.png"));
			meteor[10] = ImageIO.read(new File("res/meteor/meteor11.png"));
			meteor[11] = ImageIO.read(new File("res/meteor/meteor12.png"));
			meteor[12] = ImageIO.read(new File("res/meteor/meteor13.png"));
			meteor[13] = ImageIO.read(new File("res/meteor/meteor14.png"));
			meteor[14] = ImageIO.read(new File("res/meteor/meteor15.png"));
			meteor[15] = ImageIO.read(new File("res/meteor/meteor16.png"));
			meteor[16] = ImageIO.read(new File("res/meteor/meteor17.png"));
			meteor[17] = ImageIO.read(new File("res/meteor/meteor18.png"));
			meteor[18] = ImageIO.read(new File("res/meteor/meteor19.png"));
			meteor[19] = ImageIO.read(new File("res/meteor/meteor20.png"));
			meteor[20] = ImageIO.read(new File("res/meteor/meteor21.png"));
			
			dirt = ImageIO.read(new File("res/textures/dirt.png"));
			grass = ImageIO.read(new File("res/textures/grass.png"));
			brick = ImageIO.read(new File("res/textures/brick.png"));
			water = ImageIO.read(new File("res/textures/water.png"));
			tree1 = ImageIO.read(new File("res/textures/cay.png"));
			tree2 = ImageIO.read(new File("res/textures/cay2.png"));
			tree3 = ImageIO.read(new File("res/textures/cay3.png"));
			tree4 = ImageIO.read(new File("res/textures/cay4.png"));
			tree5 = ImageIO.read(new File("res/textures/cay5.png"));
			rock1 = ImageIO.read(new File("res/textures/rock1.png"));
			rock2 = ImageIO.read(new File("res/textures/rock2.png"));
			rockitem = ImageIO.read(new File("res/textures/rockitem.png"));
			wooditem = ImageIO.read(new File("res/textures/wooditem.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
