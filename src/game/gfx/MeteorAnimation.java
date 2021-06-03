package game.gfx;

import java.awt.image.BufferedImage;

public class MeteorAnimation extends Animation {

	private boolean end = false;
	private boolean dealDamage = false;

	public MeteorAnimation(int speed, BufferedImage[] frames) {
		super(speed, frames);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed) {
			index++;
			timer = 0;
			if (index == 10)
				dealDamage = true;
			if (index == 18)
				dealDamage = false;
			if(index == frames.length)
				end = true;
		}
		
	}

	public boolean isEnd() {
		return end;
	}

	public boolean isDealDamage() {
		return dealDamage;
	}
	
}
