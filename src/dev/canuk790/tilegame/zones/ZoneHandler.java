package dev.canuk790.tilegame.zones;

public class ZoneHandler {
	
	//public Zone[][] zones = new Zone[3][3];
	public Zone testZone;
	private int[][] testTiles = new int[20][15];
	
	public ZoneHandler(){
		for (int[] i : testTiles){
			for (int k : i){
				k = 0;
			}
		}
		testZone = new Zone(testTiles, 0, 0, 0, 0);
	}
	
}
