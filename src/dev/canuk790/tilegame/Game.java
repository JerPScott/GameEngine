package dev.canuk790.tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.canuk790.tilegame.display.Display;
import dev.canuk790.tilegame.entities.creatures.Player;
import dev.canuk790.tilegame.gfx.Assets;
import dev.canuk790.tilegame.states.GameState;
import dev.canuk790.tilegame.states.MenuState;
import dev.canuk790.tilegame.states.SettingsState;
import dev.canuk790.tilegame.states.State;

public class Game implements Runnable{

	/* this is the main game engine class
	 * and is responsible for the control
	 * of the game. 
	 */
	
	private Display display;
	public int width, height, scale;
	public String title;
	
	public InputHandler input;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	// States
	// note: has to be declared as state but initialized as game state
	// -> from extends State.
	private static State menuState;
	private static State settingsState;
	private static State gameState;
	
	public Game(String title, int width, int height, int scale){
		this.width = width;
		this.height = height;
		this.title = title;
		this.scale = scale;
	}
	
	private void init(){		
		// initializes graphics
		display = new Display(title, width*scale, height*scale);
		Assets.init();
		
		input = new InputHandler(display.canvas);
		
		menuState = new MenuState();
		settingsState = new SettingsState();
		gameState = new GameState();
		State.setState(menuState);
	}
	
	public static void manageState(int selection){
		// starts up a new state by calling Sate.setState() 
		// this is used so that all the state managing comes through Game
		switch (selection){
		case(0): State.setState(menuState);
		case(1): State.setState(settingsState);
		case(2): State.setState(gameState);
		}
	}
	
	private void tick(){
		// updates the values or "state" of the game
		if(State.getState() != null)
			State.getState().tick();
	}
	
	private void render(){
		
		// produces the visuals of the game
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			// if there is no buffer strategy set up, set up a 3 buffer buffer strategy
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();	// used to draw things on the canvas
		
		// clear screen
		g.clearRect(0, 0, width*scale, height*scale);	// clears a portion of the screen
		// Draw here
		
		if(State.getState() != null)
			State.getState().render(g);
		
		// End draw
		
		bs.show();		// tells the computer to go ahead with the buffer strategy
		g.dispose();	// takes care of the graphics object
	}
	
	public void run(){
		init();
		
		// variables to control tick rate
		int fps = 60;							// amount of times to tick and render per second
		double timePerTick = 1000000000/fps;
		double delta = 0;						// time between ticks and renders
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if (delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if (timer >= 1000000000){
				System.out.println("Ticks and frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
	}	
	
	public synchronized void start(){
		// synchronized helps with stability when working directly with threads
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
