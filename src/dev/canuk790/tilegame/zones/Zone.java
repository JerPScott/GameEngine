package dev.canuk790.tilegame.zones;

import java.awt.Graphics;

public abstract class Zone {
	/* 
	 * Zones will hold the information for drawing each screen or zone that the player can explore.
	 * They will also hole information for collision and items/enemies/etc
	 * 
	 * Think about making different types of zones have different game mechanics. 
	 * (mountains caves dessert swap plains forest)
	*/
	
	// ticking and rendering
	public abstract void tick();
	public abstract void render(Graphics g);
}
