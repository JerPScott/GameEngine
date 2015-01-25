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
	
	// Font
	public static BufferedImage[] font = new BufferedImage[48];
	
	/* Not needed right now
	// Numbers
	public static BufferedImage num_0, num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9;
	// Letters
	public static BufferedImage A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
	// Symbols
	public static BufferedImage symbPeriod, symbColon, symbExlamation, symbQuestion, symbLBracket, symbRBracket;
	*/
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		
		// crop all the tiles
		
		// player
		playerFront = 	sheet.crop(width*0, height*0, width, height);
		playerBack = 	sheet.crop(width*1, height*0, width, height);
		playerRight = 	sheet.crop(width*2, height*0, width, height);
		playerLeft = 	sheet.crop(width*3, height*0, width, height);
		
		// NPCs
		npcOld = 		sheet.crop(width*0, height*1, width, height);
		npcYellow = 	sheet.crop(width*1, height*1, width, height);
		npcBlue = 		sheet.crop(width*2, height*1, width, height);
		npcRed = 		sheet.crop(width*3, height*1, width, height);
		
		// player
		houseBig = 		sheet.crop(width*4, height*1, width, height);
		castleBig = 	sheet.crop(width*5, height*1, width, height);
		houseSmall = 	sheet.crop(width*6, height*1, width, height);
		castleSmall = 	sheet.crop(width*7, height*1, width, height);

		// light environments
		grassLight1 = 	sheet.crop(width*0, height*2, width, height);
		grassLight2 = 	sheet.crop(width*1, height*2, width, height);
		rockLight1 = 	sheet.crop(width*2, height*2, width, height);
		rockLight2 = 	sheet.crop(width*3, height*2, width, height);
		dirtLight1 = 	sheet.crop(width*4, height*2, width, height);
		dirtLight2 = 	sheet.crop(width*5, height*2, width, height);
		treeRightLight= sheet.crop(width*6, height*2, width, height);
		treeLeftLight = sheet.crop(width*7, height*2, width, height);
		
		// dark environments
		grassDark1 = 	sheet.crop(width*0, height*3, width, height);
		grassDark2 = 	sheet.crop(width*1, height*3, width, height);
		rockDark1 = 	sheet.crop(width*2, height*3, width, height);
		rockDark2 = 	sheet.crop(width*3, height*3, width, height);
		dirtDark1 = 	sheet.crop(width*4, height*3, width, height);
		dirtDark2 = 	sheet.crop(width*5, height*3, width, height);
		treeRightDark = sheet.crop(width*6, height*3, width, height);
		treeLeftDark = 	sheet.crop(width*7, height*3, width, height);
		
		// enemies
		snakeBrown = 	sheet.crop(width*0, height*4, width, height);
		snakeRed = 		sheet.crop(width*1, height*4, width, height);
		snakeBlue = 	sheet.crop(width*2, height*4, width, height);
		ratGrey = 		sheet.crop(width*3, height*4, width, height);
		ratBrown = 		sheet.crop(width*4, height*4, width, height);
		ratRed = 		sheet.crop(width*5, height*4, width, height);
		spiderBrown = 	sheet.crop(width*6, height*4, width, height);
		spiderBlack = 	sheet.crop(width*7, height*4, width, height);
		
		slimeGreen = 	sheet.crop(width*0, height*5, width, height);
		slimeOrange = 	sheet.crop(width*1, height*5, width, height);
		slimePurple = 	sheet.crop(width*2, height*5, width, height);
		slimeBlue = 	sheet.crop(width*3, height*5, width, height);
		
		// Coins
		coinMoney = 	sheet.crop(width*0, height*6, width, height);
		coinExp = 		sheet.crop(width*1, height*6, width, height);

		// Weapons
		swordBig = 		sheet.crop(width*2, height*6, width, height);
		swordSmall = 	sheet.crop(width*3, height*6, width, height);
		bow = 			sheet.crop(width*4, height*6, width, height);

		// Potions
		potionRed = 	sheet.crop(width*5, height*6, width, height);
		potionGreen = 	sheet.crop(width*6, height*6, width, height);
		potionBlue = 	sheet.crop(width*7, height*6, width, height);
		
		//doors
		doorClosed = 	sheet.crop(width*0, height*7, width, height);
		doorOpen = 		sheet.crop(width*1, height*7, width, height);
		doorLocked = 	sheet.crop(width*2, height*7, width, height);
		
		// chests
		chestLocked = 	sheet.crop(width*3, height*7, width, height);
		chestOpen = 	sheet.crop(width*4, height*7, width, height);
		chestClosed = 	sheet.crop(width*5, height*7, width, height);
		
		// Font
		for (int i = 0; i < 16; i++){
			for (int k = 0; k < 3; k++){
				font[i + k*16] = sheet.crop(width*i , height*(k+13), width, height);
			}
		}
		
	}
}
