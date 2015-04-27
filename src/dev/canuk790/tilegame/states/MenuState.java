package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.audio.AudioAssets;
import dev.canuk790.tilegame.audio.AudioPlayer;
import dev.canuk790.tilegame.gfx.Assets;
import dev.canuk790.tilegame.gfx.MyButton;

public class MenuState extends State{
	
	private int selection;
	
	public MenuState(){
		selection = 1;	// initialize selection to Start
	}
	
	@Override
	public void onOpen() {
		AudioPlayer.playSound(AudioAssets.menuTheme);
	}
	
	public void onClose(){
		AudioPlayer.stopSound();
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics g) {
		// draw the buttons
		MyButton.drawButton("Start", g, 8*32, 7*32);
		MyButton.drawButton("Settings", g, 8*32, 10*32);
		// draw the coin to show which button is selected
		if (selection == 0){
			g.drawImage(Assets.coinMoney, 6*32, 10*32, null);
		}
		if (selection == 1){
			g.drawImage(Assets.coinMoney, 6*32, 7*32, null);
		}

	}
	
	private void launchState(){
		// launch the state that is selected
		if (selection == 0){
			// launch game
			Game.manageState(1);
		}else if (selection == 1){
			// launch settings
			Game.manageState(2);
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
		launchState();
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
