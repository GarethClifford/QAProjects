package com.qa.Garage;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();
		Plane p1 = new Plane(12, "Fly", 4, true);
		Car c1 = new Car(4, "Drive", 1.4, 5);
		Motorcycle m1 = new Motorcycle(2, "Drive", 0.5, true);
		Plane p2 = new Plane(3, "Fly", 1, false);
		Car c2 = new Car(3, "Drive", 0.5, 3);
		Motorcycle m2 = new Motorcycle(2, "Drive", 1.3, false);

		garage.addVehicle(p1);
		garage.addVehicle(c1);
		garage.addVehicle(m1);

		garage.addVehicle(p2);
		garage.addVehicle(c2);
		garage.addVehicle(m2);

		// System.out.println(P1);
		// System.out.println(C1);
		// System.out.println(M1);
		//
		// System.out.println(P2);
		// System.out.println(C2);
		// System.out.println(M2);

	}
}
