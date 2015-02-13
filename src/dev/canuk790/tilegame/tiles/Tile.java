package dev.canuk790.tilegame.tiles;

import java.awt.image.BufferedImage;

public class Tile {
	
	public final BufferedImage texture;
	public final boolean isBlocked;
	
	public Tile(BufferedImage t, boolean B){
		texture = t;
		isBlocked = B;
	}

}
