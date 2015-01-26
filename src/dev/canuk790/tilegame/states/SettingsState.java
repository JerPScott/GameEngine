package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;

public class SettingsState extends State{
	
	public SettingsState(){
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputSpace() {
		Game.manageState(0);	// for now space exits back to menu		
	}

	@Override
	public void inputLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClose() {
		// TODO Auto-generated method stub
		
	}

}
