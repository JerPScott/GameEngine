package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.audio.AudioAssets;
import dev.canuk790.tilegame.audio.AudioPlayer;
import dev.canuk790.tilegame.gfx.Assets;
import dev.canuk790.tilegame.gfx.MyButton;

public class SettingsState extends State{
	
	private boolean wave;	// boolean used for animation
	private int tickCount;	// counter used for animation
	private int selection;
	
	public SettingsState(){
		wave = false;	
		tickCount = 0;	
		selection = 0;	// initialize selection to Start
	}
	
	@Override
	public void onOpen() {
		AudioPlayer.playSound(AudioAssets.menuTheme);
		selection = 0;
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
		// draw the buttons
		MyButton.drawButton("Menu", g, 8*32, 7*32);
		MyButton.drawButton("Sound", g, 8*32, 10*32);
		// draw the coin to show which button is selected
		if (selection == 0){
			g.drawImage(Assets.coinMoney, 6*32, 10*32, null);
		}
		if (selection == 1){
			g.drawImage(Assets.coinMoney, 6*32, 7*32, null);
		}
	}
	
	private void launchState(int selection){
		// launch the state that is selected
		if (selection == 0){
			if(AudioPlayer.isOn){
				AudioPlayer.stopSound();
				AudioPlayer.isOn = !AudioPlayer.isOn;
			}else if (!AudioPlayer.isOn){
				AudioPlayer.isOn = !AudioPlayer.isOn;
				AudioPlayer.playSound(AudioAssets.menuTheme);
			}
		}else if (selection == 1){
			Game.manageState(0);
		}
	}
	
	private void toggleState(){
		if (selection == 0){
			selection = 1;
		}else if (selection == 1){
			selection = 0;
		}
	}

	@Override
	public void inputSpace() {
		launchState(selection);
	}
	
	@Override
	public void inputEnter() {
	}

	@Override
	public void inputLeft() {
		toggleState();
	}

	@Override
	public void inputRight() {
		toggleState();
	}

	@Override
	public void inputUp() {
		toggleState();
	}

	@Override
	public void inputDown() {
		toggleState();
	}

}
