package dev.canuk790.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends Creature{

	public Player(float x, float y, BufferedImage texture) {
		super(x, y, texture);
	}

	@Override
	public void tick() {
		// update the texture depending on movement once key listener is implemented
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(texture, (int) x, (int) y, null);
		// x and y values from entity class (creature extends entity)
	}

}
