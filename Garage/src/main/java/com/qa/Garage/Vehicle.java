package com.qa.Garage;

abstract public class Vehicle {

	private int numberOfWheels;
	private String methodOfTransport;

	public Vehicle(int numberofwheels, String methodoftransport) {
		this.numberOfWheels = numberofwheels;
		this.methodOfTransport = methodoftransport;

	}

	@Override
	public String toString() {
		return "Vehicle has " + this.getNumberOfWheels() + " number of wheels.";
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public String getMethodOfTransport() {
		return methodOfTransport;

	}

}