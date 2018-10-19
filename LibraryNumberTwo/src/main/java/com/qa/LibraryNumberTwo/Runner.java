package com.qa.LibraryNumberTwo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library library = new Library();
		Person gareth = new Person("Gareth", "HereGareth", "1");

		library.registerPerson(gareth);
		System.out.println(library.listOfPeople);
	}

}
