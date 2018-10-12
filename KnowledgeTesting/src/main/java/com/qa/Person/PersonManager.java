package com.qa.Person;

import java.security.Permission;
import java.util.ArrayList;
import java.util.stream.Stream;


public class PersonManager {
	
	ArrayList<Permission> teamMembers = new ArrayList<>();

	public void nameSearch(String sn) {
		 teamMembers.stream().filter(i -> i.getName().equals(sn));
	}

}
