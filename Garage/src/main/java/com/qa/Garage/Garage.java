package com.qa.Garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> listOfVehicles;

	public Garage() {
		listOfVehicles = new ArrayList<>();
	}

	public void addVehicle(Vehicle v) {
		listOfVehicles.add(v);
	}

	public double getBill() {
		int i;
		double bill = 0;
		for (i = 0; i < listOfVehicles.size(); i++) {
			if (listOfVehicles.get(i) instanceof Plane) {
				bill += ((Plane) listOfVehicles.get(i)).getNumberOfWheels() * 500;
				bill += ((Plane) listOfVehicles.get(i)).getNumberOfEngines() * 150000;
			} else if (listOfVehicles.get(i) instanceof Motorcycle) {
				bill += ((Motorcycle) listOfVehicles.get(i)).getNumberOfWheels() * 67;
				bill += ((Motorcycle) listOfVehicles.get(i)).getSizeOfEngine() * 49.5;
				if (((Motorcycle) listOfVehicles.get(i)).getHasStablisers()) {
					bill += 3 * 12.50;
				}
			} else if (listOfVehicles.get(i) instanceof Car) {
				bill += ((Car) listOfVehicles.get(i)).getNumberOfWheels() * 35;
				bill += ((Car) listOfVehicles.get(i)).getNumberOfDoors() * 63;
				bill += ((Car) listOfVehicles.get(i)).getSizeOfEngine() * 49.5;
			}
		}
		return bill;
	}

	public void addVehicle() {

	}

}
