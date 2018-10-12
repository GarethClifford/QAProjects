package com.qa.Person;

public class Person {

	public int age;

	public String name;

	public String jobTitle;

	public Person(String name, String jobtitle, int age) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobtitle;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	@Override
	public String toString() {

		return "Name:" + name + ", Job Title: " + jobTitle + ", Age: " + age;
	}

}
