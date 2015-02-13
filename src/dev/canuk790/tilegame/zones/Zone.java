package dev.canuk790.tilegame.zones;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.canuk790.tilegame.gfx.Assets;

public class Zone {
	/* 
	 * Zones will hold the information for drawing each screen or zone that the player can explore.
	 * They will also hole information for collision and items/enemies/etc
	 * 
	 * Think about making different types of zones have different game mechanics. 
	 * (mountains caves dessert swap plains forest)
	 * 
	*/
	
	// Holds the buffered images to draw the zone background
	private BufferedImage[][] background = new BufferedImage[20][15];
	
	// An array that holds a 0 for an open space and a 1 for a blocked space
	// spaces that are blocked cannot contain another entity
	public boolean[][] isBlocked = new boolean[20][15];
	
	private int difficulty, x, y;
	
	public Zone(int[][] imageCodes, boolean[][] blockedCodes, int d){
		
		difficulty = d;
		
		for (int i=0; i<20; i++){
			for(int k=0; k<15; k++){
				
				// set the blocked tiles
				isBlocked = blockedCodes;
				
				// build the array of images to be drawn upon entering the zone
				//
				// 1 == light grass
				// 2 == dark grass
				// 3 == light rock
				// 4 == dark rock
				// 5 == light dirt/sand
				// 6 == water
				//
				switch (imageCodes[i][k]){
					case 1:
						if (Math.random() < 0.8){
							background[i][k] = Assets.grassLight1;
						}else{
							background[i][k] = Assets.grassLight2;
						}
						break;
					case 2:
						if (Math.random() < 0.8){
							background[i][k] = Assets.grassDark1;
						}else{
							background[i][k] = Assets.grassDark2;
						}
						break;
					case 3:
						if (Math.random() < 0.8){
							background[i][k] = Assets.rockLight1;
						}else{
							background[i][k] = Assets.rockLight2;
						}
						break;
					case 4:
						if (Math.random() < 0.8){
							background[i][k] = Assets.rockDark1;
						}else{
							background[i][k] = Assets.rockDark2;
						}
						break;
					case 5:
						if (Math.random() < 0.8){
							background[i][k] = Assets.dirtLight1;
						}else{
							background[i][k] = Assets.dirtLight2;
						}
						break;
					case 6:
						if (Math.random() < 0.8){
							background[i][k] = Assets.water1;
						}else{
							background[i][k] = Assets.water2;
						}
						break;
					case 7:
						if (Math.random() < 0.5){
							background[i][k] = Assets.treeLeftLight;
						}else{
							background[i][k] = Assets.treeRightLight;
						}
						break;
					case 8:
						if (Math.random() < 0.5){
							background[i][k] = Assets.treeLeftDark;
						}else{
							background[i][k] = Assets.treeRightDark;
						}
						break;
				}
			}
		}
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		x = 0;
		for (BufferedImage[] v : background){
			y = 0;
			for (BufferedImage I : v){
				g.drawImage(I, x*32, y*32, null);
				y++;
			}
			x++;
		}
	}
	
}
