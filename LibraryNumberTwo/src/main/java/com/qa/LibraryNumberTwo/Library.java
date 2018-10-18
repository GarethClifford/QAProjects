package com.qa.LibraryNumberTwo;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<People> listOfPeople = new ArrayList<>();
	List<Item> listOfItems = new ArrayList<>();

	public List<People> registerPerson(People personname) {
		listOfPeople.add(personname);
		return listOfPeople;
	}

	public List<Item> registerPerson(Item itemname) {
		listOfItems.add(itemname);
		return listOfItems;
	}

}
