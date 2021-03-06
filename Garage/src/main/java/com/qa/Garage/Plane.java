package com.qa.Garage;

public class Plane extends Vehicle {

	private int numberOfEngines;
	private boolean isItPrivate;

	public Plane(int numberofwheels, String methodoftransport, int numberofengines, boolean isitprivate) {
		super(numberofwheels, methodoftransport);
		this.numberOfEngines = numberofengines;
		this.isItPrivate = isitprivate;
		this.getNumberOfWheels();
		this.getMethodOfTransport();
	}

	@Override
	public String toString() {
		String result = "";
		if (this.isItPrivate) {
			result = "is ";
		} else if (!this.isItPrivate) {
			result = "is not ";
		}
		return "A Plane has " + this.getNumberOfWheels() + " wheels. Its method of transport is "
				+ this.getMethodOfTransport() + "It has " + this.numberOfEngines + "engines. It " + result
				+ "a private plane.";
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public boolean isItPrivate() {
		return isItPrivate;
	}

	public void setItPrivate(boolean isItPrivate) {
		this.isItPrivate = isItPrivate;
	}
}