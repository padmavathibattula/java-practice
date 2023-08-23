package com.javaExample.io;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class JBooks {
	@Expose
	private List<JBook> books = new ArrayList<>();

    public List<JBook> getBooks() {
        return books;
    }

    public void addBook(JBook newBook) {
        books.add(newBook);
    }

	@Override
	public String toString() {
		return "JBookStore [books=" + books + ", getBooks()=" + getBooks() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



}
