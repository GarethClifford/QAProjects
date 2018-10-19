package com.qa.LibraryNumberTwo;

public class Person {
	private String personName;
	private String personAddress;
	private String personNumber;

	public Person(String personname, String personaddress, String personnumber) {
		this.personName = personname;
		this.personAddress = personaddress;
		this.personNumber = personnumber;
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

	// @Override
	// public String toString() {
	// return personName;
	// }
}