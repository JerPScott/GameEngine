package dev.canuk790.tilegame.states;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.canuk790.tilegame.Game;
import dev.canuk790.tilegame.entities.creatures.Player;
import dev.canuk790.tilegame.gfx.Assets;
import dev.canuk790.tilegame.zones.ZoneHandler;

public class GameState extends State{

	private Player player;	
	private ZoneHandler zoneHandler;
	
	public GameState(){
		player = new Player(0, 0, Assets.playerFront);
		zoneHandler = new ZoneHandler();
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		for (int i = 0; i<20; i++){
			for (int k = 0; k<15; k++){
				g.drawImage(zoneHandler.testZone.background[i][k], i*32, k*32, null);
			}
		}
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
