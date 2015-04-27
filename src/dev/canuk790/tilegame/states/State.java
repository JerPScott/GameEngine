package dev.canuk790.tilegame.states;

import java.awt.Graphics;

public abstract class State {

	private static State currentState = null;
	
	public static void setState(State state){
		// state setter
		currentState = state;
	}
	
	public static State getState(){
		// state getter
		return currentState;
	}
	
	// called when switching to state
	public abstract void onOpen();
	//called when leaving state
	public abstract void onClose();
	
	// called by main game loop on a cycle
	public abstract void tick();
	public abstract void render(Graphics g);
	
	// input handling passed to states by InputHandler
	public abstract void inputSpace();
	public abstract void inputEnter();
	public abstract void inputLeft();
	public abstract void inputRight();
	public abstract void inputUp();
	public abstract void inputDown();
	
}
