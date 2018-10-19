package com.qa.LibraryNumberTwo;

public class Book extends Item {

	private String bookName;
	private String bookAuthor;
	private String bookGenre;

	public Book(String name, String bookauthor, String bookgenre) {
		super(name);
		this.bookName = name;
		this.bookAuthor = bookauthor;
		this.bookGenre = bookgenre;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookGenre() {
		return bookGenre;
	}

}
