package dev.canuk790.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	// characters
	public static BufferedImage playerFront, playerBack, playerLeft, playerRight;
	// NPC tiles
	public static BufferedImage npcOld, npcYellow, npcBlue, npcRed;
	// Buildings tiles
	public static BufferedImage houseBig, castleBig, houseSmall, castleSmall;
	// Light environment tiles
	public static BufferedImage grassLight1, grassLight2, rockLight1, rockLight2, dirtLight1, dirtLight2, treeRightLight, treeLeftLight;
	// Dark environment tiles
	public static BufferedImage grassDark1, grassDark2, rockDark1, rockDark2, dirtDark1, dirtDark2, treeRightDark, treeLeftDark;
	// baddies tiles
	public static BufferedImage snakeBrown, snakeRed, snakeBlue, ratGrey, ratBrown, ratRed, spiderBrown, spiderBlack, slimeGreen, slimeOrange, slimePurple, slimeBlue;
	// collectables
	public static BufferedImage coinMoney, coinExp;
	// Weapons
	public static BufferedImage swordBig, swordSmall, bow;
	// Potions
	public static BufferedImage potionRed, potionGreen, potionBlue;
	// chests and doors
	public static BufferedImage chestLocked, chestOpen, chestClosed, doorClosed, doorOpen, doorLocked;

	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
		// crop all the tiles
		
		// player
		playerFront = sheet.crop(0, 0, width, height);
		playerBack = sheet.crop(width, 0, width, height);
		playerRight = sheet.crop(width*2, 0, width, height);
		playerLeft = sheet.crop(width*3, 0, width, height);
		
		// NPCs
		npcOld = sheet.crop(0, height, width, height);
		npcYellow = sheet.crop(width, height, width, height);
		npcBlue = sheet.crop(width*2, height, width, height);
		npcRed = sheet.crop(width*3, height, width, height);
		
		// player
		houseBig = sheet.crop(width*4, height, width, height);
		castleBig = sheet.crop(width*5, height, width, height);
		houseSmall = sheet.crop(width*6, height, width, height);
		castleSmall = sheet.crop(width*7, height, width, height);

		// light environments
		grassLight1 = sheet.crop(0, height*2, width, height);
		grassLight2 = sheet.crop(width, height*2, width, height);
		rockLight1 = sheet.crop(width*2, height*2, width, height);
		rockLight2 = sheet.crop(width*3, height*2, width, height);
		dirtLight1 = sheet.crop(width*4, height*2, width, height);
		dirtLight2 = sheet.crop(width*5, height*2, width, height);
		treeRightLight = sheet.crop(width*6, height*2, width, height);
		treeLeftLight = sheet.crop(width*7, height*2, width, height);
		
		// dark environments
		grassDark1 = sheet.crop(0, height*3, width, height);
		grassDark2 = sheet.crop(width, height*3, width, height);
		rockDark1 = sheet.crop(width*2, height*3, width, height);
		rockDark2 = sheet.crop(width*3, height*3, width, height);
		dirtDark1 = sheet.crop(width*4, height*3, width, height);
		dirtDark2 = sheet.crop(width*5, height*3, width, height);
		treeRightDark = sheet.crop(width*6, height*3, width, height);
		treeLeftDark = sheet.crop(width*7, height*3, width, height);
		
		// enemies
		snakeBrown = sheet.crop(0, height*4, width, height);
		snakeRed = sheet.crop(width, height*4, width, height);
		snakeBlue = sheet.crop(width*2, height*4, width, height);
		ratGrey = sheet.crop(width*3, height*4, width, height);
		ratBrown = sheet.crop(width*4, height*4, width, height);
		ratRed = sheet.crop(width*5, height*4, width, height);
		spiderBrown = sheet.crop(width*6, height*4, width, height);
		spiderBlack = sheet.crop(width*7, height*4, width, height);
		
		slimeGreen = sheet.crop(0, height*5, width, height);
		slimeOrange = sheet.crop(width, height*5, width, height);
		slimePurple = sheet.crop(width*2, height*5, width, height);
		slimeBlue = sheet.crop(width*3, height*5, width, height);
		
		// Coins
		coinMoney = sheet.crop(0, height*6, width, height);
		coinExp = sheet.crop(width, height*6, width, height);

		// Weapons
		swordBig = sheet.crop(width*2, height*6, width, height);
		swordSmall = sheet.crop(width*3, height*6, width, height);
		bow = sheet.crop(width*4, height*6, width, height);

		// Potions
		potionRed = sheet.crop(width*5, height*6, width, height);
		potionGreen = sheet.crop(width*6, height*6, width, height);
		potionBlue = sheet.crop(width*7, height*6, width, height);
		
		//doors
		doorClosed = sheet.crop(0, height*7, width, height);
		doorOpen = sheet.crop(width, height*7, width, height);
		doorLocked = sheet.crop(width*2, height*7, width, height);
		
		// chests
		chestLocked = sheet.crop(width*3, height*7, width, height);
		chestOpen = sheet.crop(width*4, height*7, width, height);
		chestClosed = sheet.crop(width*5, height*7, width, height);
		
	}
}
