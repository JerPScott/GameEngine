package dev.canuk790.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.canuk790.tilegame.entities.Entity;
import dev.canuk790.tilegame.zones.Zone;

public abstract class Creature extends Entity{
	
	protected int health;
	protected float deltaX, deltaY; // for movement

	public Creature(int x, int y, BufferedImage texture) {
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
			x += Math.signum(deltaX)*16;
			y += Math.signum(deltaY)*16;
			
			deltaX -= Math.signum(deltaX)*16;
			deltaY -= Math.signum(deltaY)*16;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(texture, x, y, null);
		// x and y values from entity class (creature extends entity)
	}
	
	// methods for setting pending movement of the creature
	public void moveLeft(Zone activeZone){
		if (x%32==0 && y%32==0 && x>0*32 && !(activeZone.isBlocked[x/32 - 1][y/32])) // if creature is in a tile, move creature one tile 
			deltaX = -32;
	}
	
	public void moveRight(Zone activeZone){
		if (x%32==0 && y%32==0 && x<19*32 && !(activeZone.isBlocked[x/32 + 1][y/32])) // if creature is in a tile, move creature one tile 
			deltaX = 32;
	}

	public void moveUp(Zone activeZone){
		if (x%32==0 && y%32==0 && y>0*32 && !(activeZone.isBlocked[x/32][y/32 - 1])) // if creature is in a tile, move creature one tile 
			deltaY = -32;
	}

	public void moveDown(Zone activeZone){
		if (x%32==0 && y%32==0 && y<14*32 && !(activeZone.isBlocked[x/32][y/32 + 1])) // if creature is in a tile, move creature one tile 
			deltaY = 32;
	}
	
	public void interact(Zone activeZone){
		
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int playerX){
		x = playerX;
	}
	
	public void setY(int playerY){
		y = playerY;
	}

}
