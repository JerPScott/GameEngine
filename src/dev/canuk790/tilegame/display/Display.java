package dev.canuk790.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	/* This class controls the display output of the game 
	 * with a JFrame */

	private JFrame frame;
	public Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height){
		// Display class constructor
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay(){
		// this method constructs the JFrame window
		frame = new JFrame(title);
		frame.setSize(width, height);							// sets window size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame will shut down when the program is ended
		frame.setResizable(false);								// user cannot resize window
		frame.setLocationRelativeTo(null);						// window will appear in the center of the screen
		frame.setVisible(true);									// makes the JFrame visible
		
		canvas = new Canvas();
		// ensure that the canvas will stay at the correct width and height
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		
		frame.add(canvas);
		frame.pack();
		// pack will slightly resize the window so that all of the canvas will be displayed
	}
	
	public Canvas getCanvas(){
		return canvas;
	}

}
