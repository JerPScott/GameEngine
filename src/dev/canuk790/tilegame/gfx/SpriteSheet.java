package dev.canuk790.tilegame.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet){
		this.sheet = sheet;
	}
	
	public BufferedImage crop(int x, int y, int width, int height){
		// sprite sheet has tiles of 32 by 32
		// therefore width and height will usually be 32
		// also, x and y will be multiples of 32
		
		return sheet.getSubimage(x, y, width, height);
	}
}
