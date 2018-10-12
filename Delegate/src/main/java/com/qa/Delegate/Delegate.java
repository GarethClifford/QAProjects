package com.qa.Delegate;

public class Delegate {

	public int techSkills;

	public int softSkills;

	public int UID;

	public String name;

	public String contact;

	public String trainer;

	public Delegate(String name) {

		this.name = name;
	}

	public void remove() {

		System.out.println("Delegate was removed");
	}

	public void changeStream() {

		System.out.println("Delegate has changed streams");
	}

	public void changeClient() {

		System.out.println("Delegate has changed client");
	}

}
