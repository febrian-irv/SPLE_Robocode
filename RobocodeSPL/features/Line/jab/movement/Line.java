package jab.movement;

import robocode.HitWallEvent;
import robocode.Event;

import jab.module.Module;
import jab.module.Movement;

public class Line extends Movement {
	
	private int moveDirection;
	
	public Line(Module bot) {
		super(bot);
		moveDirection = 1;
	}

	public void move() {
		// Limit our speed to 5
		bot.setMaxVelocity(8);
		// Start moving (and turning)
		bot.setAhead(50);
		bot.setTurnRight(10);
	}
	
	public void listen(Event e) {
		if (e instanceof HitWallEvent) {
			moveDirection *= -1;
		}
	}


}