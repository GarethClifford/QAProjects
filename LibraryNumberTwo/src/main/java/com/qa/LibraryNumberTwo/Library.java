package com.qa.LibraryNumberTwo;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Person> listOfPeople = new ArrayList<>();
	List<Item> listOfItems = new ArrayList<>();

	// Person person = new Person(null, null, null);

	public List<Person> registerPerson(Person person) {
		listOfPeople.add(person);
		return listOfPeople;
	}

	public List<Item> addItem(Item itemname) {
		listOfItems.add(itemname);
		return listOfItems;
	}

	public List<Person> deletePerson(Person person) {
		listOfPeople.remove(person);
		return listOfPeople;
	}

	public List<Item> deleteItem(Item item) {
		listOfItems.remove(item);
		return listOfItems;
	}

}
