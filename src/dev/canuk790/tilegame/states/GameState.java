package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.entities.creatures.Player;
import dev.canuk790.tilegame.gfx.Assets;

public class GameState extends State{

	private Player player;	
	
	public GameState(){
		player = new Player(0, 0, Assets.playerFront);
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
	}

	@Override
	public void inputSpace() {
		Game.manageState(0);	// for now space exits back to menu		
	}

	@Override
	public void inputLeft() {
		player.moveLeft();
	}

	@Override
	public void inputRight() {
		player.moveRight();
	}

	@Override
	public void inputUp() {
		player.moveUp();
	}

	@Override
	public void inputDown() {
		player.moveDown();
	}

	@Override
	public void onOpen() {
	}

	@Override
	public void onClose() {
	}

}
