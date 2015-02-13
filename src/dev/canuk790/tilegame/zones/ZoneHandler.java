package dev.canuk790.tilegame.zones;

import dev.canuk790.tilegame.entities.creatures.Player;

public class ZoneHandler {
	
	private Zone[][] zones = new Zone[3][3]; //must be square (well doesn't have to be but then other code needs to be changed... keep it square)
	private Zone activeZone;
	
	private int zoneIndexX, zoneIndexY, playerX, playerY;
	
	boolean[][] blockedCodes = new boolean[20][15];
	int[][] imageCodes = new int[20][15];
	
	public ZoneHandler(){
		
		for (int i=0; i<20; i++){
			for(int k=0; k<15; k++){
				
				imageCodes[i][k]= 1;
				
				//block all outer tiles
				if ((i==0)||(i==19)||(k==0)||(k==14)){
					blockedCodes[i][k] = true;
					imageCodes[i][k] = 8;
				}else{
					blockedCodes[i][k] = false;
				}
			}
		}
		
		imageCodes[0][7]= 1;
		blockedCodes[0][7] = false;
		imageCodes[19][7]= 1;
		blockedCodes[19][7] = false;
		imageCodes[10][0]= 1;
		blockedCodes[10][0] = false;
		imageCodes[10][14]= 1;
		blockedCodes[10][14] = false;
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				zones[i][j] = new Zone(imageCodes, blockedCodes, 1);
			}
		}
		
		zoneIndexX = 0;
		zoneIndexY = 2;
		activeZone = zones[zoneIndexX][zoneIndexY];
		
		//for debugging
		System.out.println(activeZone.isBlocked);
	}
	
	public void switchZone(Player player){
		playerX = player.getX();
		playerY = player.getY();
		// activeZone = new activeZone based on where player is
		assert playerX != playerY;
		if ((playerX == 0) && (zoneIndexX > 0)){
			zoneIndexX--;
			player.setX(18*32);
		}else if ((playerX == 19*32) && (zoneIndexX < 2)){
			zoneIndexX++;
			player.setX(1*32);
		}else if ((playerY == 0) && (zoneIndexY > 0)){
			zoneIndexY--;
			player.setY(13*32);
		}else if ((playerY == 14*32) && (zoneIndexY < 2)){
			zoneIndexY++;
			player.setY(1*32);
		}
		System.out.println(zoneIndexX);
		System.out.println(zoneIndexY);
		activeZone = zones[zoneIndexX][zoneIndexY];
	}
	
	public Zone getActiveZone(){
		return activeZone;
	}
	
}
