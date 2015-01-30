package dev.canuk790.tilegame;

import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import dev.canuk790.tilegame.states.State;

public class InputHandler implements KeyListener {
	
	public InputHandler(Canvas canvas){
		canvas.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
        case KeyEvent.VK_SPACE:
        	// call object methods that happen when key is pressed
        	System.out.println("SPACEBAR");
        	State.getState().inputSpace();
        	break;
        case KeyEvent.VK_LEFT:
        	// call object methods that happen when key is pressed
        	System.out.println("LEFT");
        	State.getState().inputLeft();
        	break;
        case KeyEvent.VK_RIGHT:
        	// call object methods that happen when key is pressed
        	System.out.println("RIGHT");
        	State.getState().inputRight();
        	break;
        case KeyEvent.VK_UP:
        	// call object methods that happen when key is pressed
        	System.out.println("UP");
        	State.getState().inputUp();
        	break;
        case KeyEvent.VK_DOWN:
        	// call object methods that happen when key is pressed
        	System.out.println("DOWN");
        	State.getState().inputDown();
        	break;
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
	
	
	/* This is the handling strategy to be used if the game needs
	 * to understand a held down button. For now I will use a 
	 * handling strategy that does a predefined action on a key
	 * being pressed.

	public class Key {
		// creates a key class to store whether a key is pressed and 
		// gives a method to access that information.
		
		private boolean pressed = false;
		
		public boolean isPressed(){
			return pressed;
		}
		
		public void toggle(boolean isPressed){
			pressed = isPressed;
		}
	}
	
	// define keys to be used in the game
	public Key up = new Key();
	public Key down = new Key();
	public Key left = new Key();
	public Key right = new Key();
	public Key space = new Key();
	
	private void toggleKey(int keyCode, boolean isPressed){
		// presses and unpresses the key objects
		switch(keyCode){
        case KeyEvent.VK_SPACE:
        	// call object methods that happen when key is pressed
            space.toggle(isPressed);
        	break;
        case KeyEvent.VK_LEFT:
        	// call object methods that happen when key is pressed
        	left.toggle(isPressed);
        	break;
        case KeyEvent.VK_RIGHT:
        	// call object methods that happen when key is pressed
        	right.toggle(isPressed);
        	break;
        case KeyEvent.VK_UP:
        	// call object methods that happen when key is pressed
        	up.toggle(isPressed);
        	break;
        case KeyEvent.VK_DOWN:
        	// call object methods that happen when key is pressed
        	down.toggle(isPressed);
        	break;
		}
	}
	
	public void keyPressed(KeyEvent e) {
		toggleKey(e.getKeyCode(), true);
	}

	public void keyReleased(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}

	public void keyTyped(KeyEvent e) {
	}
	
	*/

}
