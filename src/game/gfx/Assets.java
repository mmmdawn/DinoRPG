package game.gfx;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Assets {
	
//	private static final int width = 64, height = 64;

	public static Font font28;
	public static BufferedImage dirt, grass, brick, water, tree1, tree2, tree3, tree4, tree5, monster, rock1, rock2, rockitem, wooditem, cungitem, buaitem, chuyitem;
	public static BufferedImage[] playerIdleRight, playerDown, playerUp, playerLeft, playerRight, attack_down, attack_up, attack_left, attack_right;
	public static BufferedImage[] meteor;
	public static BufferedImage[] quai1_phai, quai1_trai;
	public static BufferedImage[] quai2_phai, quai2_trai; 
	public static BufferedImage[] quai3_phai, quai3_trai;
	public static BufferedImage[] quai4_phai, quai4_trai;
	public static BufferedImage[] quai5_phai, quai5_trai;
	public static BufferedImage[] btn_start;
	public static BufferedImage[] background;

	public static void init() {
		try {
			font28 = FontLoader.loadFont("res/fonts/slkscr.ttf", 28);
			
			playerDown = new BufferedImage[6];
			playerUp = new BufferedImage[6];
			playerLeft = new BufferedImage[6];
			playerRight = new BufferedImage[6];
			attack_down = new BufferedImage[4];
			attack_up = new BufferedImage[4];
			attack_right = new BufferedImage[4];
			attack_left = new BufferedImage[4];
			
			meteor = new BufferedImage[21];
			
			quai1_phai = new BufferedImage[1];
			quai1_trai = new BufferedImage[1];
			
			quai2_phai = new BufferedImage[4];
			quai2_trai = new BufferedImage[4];

			quai3_phai = new BufferedImage[5];
			quai3_trai = new BufferedImage[5];

			quai4_phai = new BufferedImage[5];
			quai4_trai = new BufferedImage[5];
			
			quai5_phai = new BufferedImage[5];
			quai5_trai = new BufferedImage[5];
			
			playerIdleRight = new BufferedImage[4];
			btn_start  = new BufferedImage[2];
			background = new BufferedImage[1];
			
			btn_start[0] = ImageIO.read(new File("res/textures/start.png"));
			btn_start[1] = ImageIO.read(new File("res/textures/start2.png"));
			background[0] = ImageIO.read(new File("res/textures/background.png"));
			
			quai1_phai[0] = ImageIO.read(new File("res/monster/doge.png"));
			quai1_trai[0] = ImageIO.read(new File("res/monster/doge.png"));
			
			quai2_phai[0] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_phai[1] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_phai[2] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_phai[3] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_trai[0] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_trai[1] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_trai[2] = ImageIO.read(new File("res/monster/doge.png"));
			quai2_trai[3] = ImageIO.read(new File("res/monster/doge.png"));

			
			
			quai3_phai[0] = ImageIO.read(new File("res/monster/quai3/phai1.png"));
			quai3_phai[1] = ImageIO.read(new File("res/monster/quai3/phai2.png"));
			quai3_phai[2] = ImageIO.read(new File("res/monster/quai3/phai3.png"));
			quai3_phai[3] = ImageIO.read(new File("res/monster/quai3/phai4.png"));
			quai3_phai[4] = ImageIO.read(new File("res/monster/quai3/phai5.png"));
			quai3_trai[0] = ImageIO.read(new File("res/monster/quai3/trai1.png"));
			quai3_trai[1] = ImageIO.read(new File("res/monster/quai3/trai2.png"));
			quai3_trai[2] = ImageIO.read(new File("res/monster/quai3/trai3.png"));
			quai3_trai[3] = ImageIO.read(new File("res/monster/quai3/trai4.png"));
			quai3_trai[4] = ImageIO.read(new File("res/monster/quai3/trai5.png"));
			
			quai4_phai[0] = ImageIO.read(new File("res/monster/quai4/phai1.png"));
			quai4_phai[1] = ImageIO.read(new File("res/monster/quai4/phai2.png"));
			quai4_phai[2] = ImageIO.read(new File("res/monster/quai4/phai3.png"));
			quai4_phai[3] = ImageIO.read(new File("res/monster/quai4/phai4.png"));
			quai4_phai[4] = ImageIO.read(new File("res/monster/quai4/phai5.png"));
			quai4_trai[0] = ImageIO.read(new File("res/monster/quai4/trai1.png"));
			quai4_trai[1] = ImageIO.read(new File("res/monster/quai4/trai2.png"));
			quai4_trai[2] = ImageIO.read(new File("res/monster/quai4/trai3.png"));
			quai4_trai[3] = ImageIO.read(new File("res/monster/quai4/trai4.png"));
			quai4_trai[4] = ImageIO.read(new File("res/monster/quai4/trai5.png"));
			
			quai5_phai[0] = ImageIO.read(new File("res/monster/quai5/phai1.png"));
			quai5_phai[1] = ImageIO.read(new File("res/monster/quai5/phai2.png"));
			quai5_phai[2] = ImageIO.read(new File("res/monster/quai5/phai3.png"));
			quai5_phai[3] = ImageIO.read(new File("res/monster/quai5/phai4.png"));
			quai5_phai[4] = ImageIO.read(new File("res/monster/quai5/phai5.png"));
			quai5_trai[0] = ImageIO.read(new File("res/monster/quai5/trai1.png"));
			quai5_trai[1] = ImageIO.read(new File("res/monster/quai5/trai2.png"));
			quai5_trai[2] = ImageIO.read(new File("res/monster/quai5/trai3.png"));
			quai5_trai[3] = ImageIO.read(new File("res/monster/quai5/trai4.png"));
			quai5_trai[4] = ImageIO.read(new File("res/monster/quai5/trai5.png"));


			
			
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

			attack_down[0] = ImageIO.read(new File("res/danhquai/truoc1.png"));
			attack_down[1] = ImageIO.read(new File("res/danhquai/truoc2.png"));
			attack_down[2] = ImageIO.read(new File("res/danhquai/truoc3.png"));
			attack_down[3] = ImageIO.read(new File("res/danhquai/truoc4.png"));

			attack_right[0] = ImageIO.read(new File("res/danhquai/phai2.png"));
			attack_right[1] = ImageIO.read(new File("res/danhquai/phai3.png"));
			attack_right[2] = ImageIO.read(new File("res/danhquai/phai4.png"));
			attack_right[3] = ImageIO.read(new File("res/danhquai/phai1.png"));
			
			attack_left[0] = ImageIO.read(new File("res/danhquai/trai1.png"));
			attack_left[1] = ImageIO.read(new File("res/danhquai/trai2.png"));
			attack_left[2] = ImageIO.read(new File("res/danhquai/trai3.png"));
			attack_left[3] = ImageIO.read(new File("res/danhquai/trai4.png"));
			
			playerIdleRight[0] = ImageIO.read(new File("res/dichuyen/idle1.png"));
			playerIdleRight[1] = ImageIO.read(new File("res/dichuyen/idle2.png"));
			playerIdleRight[2] = ImageIO.read(new File("res/dichuyen/idle3.png"));
			playerIdleRight[3] = ImageIO.read(new File("res/dichuyen/idle4.png"));

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
			buaitem = ImageIO.read(new File("res/textures/bua.png"));
			chuyitem = ImageIO.read(new File("res/textures/chuy.png"));
			cungitem = ImageIO.read(new File("res/textures/cung.png"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
