package com.qa.InfiniteTerrainSystem;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		System.out.println(
				"Welcome to the end of the world! \nThe only way to survive this is to find the key to the ship that can take you away from the burning planet. "
						+ "\nCareful you only have a certain amount of time before the planet burns up. "
						+ "\nThis compass will tell you how far away you are from the key."
						+ "\nGood luck and try not to die :). \n Use they keys 'n', 'e', 's' and 'w' for north, east, south and west repectively");

		searchingKey();

		System.out.println(
				"You have made it!! Well Done! Unfortunalty there is no ship so you die hahahahaha! \nHowever, there maybe another way out. All you have to do is find the next box with the new instructions.");

		searchingKey();

		System.out.println(
				"You have found the secret toolbox left by the orignal species that lived here. To find out the next clue you need to solve the following: \n if a>b and b>c is a>c? \ny/n");

		if (System.in.equals("y")) {
			yesOrNo();
		} else {
			System.out.println("NO!! HAHAHAHAHAHA YOU LOSE!");
		}

	}

	public static void searchingKey() {
		DeathPlanet dyingPlanet = new DeathPlanet();
		Scanner sc = new Scanner(System.in);

		while (dyingPlanet.getDistanctToKey() >= 1.0) {
			System.out.println("You are " + Math.floor(dyingPlanet.getDistanctToKey() * 1000) / 1000 + "KM away");
			dyingPlanet.moveDirection(sc.nextLine());
		}
	}

	public static void yesOrNo() {
		DeathPlanet dyingPlanet = new DeathPlanet();
		Scanner sc = new Scanner(System.in);

		while (dyingPlanet.getDistanctToKey() >= 1.0) {
			System.out.println("You are " + Math.floor(dyingPlanet.getDistanctToKey() * 1000) / 1000 + "KM away");
			dyingPlanet.moveDirection(sc.nextLine());
		}

	}
}
