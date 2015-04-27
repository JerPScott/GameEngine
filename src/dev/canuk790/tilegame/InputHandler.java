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
        case KeyEvent.VK_ENTER:
        	// call object methods that happen when key is pressed
        	System.out.println("ENTER");
        	State.getState().inputEnter();
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
	
}
