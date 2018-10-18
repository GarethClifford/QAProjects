package com.qa.Library;

import java.util.ArrayList;

public class People {
	private String personName;
	private String personAddress;
	private String personNumber;
	static ArrayList<String> listOfPeople = new ArrayList<String>();
	ArrayList<String> listOfAddresses = new ArrayList<String>();
	ArrayList<String> listOfContact = new ArrayList<String>();
	private ArrayList<String> newListOfPeople = new ArrayList<String>();

	public void registerPerson(String personname, String personaddress, String personnumber) {
		this.personName = personname;
		this.personAddress = personaddress;
		this.personNumber = personnumber;
		listOfPeople.add(this.personName);
		listOfAddresses.add(this.personAddress);
		listOfContact.add(this.personNumber);

	}

	public void deletePerson(String personname) {

		int i;
		for (i = 0; i < listOfPeople.size(); i++) {
			if (personname.equals(listOfPeople.get(i))) {
				listOfPeople.remove(i);
			}
		}
		// listOfPeople.stream().filter(string -> !string.equals(personname));

	}

	public void updatePerson() {

	}

	public String getPersonName() {
		return personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public String getPersonNumber() {
		return personNumber;
	}

}
