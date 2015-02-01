package dev.canuk790.tilegame.zones;

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
	public BufferedImage[][] background = new BufferedImage[20][15];
	
	// An array that holds a 0 for an open space and a 1 for a blocked space
	// spaces that are blocked cannot contain another entity
	public Boolean[][] isBlocked = new Boolean[20][15];
	
	public Zone(int[][] imageCodes, int passageLeft, int passageRight, int passageUp, int passageDown){
		
		for (int i=0; i<20; i++){
			for(int k=0; k<15; k++){
				//block all outer tiles
				if ((i==0)||(i==19)||(k==0)||(k==14)){
					isBlocked[i][k] = true; 
				}else{
					isBlocked[i][k] = false;
				}
				// build the array of images to be drawn upon entering the zone
				switch (imageCodes[i][k]){
					case 0:
						if (Math.random() < 0.5){
							background[i][k] = Assets.grassLight1;
						}else{
							background[i][k] = Assets.grassLight2;
						}
						break;
					case 1:
						if (Math.random() < 0.5){
							background[i][k] = Assets.grassDark1;
						}else{
							background[i][k] = Assets.grassDark2;
						}
						break;
					case 2:
						if (Math.random() < 0.5){
							background[i][k] = Assets.rockLight1;
						}else{
							background[i][k] = Assets.rockLight2;
						}
						break;
					case 3:
						if (Math.random() < 0.5){
							background[i][k] = Assets.rockDark1;
						}else{
							background[i][k] = Assets.rockDark2;
						}
						break;
					case 4:
						if (Math.random() < 0.5){
							background[i][k] = Assets.dirtLight1;
						}else{
							background[i][k] = Assets.dirtLight2;
						}
						break;
					case 5:
						if (Math.random() < 0.5){
							background[i][k] = Assets.dirtDark1;
						}else{
							background[i][k] = Assets.dirtDark2;
						}
						break;
					case 6:
						if (Math.random() < 0.5){
							background[i][k] = Assets.treeRightLight;
						}else{
							background[i][k] = Assets.treeLeftLight;
						}
						break;
					case 7:
						if (Math.random() < 0.5){
							background[i][k] = Assets.treeRightDark;
						}else{
							background[i][k] = Assets.treeLeftDark;
						}
						break;
				}
			}
		}
		
		// unblock the space that the player can walk through to get to the next stage
		isBlocked[0][passageLeft] = false;
		isBlocked[19][passageRight] = false;
		isBlocked[passageUp][0] = false;
		isBlocked[passageDown][14] = false;
	}
}
