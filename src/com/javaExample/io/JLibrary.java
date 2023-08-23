package com.javaExample.io;

import java.util.ArrayList;
import java.util.List;

public class JLibrary {
	List<JBookId> books = new ArrayList<>();
	private List<JBookId> library;
	public List<JBookId> getBooks() {
		return books;
	}
	public void setBooks(List<JBookId> books) {
		this.books = books;
	}
	public List<JBookId> getLibrary() {
		return library;
	}
	public void setLibrary(List<JBookId> library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "JLibrary [books=" + books + ", library=" + library + ", getBooks()=" + getBooks() + ", getLibrary()="
				+ getLibrary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	  

}
