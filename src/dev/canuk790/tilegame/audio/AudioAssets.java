package dev.canuk790.tilegame.audio;

import java.io.File;

public class AudioAssets {
	
	/*Audio*/
	public static File menuTheme;
	public static File playerHit;
	
	public static void init(){
		
		/*Audio*/
		
		menuTheme = new File("res/audio/Menu_Theme_converted.wav").getAbsoluteFile();
		playerHit = new File("res/audio/playerHit.wav").getAbsoluteFile();

	}
}
