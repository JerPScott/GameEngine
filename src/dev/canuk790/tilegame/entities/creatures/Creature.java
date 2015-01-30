package dev.canuk790.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.canuk790.tilegame.entities.Entity;

public abstract class Creature extends Entity{
	
	protected int health;
	protected float deltaX, deltaY; // for movement

	public Creature(float x, float y, BufferedImage texture) {
		super(x, y, texture);
		deltaX = 0;
		deltaY = 0;
		health = 10;
	}
	
	@Override
	public void tick() {
		// update the texture depending on movement once key listener has implemented
		// Note: Very happy with how this movement looks and feels
		if (!(deltaX==0) || !(deltaY==0)){
			x += Math.signum(deltaX);
			y += Math.signum(deltaY);
			
			deltaX -= Math.signum(deltaX);
			deltaY -= Math.signum(deltaY);
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(texture, (int) x, (int) y, null);
		// x and y values from entity class (creature extends entity)
	}
	
	// methods for setting pending movement of the creature
	public void moveLeft(){
		if (x%32==0 && y%32==0) // if creature is in a tile, move creature one tile 
			deltaX = -32;
	}
	
	public void moveRight(){
		if (x%32==0 && y%32==0) // if creature is in a tile, move creature one tile 
			deltaX = 32;
	}

	public void moveUp(){
		if (x%32==0 && y%32==0) // if creature is in a tile, move creature one tile 
			deltaY = -32;
	}

	public void moveDown(){
		if (x%32==0 && y%32==0) // if creature is in a tile, move creature one tile 
			deltaY = 32;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}

}
