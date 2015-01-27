package dev.canuk790.tilegame.gfx;

import java.awt.Graphics;

import dev.canuk790.tilegame.gfx.Assets;

public class MyFont {

	private static String chars = "" +
								"0123456789#     " +
								"ABCDEFGHIJKLMNOP" +
								"QRSTUVWXYZ.:!?()" ;
	
	public static void render(String msg, Graphics g, int x, int y) {
		msg = msg.toUpperCase();
		
		for(int i=0; i< msg.length(); i++){
			// Loops through the string given
			int charindex = chars.indexOf(msg.charAt(i)); // sets the index of that character in chars
			if (charindex >= 0){
				// draws that character if it is a valid character
				g.drawImage(Assets.font[charindex], x + i*32 - (i/20)*640, y + (i/20)*32, null);
				// Will only draw 20 characters on one line. Then moves to the next line.
			}
		}
	}
}
