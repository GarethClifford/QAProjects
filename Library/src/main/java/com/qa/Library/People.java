package com.qa.Library;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class People {
	private String personName;
	private String personAddress;
	private String personNumber;
	ArrayList<String> listOfPeople = new ArrayList<>();
	ArrayList<String> listOfAddresses = new ArrayList<>();
	ArrayList<String> listOfContact = new ArrayList<>();

	public String registerPerson(String personname, String personaddress, String personnumber) {
		this.personName = personname;
		this.personAddress = personaddress;
		this.personNumber = personnumber;
		listOfPeople.add(this.personName);
		listOfAddresses.add(this.personAddress);
		listOfContact.add(this.personNumber);

		return personname + " has been added to the library with address: " + personaddress + ", and contact number: "
				+ personnumber + ".";

	}

	public String deletePerson(String personname, String personaddress, String personnumber) {

		listOfPeople = (ArrayList<String>) listOfPeople.stream().filter(string -> !string.equals(personname))
				.collect(Collectors.toList());
		listOfAddresses = (ArrayList<String>) listOfAddresses.stream().filter(string -> !string.equals(personaddress))
				.collect(Collectors.toList());
		listOfContact = (ArrayList<String>) listOfContact.stream().filter(string -> !string.equals(personnumber))
				.collect(Collectors.toList());
		return personname + " has been removed from the libary system along with their information.";
	}

	public String updatePerson(String personname, String oldinfo, String newinfo) {

		String message = null;
		int index = -1;
		for (int i = 0; i < listOfPeople.size(); i++) {
			if (listOfPeople.get(i).equals(personname)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			message = "Could not update system.";
		} else if (oldinfo.equals(listOfAddresses.get(index))) {
			listOfAddresses.set(index, newinfo);
			message = personname + "'s address has been updated to " + newinfo;
		} else if (oldinfo.equals(listOfContact.get(index))) {
			listOfContact.set(index, newinfo);
			message = personname + "'s contact number has been updated to " + newinfo;
		} else if (oldinfo.equals(listOfPeople.get(index))) {
			listOfPeople.set(index, newinfo);
			message = personname + "'s name has been updated to " + newinfo;
		}

		return message;
	}

}
