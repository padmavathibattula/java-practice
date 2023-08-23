package com.javaExample.io;

public class JBookStore {
	private JBooks bookstore;

	public JBooks getBookstore() {
		return bookstore;
	}

	public void setBookstore(JBooks bookstore) {
		this.bookstore = bookstore;
	}

	@Override
	public String toString() {
		return "JBookStore [bookstore=" + bookstore + ", getBookstore()=" + getBookstore() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void addBook(JBook newBook) {
		this.bookstore=bookstore;

	}



}
