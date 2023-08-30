package com.example.io;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "library")
public class Library {
	private List<XbookId> books = new ArrayList<>();
	private List<JBookId> library;
	@XmlElement(name = "book")
    public List<XbookId> getBooks() {
        return books;
    }
	 public void setBooks(List<XbookId> books) {
	        this.books = books;
	    }

    public void addBook(XbookId book) {
        books.add(book);
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
	private List<JBookId> getLibrary() {
		return library;
	}
	
	  

}
