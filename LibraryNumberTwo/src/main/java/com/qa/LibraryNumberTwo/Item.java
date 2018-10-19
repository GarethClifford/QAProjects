package com.qa.LibraryNumberTwo;

public abstract class Item {

	private int initialID = 1;
	private String itemType;
	private int itemUniqueID;

	public Item(String itemtype) {
		this.itemUniqueID = initialID;
		this.itemType = itemtype;

		initialID++;
	}

	public int getInitialID() {
		return initialID;
	}

	public String getItemType() {
		return itemType;
	}

	public int getItemUniqueID() {
		return itemUniqueID;
	}

}
