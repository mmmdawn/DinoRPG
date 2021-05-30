package Game.SimpleRPG.tilegame.gfx;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Assets {
	
	private static final int width = 64, height = 64;

	public static Font font28;
	public static BufferedImage dirt, grass, brick, house, water, tree1, tree2, tree3, tree4, tree5, bird, monster, house2, house3, house4, rock1, rock2, rockitem, wooditem, cungitem, buaitem, chuyitem;
	public static BufferedImage inventoryScreen;
	public static BufferedImage[] player, player_down, player_up, player_left, player_right, attack_down, attack_up, attack_left, attack_right;
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
			SpriteSheet sheet = new SpriteSheet(ImageIO.read(new File("res/textures/entities1.png")));
			
			player_down = new BufferedImage[6];
			player_up = new BufferedImage[6];
			player_left = new BufferedImage[6];
			player_right = new BufferedImage[6];
			attack_down = new BufferedImage[4];
			attack_up = new BufferedImage[4];
			attack_right = new BufferedImage[4];
			attack_left = new BufferedImage[4];
			
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
			
			player = new BufferedImage[4];
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


			
			
			player_down[0] = ImageIO.read(new File("res/dichuyen/phai1.png"));
			player_down[1] = ImageIO.read(new File("res/dichuyen/phai2.png"));
			player_down[2] = ImageIO.read(new File("res/dichuyen/phai3.png"));
			player_down[3] = ImageIO.read(new File("res/dichuyen/phai4.png"));
			player_down[4] = ImageIO.read(new File("res/dichuyen/phai5.png"));
			player_down[5] = ImageIO.read(new File("res/dichuyen/phai6.png"));
			
			player_up[0] = ImageIO.read(new File("res/dichuyen/trai1.png"));
			player_up[1] = ImageIO.read(new File("res/dichuyen/trai2.png"));
			player_up[2] = ImageIO.read(new File("res/dichuyen/trai3.png"));
			player_up[3] = ImageIO.read(new File("res/dichuyen/trai4.png"));
			player_up[4] = ImageIO.read(new File("res/dichuyen/trai5.png"));
			player_up[5] = ImageIO.read(new File("res/dichuyen/trai6.png"));
			
			player_left[0] = ImageIO.read(new File("res/dichuyen/trai1.png"));
			player_left[1] = ImageIO.read(new File("res/dichuyen/trai2.png"));
			player_left[2] = ImageIO.read(new File("res/dichuyen/trai3.png"));
			player_left[3] = ImageIO.read(new File("res/dichuyen/trai4.png"));
			player_left[4] = ImageIO.read(new File("res/dichuyen/trai5.png"));
			player_left[5] = ImageIO.read(new File("res/dichuyen/trai6.png"));

			player_right[0] = ImageIO.read(new File("res/dichuyen/phai1.png"));
			player_right[1] = ImageIO.read(new File("res/dichuyen/phai2.png"));
			player_right[2] = ImageIO.read(new File("res/dichuyen/phai3.png"));
			player_right[3] = ImageIO.read(new File("res/dichuyen/phai4.png"));
			player_right[4] = ImageIO.read(new File("res/dichuyen/phai5.png"));
			player_right[5] = ImageIO.read(new File("res/dichuyen/phai6.png"));

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
			
			player[0] = ImageIO.read(new File("res/dichuyen/idle1.png"));
			player[1] = ImageIO.read(new File("res/dichuyen/idle2.png"));
			player[2] = ImageIO.read(new File("res/dichuyen/idle3.png"));
			player[3] = ImageIO.read(new File("res/dichuyen/idle4.png"));

			
			dirt = sheet.crop(0, height, width, height);
			grass = ImageIO.read(new File("res/textures/grass.png"));
			brick = ImageIO.read(new File("res/textures/brick.png"));
			house = ImageIO.read(new File("res/textures/house.png"));
			house2 = ImageIO.read(new File("res/textures/house2.png"));
			house3 = ImageIO.read(new File("res/textures/house3.png"));
			house4 = ImageIO.read(new File("res/textures/house4.png"));
			water = ImageIO.read(new File("res/textures/water.png"));
			tree1 = ImageIO.read(new File("res/textures/cay.png"));
			tree2 = ImageIO.read(new File("res/textures/cay2.png"));
			tree3 = ImageIO.read(new File("res/textures/cay3.png"));
			tree4 = ImageIO.read(new File("res/textures/cay4.png"));
			tree5 = ImageIO.read(new File("res/textures/cay5.png"));
			bird = ImageIO.read(new File("res/textures/bird.png"));
			rock1 = ImageIO.read(new File("res/textures/rock1.png"));
			rock2 = ImageIO.read(new File("res/textures/rock2.png"));
			rockitem = ImageIO.read(new File("res/textures/rockitem.png"));
			wooditem = ImageIO.read(new File("res/textures/wooditem.png"));
			buaitem = ImageIO.read(new File("res/textures/bua.png"));
			chuyitem = ImageIO.read(new File("res/textures/chuy.png"));
			cungitem = ImageIO.read(new File("res/textures/cung.png"));
			inventoryScreen = ImageIO.read(new File("res/textures/inventoryScreen.png"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
