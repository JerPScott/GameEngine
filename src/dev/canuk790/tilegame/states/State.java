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
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	// input handling by states
	public abstract void inputSpace();
	public abstract void inputLeft();
	public abstract void inputRight();
	public abstract void inputUp();
	public abstract void inputDown();
	
}
