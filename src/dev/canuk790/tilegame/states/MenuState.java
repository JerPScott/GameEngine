package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.audio.AudioPlayer;
import dev.canuk790.tilegame.gfx.Assets;

public class MenuState extends State{
	
	private boolean wave;	// boolean used for animation
	private int tickCount;	// counter used for animation
	private int selection;
	
	public MenuState(){
		wave = false;	
		tickCount = 0;	
		selection = 1;	// initialize selection to Start
	}
	
	@Override
	public void onOpen() {
		AudioPlayer.playSound(Assets.menuTheme);
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
		// draw a tree border and player figure
		if (wave){
			for (int i = 0; i < 20; i++){
				g.drawImage(Assets.playerLeft, 5*32, 2*32, null);
				g.drawImage(Assets.treeRightDark, i*32, 0*32, null);
				g.drawImage(Assets.treeRightDark, i*32, 14*32, null);
				g.drawImage(Assets.treeLeftDark, 0*32, i*32, null);
				g.drawImage(Assets.treeLeftDark, 19*32, i*32, null);
			}
		}else{
			for (int i = 0; i < 20; i++){
				g.drawImage(Assets.playerRight, 5*32, 2*32, null);
				g.drawImage(Assets.treeLeftDark, i*32, 0*32, null);
				g.drawImage(Assets.treeLeftDark, i*32, 14*32, null);
				g.drawImage(Assets.treeRightDark, 0*32, i*32, null);
				g.drawImage(Assets.treeRightDark, 19*32, i*32, null);
			}
		}
		// draw the buttons
		g.drawImage(Assets.buttonStart, 8*32, 7*32, null);
		g.drawImage(Assets.buttonSettings, 8*32, 10*32, null);
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
		Game.manageState(selection+1);
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
