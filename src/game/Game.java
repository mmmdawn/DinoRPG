package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.IOException;

import game.display.Display;
import game.gfx.Assets;
import game.gfx.GameCamera;
import game.input.KeyManager;
import game.input.MouseManager;
import game.state.GameOverState;
import game.state.GameState;
import game.state.MenuState;
import game.state.State;

public class Game implements Runnable{

	private BufferStrategy bufferStrategy;
	private boolean running = false;
	private int width, height;
	private GameInfo gameInfo;
	private Graphics graphic;
	private Display display;
	private Thread thread;
	private String title;
	
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	private GameCamera gameCamera;
	
	private Handler handler;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();		
	}
	
	private void init() {
		try {
			gameInfo = new GameInfo(handler);
		} catch (IOException e) {
			e.printStackTrace();
		}

		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);

		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);
		State.setState(new MenuState(handler));
		
	}
	
	private void tick() {
		keyManager.tick();
		gameInfo.tick();
		if(State.getState() != null)
			State.getState().tick();
	};
	
	private void render() {
		bufferStrategy = display.getCanvas().getBufferStrategy();
		if(bufferStrategy == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		graphic = bufferStrategy.getDrawGraphics();
		graphic.clearRect(0, 0, width, height);
		
		if(State.getState() != null)
			State.getState().render(graphic);
		bufferStrategy.show();
		graphic.dispose();
	}

	@Override
	public void run() {
		init();
		int fps = 60;
		double timePerTick = (double)1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime)/timePerTick;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				delta--;
			}
		}
		stop();
	}
	
	public synchronized void start() {
		if(running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running) return;
		running = false; 
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		    Thread.currentThread().interrupt();
		}
	}
	
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	
	public MouseManager getMouseManager() {
		return mouseManager;
	}
	
	public  GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public GameInfo getGameInfo() {
		return this.gameInfo;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
