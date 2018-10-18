package com.qa.Library;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LibraryTest {

	// @Before
	// public void startingUp() {
	// People person = new People();
	// person.registerPerson("Gareth", "HereGareth", "1");
	// person.registerPerson("Joseph", "HereJoseph", "2");
	// person.registerPerson("Ben", "HereBen", "3");
	// person.registerPerson("Vinul", "HereVinul", "4");
	// person.registerPerson("Harrison", "HereHarrison", "5");
	// }

	@Test
	public void testRegisterPerson() {
		People person = new People();
		person.registerPerson("Gareth", "HereGareth", "1");
		person.registerPerson("Joseph", "HereJoseph", "2");
		person.registerPerson("Ben", "HereBen", "3");
		person.registerPerson("Vinul", "HereVinul", "4");
		person.registerPerson("Harrison", "HereHarrison", "5");

		assertEquals("Gareth", person.listOfPeople.get(0));
		assertEquals("Joseph", person.listOfPeople.get(1));
		assertEquals("Ben", person.listOfPeople.get(2));
		assertEquals("Vinul", person.listOfPeople.get(3));
		assertEquals("Harrison", person.listOfPeople.get(4));

		assertEquals("HereGareth", person.listOfAddresses.get(0));
		assertEquals("HereJoseph", person.listOfAddresses.get(1));
		assertEquals("HereBen", person.listOfAddresses.get(2));
		assertEquals("HereVinul", person.listOfAddresses.get(3));
		assertEquals("HereHarrison", person.listOfAddresses.get(4));

		assertEquals("1", person.listOfContact.get(0));
		assertEquals("2", person.listOfContact.get(1));
		assertEquals("3", person.listOfContact.get(2));
		assertEquals("4", person.listOfContact.get(3));
		assertEquals("5", person.listOfContact.get(4));

	}

	@Test
	public void testDeletePerson() {
		People person = new People();
		ArrayList<String> updatedListOfPeople = new ArrayList<String>();
		updatedListOfPeople.add("Joseph");
		updatedListOfPeople.add("Ben");
		updatedListOfPeople.add("Vinul");
		updatedListOfPeople.add("Harrison");

		assertEquals(updatedListOfPeople, person.deletePerson("Gareth"));

	}

}
