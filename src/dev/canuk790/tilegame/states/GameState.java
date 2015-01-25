package dev.canuk790.tilegame.states;

import java.awt.Graphics;

import dev.canuk790.tilegame.entities.creatures.Player;
import dev.canuk790.tilegame.gfx.Assets;
import dev.canuk790.tilegame.gfx.Font;

public class GameState extends State{

	private Player player;
	
	public GameState(){
		player = new Player(0, 32, Assets.playerFront);
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
		// TODO Auto-generated method stub
		
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
