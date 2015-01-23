package dev.canuk790.tilegame.entities.creatures;

import java.awt.image.BufferedImage;

import dev.canuk790.tilegame.entities.Entity;

public abstract class Creature extends Entity{
	
	protected int health;

	public Creature(float x, float y, BufferedImage texture) {
		super(x, y, texture);
		health = 10;
	}

}
