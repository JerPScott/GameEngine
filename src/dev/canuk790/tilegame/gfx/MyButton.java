package dev.canuk790.tilegame.gfx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyButton {
	
	public static void drawButton(String string, Graphics g, int x, int y){
		g.drawImage(Assets.buttonBlank, x, y, null);
		g.setColor(Color.YELLOW);	// warning this will change the color of g. so if that will need to be maintained it needs a holder variable
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g.drawString(string, x + 4*32/2 - string.length()*5, y + 2*32/2); // change the string.length()*5 to an accurate string draw length with font metrics.
	}

}
