package com.qa.InfiniteTerrainSystem;

import java.util.Random;

public class DeathPlanet {

	private double distanceToKey;
	private KeyToShip keytoship;
	private Participant participant;

	public DeathPlanet() {
		Random distance = new Random();
		double xWay = (distance.nextDouble() * 10) - 5;
		double yWay = (distance.nextDouble() * 10) - 5;

		this.participant = new Participant();
		this.keytoship = new KeyToShip(xWay, yWay);
		newKeyDistance();

	}

	public double moveDirection(String whichway) {
		switch (whichway) {
		case "n":
			participant.setYdirection(participant.getYdirection() + 1.0);
			break;
		case "e":
			participant.setXdirection(participant.getXdirection() + 1.0);
			break;
		case "s":
			participant.setYdirection(participant.getYdirection() - 1.0);
			break;
		case "w":
			participant.setXdirection(participant.getXdirection() - 1.0);
			break;
		}
		newKeyDistance();

		return this.distanceToKey;
	}

	// double distX = participant.getXdirection() - keytoship.getxWay();
	// double distY = participant.getYdirection() - keytoship.getyWay();
	// double dist = Math.sqrt(distX * distX + distY * distY);
	// This has been replaced by the Math.hypot function

	public void newKeyDistance() {
		this.distanceToKey = Math.hypot(participant.getXdirection() - keytoship.getxWay(),
				participant.getYdirection() - keytoship.getyWay());

	}

	public double getDistanctToKey() {
		return distanceToKey;
	}

}