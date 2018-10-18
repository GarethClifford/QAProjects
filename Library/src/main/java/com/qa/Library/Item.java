package com.qa.Library;

public abstract class Item extends Library {

	private String itemName;
	private String itemLocation;
	private String itemUniqueID;
	String message;

	public String addItem(String itemtype, String bookname, String bookauthor) {
		Book books = new Book();
		if (itemtype.equals("Book")) {

			message = books.getBookName() + " written by " + books.getBookAuthor()
					+ " has been added to the book section of the library.";
		}

		return message;
	}

	public String checkOutItem() {
		return "";
	}

	public String checkInItem() {
		return "";
	}

	public String removeItem() {
		return "";
	}

	public String updateItem() {
		return "";
	}

	public String getItemname() {
		return itemName;
	}

	public String getItemlocation() {
		return itemLocation;
	}

	public String getItemuid() {
		return itemUniqueID;
	}

}
