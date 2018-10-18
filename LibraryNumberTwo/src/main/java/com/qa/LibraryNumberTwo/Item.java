package com.qa.LibraryNumberTwo;

public abstract class Item {

	private int initialID = 1;
	private String itemName;
	private int itemUniqueID;

	public Item(String itemname) {
		this.itemUniqueID = initialID;
		this.itemName = itemname;

		initialID++;
	}

	public int getInitialID() {
		return initialID;
	}

	public String getItemName() {
		return itemName;
	}

	public int getItemUniqueID() {
		return itemUniqueID;
	}

}
