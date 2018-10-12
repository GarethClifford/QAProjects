package com.qa.Garage;

public class Car extends Vehicle {

	private double sizeOfEngine;
	private int numberOfDoors;

	public Car(int numberofwheels, String methodoftransport, double sizeofengine, int numberofdoors) {
		super(numberofwheels, methodoftransport);
		this.sizeOfEngine = sizeofengine;
		this.numberOfDoors = numberofdoors;
		this.getNumberOfWheels();
		this.getMethodOfTransport();
	}

	@Override
	public String toString() {
		return "A Car has " + this.getNumberOfWheels() + " wheels. Its method of transport is "
				+ this.getMethodOfTransport() + ". It has a " + this.sizeOfEngine + "L engine. It has "
				+ this.numberOfDoors + " doors.";
	}

	public double getSizeOfEngine() {
		return sizeOfEngine;
	}

	public void setSizeOfEngine(double sizeOfEngine) {
		this.sizeOfEngine = sizeOfEngine;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}