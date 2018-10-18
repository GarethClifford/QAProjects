package com.qa.Library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void testRegisterPerson() {
		People person = new People();
		assertEquals("Gareth has been added to the library with address: HereGareth, and contact number: 1.",
				person.registerPerson("Gareth", "HereGareth", "1"));
		assertEquals("Joseph has been added to the library with address: HereJoseph, and contact number: 2.",
				person.registerPerson("Joseph", "HereJoseph", "2"));
		assertEquals("Ben has been added to the library with address: HereBen, and contact number: 3.",
				person.registerPerson("Ben", "HereBen", "3"));
		assertEquals("Vinul has been added to the library with address: HereVinul, and contact number: 4.",
				person.registerPerson("Vinul", "HereVinul", "4"));
		assertEquals("Harrison has been added to the library with address: HereHarrison, and contact number: 5.",
				person.registerPerson("Harrison", "HereHarrison", "5"));
	}

	@Test
	public void testDeletePerson() {
		People person = new People();
		assertEquals("Gareth has been removed from the libary system along with their information.",
				person.deletePerson("Gareth", "HereGareth", "1"));
		assertEquals("Joseph has been removed from the libary system along with their information.",
				person.deletePerson("Joseph", "HereJoseph", "2"));
		assertEquals("Ben has been removed from the libary system along with their information.",
				person.deletePerson("Ben", "HereBen", "3"));
		assertEquals("Vinul has been removed from the libary system along with their information.",
				person.deletePerson("Vinul", "HereVinul", "4"));
		assertEquals("Harrison has been removed from the libary system along with their information.",
				person.deletePerson("Harrison", "HereHarrison", "5"));

	}

	//
	@Test
	public void testUpdatePerson() {
		People person = new People();
		person.registerPerson("Gareth", "HereGareth", "1");
		person.registerPerson("Joseph", "HereJoseph", "2");
		person.registerPerson("Ben", "HereBen", "3");
		person.registerPerson("Vinul", "HereVinul", "4");
		person.registerPerson("Harrison", "HereHarrison", "5");

		assertEquals("Gareth's address has been updated to ThereGareth",
				person.updatePerson("Gareth", "HereGareth", "ThereGareth"));

		assertEquals("Harrison's contact number has been updated to 16HarrisonNumber",
				person.updatePerson("Harrison", "5", "16HarrisonNumber"));

		assertEquals("Vinul's name has been updated to 123456789", person.updatePerson("Vinul", "Vinul", "123456789"));

		assertEquals("Could not update system.",
				person.updatePerson("Hillbilly", "ILiveHere", "IWantToLiveSomewhereElse"));

	}

	@Test
	public void testAddItem() {
		Item bookitem = new Book();
		// Dissertation dissitem = new Dissertation();
		// Newspaper paperitem = new Newspaper();
		assertEquals("The Hobbit written by J.R. Tolkin has been added to the book section of the library.",
				bookitem.addItem("Book", "The Hobbit", "J.R Tolkin"));

	}

}
