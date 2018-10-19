package com.qa.LibraryNumberTwo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LibraryTest {

	@Test
	public void testRegisterPerson() {
		Library library = new Library();
		Person gareth = new Person("Gareth", "HereGareth", "1");
		Person joseph = new Person("Joseph", "Herejoseph", "2");
		Person ben = new Person("Ben", "HereBen", "3");
		Person vinul = new Person("Vinul", "HereVinul", "4");
		Person harrison = new Person("Harrison", "HereHarrison", "5");
		List<Person> peoplelist = new ArrayList<>();
		peoplelist.add(gareth);
		peoplelist.add(joseph);
		peoplelist.add(ben);
		peoplelist.add(vinul);
		peoplelist.add(harrison);
		library.registerPerson(gareth);
		library.registerPerson(joseph);
		library.registerPerson(ben);
		library.registerPerson(vinul);
		library.registerPerson(harrison);
		assertEquals(peoplelist.size(), library.listOfPeople.size());
	}

	@Test
	public void testAddItem() {
		Library library = new Library();
		Book book1 = new Book("The Hobbit", "J. R. Tolkin", "Fantasy");
		Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "Fantasy");
		Book book3 = new Book("The Hobbit", "J. R. Tolkin", "Fantasy");
		List<Item> itemlist = new ArrayList<>();
		itemlist.add(book1);
		assertEquals(itemlist, library.addItem(book1));
	}

}
