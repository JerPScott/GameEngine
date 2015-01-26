package dev.canuk790.tilegame.audio;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {
	
	private static Clip clip;
	
	public AudioPlayer(){
		
	}

	public static void playSound(File song) {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(song);
	        clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.loop(clip.LOOP_CONTINUOUSLY);
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	public static void stopSound(){
		clip.close();
	}
}
