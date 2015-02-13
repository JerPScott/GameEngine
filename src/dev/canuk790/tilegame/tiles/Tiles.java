package dev.canuk790.tilegame.tiles;

import dev.canuk790.tilegame.gfx.Assets;

public class Tiles {
	
	public static Tile grassLight1Tile;
	public static Tile grassLight2Tile;
	
	public static Tile grassDark1Tile;
	public static Tile grassDark2Tile;
	
	public static Tile rockLight1Tile;
	public static Tile rockLight2Tile;
	
	public static Tile rockDark1Tile;
	public static Tile rockDark2Tile;
	
	public static Tile dirtLight1Tile;
	public static Tile dirtLight2Tile;
	
	public static Tile treeLightLeftTile;
	public static Tile treeLightRightTile;
	
	public static Tile treeDarkLeftTile;
	public static Tile treeDarkRightTile;
	
	public static Tile water1Tile;
	public static Tile water2Tile;
	
	public static void init(){
		
		grassLight1Tile = new Tile(Assets.grassLight1, false);
		grassLight2Tile = new Tile(Assets.grassLight2, false);
		
		grassDark1Tile = new Tile(Assets.grassDark1, false);
		grassDark2Tile = new Tile(Assets.grassDark2, false);
		
		rockLight1Tile = new Tile(Assets.rockLight1, false);
		rockLight2Tile = new Tile(Assets.rockLight2, false);
		
		rockDark1Tile = new Tile(Assets.rockDark1, false);
		rockDark2Tile = new Tile(Assets.rockDark2, false);
		
		dirtLight1Tile = new Tile(Assets.dirtLight1, false);
		dirtLight2Tile = new Tile(Assets.dirtLight2, false);
		
		treeLightLeftTile = new Tile(Assets.treeLeftLight, true);
		treeLightRightTile = new Tile(Assets.treeRightLight, true);
		
		treeDarkLeftTile = new Tile(Assets.treeLeftDark, true);
		treeDarkRightTile = new Tile(Assets.treeRightDark, true);
		
		water1Tile = new Tile(Assets.water1, true);
		water2Tile = new Tile(Assets.water2, true);
	
	}

}
