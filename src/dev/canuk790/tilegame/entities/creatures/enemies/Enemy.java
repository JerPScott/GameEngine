package dev.canuk790.tilegame.entities.creatures.enemies;

import java.awt.image.BufferedImage;

import dev.canuk790.tilegame.entities.creatures.Creature;
import dev.canuk790.tilegame.entities.creatures.Player;

public abstract class Enemy extends Creature{
	
	protected int damage, attackTimer;
	protected int xDiff, yDiff;

	public Enemy(int x, int y, BufferedImage texture) {
		super(x, y, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Creature target) {
		target.takeDamage(damage);
	}
	
	public abstract void scout(Player player);

}
