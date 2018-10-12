package com.qa.Garage;

public class Motorcycle extends Vehicle {

	private double sizeOfEngine;
	private boolean hasStablisers;

	public Motorcycle(int numberofwheels, String methodoftransport, double sizeofengine, boolean hasstablisers) {
		super(numberofwheels, methodoftransport);
		this.sizeOfEngine = sizeofengine;
		this.hasStablisers = hasstablisers;
		this.getNumberOfWheels();
		this.getMethodOfTransport();
	}

	@Override
	public String toString() {
		String result = "";
		if (this.hasStablisers) {
			result = "has ";
		} else if (!this.hasStablisers) {
			result = "has not ";
		}
		return "A Motorcycle has a " + this.getNumberOfWheels() + " wheels. Its method of transport is "
				+ this.getMethodOfTransport() + ". It has a " + this.sizeOfEngine + "L engine. It " + result
				+ "got stabilisers.";
	}

	public double getSizeOfEngine() {
		return sizeOfEngine;
	}

	public void setSizeOfEngine(double sizeOfEngine) {
		this.sizeOfEngine = sizeOfEngine;
	}

	public boolean getHasStablisers() {
		return hasStablisers;
	}

	public void setHasStablisers(boolean hasStablisers) {
		this.hasStablisers = hasStablisers;
	}

}