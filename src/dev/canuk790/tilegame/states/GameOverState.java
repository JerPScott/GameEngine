package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.gfx.MyFont;

public class GameOverState extends State{

	@Override
	public void onOpen() {
	}

	@Override
	public void onClose() {
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics g) {
		MyFont.render("Game Over!", g, 5*32, 6*32);
	}

	@Override
	public void inputSpace() {
		Game.manageState(0);
	}
	
	@Override
	public void inputEnter() {
		Game.manageState(0);
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
