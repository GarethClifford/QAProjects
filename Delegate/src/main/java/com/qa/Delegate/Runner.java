package com.qa.Delegate;

public class Runner {

	public static void main(String[] args) {

		Delegate d1 = new Delegate("Bert");

		Delegate aDifferentDelegate = new Delegate("Jeff");

		d1.remove();

		aDifferentDelegate.changeStream();

		System.out.println(d1.name);

		d1.name = "Gareth";

		System.out.println(d1.name);

		System.out.println(aDifferentDelegate.techSkills);

		aDifferentDelegate.techSkills = 9;

		System.out.println(aDifferentDelegate.techSkills);
	}

}
