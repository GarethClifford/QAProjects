package com.qa.Library;

public class Book extends Item {

	private String bookAuthor;
	private String bookName;

	public void addNewBook(String bookname, String bookauthor) {
		this.bookAuthor = bookauthor;
		this.bookName = bookname;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookName() {
		return bookName;
	}

}
