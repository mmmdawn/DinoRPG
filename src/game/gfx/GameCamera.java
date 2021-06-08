package game.gfx;

import game.Handler;
import game.entities.Entity;
import game.tiles.Tile;

public class GameCamera {
	private float xOffset, yOffset;
	private Handler handler;

	public GameCamera(Handler handler, float xOffset, float yOffset) {
		this.handler = handler;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
	public void fixEdgePosition() {
		if(xOffset < 0) {
			xOffset = 0;
		}else if(xOffset > handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth()) {
			xOffset = (float) handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth();
		}
		if(yOffset < 0) {
			yOffset = 0;
		}else if(yOffset > handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight()) {
			yOffset = (float) handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight();
		}
	}
	public void setCameraPosition(Entity e) {
		xOffset = e.getX() -handler.getWidth()/2f + e.getWidth()/2f;
		yOffset = e.getY() - handler.getHeight()/2f + e.getHeight()/2f;
		fixEdgePosition();
	}
	public void move(float xAmt, float yAmt) {
		xOffset += xAmt;
		yOffset += yAmt;
		fixEdgePosition();
	}


	public float getxOffset() {
		return xOffset;
	}

	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}

	public float getyOffset() {
		return yOffset;
	}

	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
}
