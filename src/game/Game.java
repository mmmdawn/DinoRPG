package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import game.display.Display;
import game.gfx.Assets;
import game.gfx.GameCamera;
import game.input.KeyManager;
import game.input.MouseManager;
import game.state.GameState;
import game.state.MenuState;
import game.state.State;

public class Game implements Runnable{

	private Display display;
	private String title;
	private int width, height;
	private boolean running = false;
	private Thread thread;
	private BufferStrategy bufferStrategy;
	private Graphics graphic;
	
	//State
	public State gameState;
	public State menuState;
	
	//input
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();
		
	}
	
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);

		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);
		
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		State.setState(menuState);
		
	}
	
	private void tick() {
		keyManager.tick();
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
		// Clear Screen
		graphic.clearRect(0, 0, width, height);
		
		//Draw here
		if(State.getState() != null)
			State.getState().render(graphic);
		//End Drawing!
		bufferStrategy.show();
		graphic.dispose();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		init();
		
		int fps = 60;
		double timePerTick = 1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime)/timePerTick;
			timer += now - lastTime;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				ticks++;
				delta--;
			}
			if(timer >= 1000000000 ) {
//				System.out.println("Ticks and Frames:" + ticks );
				ticks = 0;
				timer = 0;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Display getDisplay() {
		return display;
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
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
