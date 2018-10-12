package com.qa.Person;

import java.util.ArrayList;

public class PeopleManagement {

	private ArrayList<Person> teamMembers = new ArrayList<>();

	public ArrayList<Person> getPeople() {
		return teamMembers;
	}

	public String nameSearch(String searching) {
		for (Person nm : teamMembers) {
			if (nm.getName().equals(searching)) {
				return "Person found";
			}

		}
		return "Person not found";

	}
}
