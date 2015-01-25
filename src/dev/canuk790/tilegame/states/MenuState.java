package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.audio.AudioPlayer;
import dev.canuk790.tilegame.gfx.Assets;

public class MenuState extends State{
	
	private boolean wave;
	private int tickCount;
	
	public MenuState(){
		wave = false;
		tickCount = 0;
		AudioPlayer.playSound();
	}
	
	public void onClose(){
		AudioPlayer.stopSound();
	}

	@Override
	public void tick() {
		tickCount++;
		if (tickCount > 29){
			wave = !wave;
			tickCount = 0;
		}
	}

	@Override
	public void render(Graphics g) {
		// draw a grass background
		for (int i = 0; i < 20; i++){
			for (int k = 0; k < 15; k++){
				g.drawImage(Assets.grassLight1, i*32, k*32, null);
			}
		}
		// draw a tree border
		if (wave){
			for (int i = 0; i < 20; i++){
				g.drawImage(Assets.treeRightDark, i*32, 0*32, null);
				g.drawImage(Assets.treeRightDark, i*32, 14*32, null);
				g.drawImage(Assets.treeLeftDark, 0*32, i*32, null);
				g.drawImage(Assets.treeLeftDark, 19*32, i*32, null);
			}
		}else{
			for (int i = 0; i < 20; i++){
				g.drawImage(Assets.treeLeftDark, i*32, 0*32, null);
				g.drawImage(Assets.treeLeftDark, i*32, 14*32, null);
				g.drawImage(Assets.treeRightDark, 0*32, i*32, null);
				g.drawImage(Assets.treeRightDark, 19*32, i*32, null);
			}
		}
		// draw the player
		g.drawImage(Assets.playerFront, 5*32, 2*32, null);
		// draw the buttons
		g.drawImage(Assets.buttonStart, 8*32, 7*32, null);
		g.drawImage(Assets.buttonSettings, 8*32, 10*32, null);

	}

	@Override
	public void inputSpace() {
		
	}

	@Override
	public void inputLeft() {
		
	}

	@Override
	public void inputRight() {
		
	}

	@Override
	public void inputUp() {
		
	}

	@Override
	public void inputDown() {
		
	}

}
