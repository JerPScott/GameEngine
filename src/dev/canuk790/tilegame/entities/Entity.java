package dev.canuk790.tilegame.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Entity {
	
	// protected means accessible from this class and classes that extend it
	protected float x, y; 
	protected BufferedImage texture;
	
	public Entity(float x, float y, BufferedImage texture){
		this.x = x;
		this.y = y;
		this.texture = texture;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);

}
