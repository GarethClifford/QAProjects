package com.qa.Goldilock;

public class Goldilocks {

	private int mass;
	private int fortitude;

	public Goldilocks(int mass, int fortitude) {
		this.mass = mass;
		this.fortitude = fortitude;
	}

	public boolean canSit(Chair chair) {
		return (mass < chair.getCapacity() && fortitude > chair.getTemp() && chair.getLum() > 69);
	}

}
