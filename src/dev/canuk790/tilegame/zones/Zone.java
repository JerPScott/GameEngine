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
	private BufferedImage defaultTile1, defaultTile2;
	
	// An array that holds a 0 for an open space and a 1 for a blocked space
	// spaces that are blocked cannot contain another entity
	public boolean[][] isBlocked = new boolean[20][15];
	
	private int difficulty, x, y;
	
	public Zone(int[][] imageCodes, boolean[][] blockedCodes, int type, int d){
		
		difficulty = d;
		
		// set the default tile
		//
		// 1 == beach
		// 2 == forest
		// 3 == grassland
		// 4 == mountain
		// 5 == town
		// 6 == cave
		//
		switch (type){
		case 1: //beach
			defaultTile1 = Assets.dirtLight1;
			defaultTile2 = Assets.dirtLight2;
			break;
		case 2: //forest
			defaultTile1 = Assets.grassDark1;
			defaultTile2 = Assets.grassDark2;
			break;
		case 3: //grassland
			defaultTile1 = Assets.grassLight1;
			defaultTile2 = Assets.grassLight2;
			break;
		case 4: //mountain
			defaultTile1 = Assets.rockLight1;
			defaultTile2 = Assets.rockLight2;
			break;
		case 5: //town
			defaultTile1 = Assets.dirtLight1;
			defaultTile2 = Assets.dirtLight2;
			break;
		case 6: //cave
			defaultTile1 = Assets.rockDark1;
			defaultTile2 = Assets.rockDark2;
			break;
		}
		
		for (int i=0; i<20; i++){
			for(int k=0; k<15; k++){
				
				// build the array of images to be drawn upon entering the zone
				//
				// 1 == light grass
				// 2 == dark grass
				// 3 == light rock
				// 4 == dark rock
				// 5 == light dirt/sand
				//
				switch (imageCodes[i][k]){
					case 0:
						if (Math.random() < 0.8){
							background[i][k] = defaultTile1;
						}else{
							background[i][k] = defaultTile2;
						}
						break;
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
				}
				
				//block all outer tiles
				if ((i==0)||(i==19)||(k==0)||(k==14)){
					isBlocked[i][k] = true;
				}else{
					isBlocked[i][k] = false;
				}
				
				if (blockedCodes[i][k]){
					isBlocked = blockedCodes;
				}
				
				if (isBlocked[i][k]){
					if (type == 1 || type == 6){
						if (Math.random() < 0.8){
							background[i][k] = Assets.water1;
						}else{
							background[i][k] = Assets.water2;
						}
					}else{
						if (Math.random() < 0.5){
							background[i][k] = Assets.treeLeftDark;
						}else{
							background[i][k] = Assets.treeRightDark;
						}
					}
				}
				
			}
		}
		
		background[0][7]= defaultTile1;
		isBlocked[0][7] = false;
		background[19][7]= defaultTile1;
		isBlocked[19][7] = false;
		background[10][0]= defaultTile1;
		isBlocked[10][0] = false;
		background[10][14]= defaultTile1;
		isBlocked[10][14] = false;
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
