package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.gfx.MyFont;

public class GameOverState extends State{

	@Override
	public void onOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		MyFont.render("Game Over!", g, 5*32, 6*32);
	}

	@Override
	public void inputSpace() {
		// TODO Auto-generated method stub
		Game.manageState(0);
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

}
