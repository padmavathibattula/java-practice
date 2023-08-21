package com.javaExample.io;

import java.util.ArrayList;
import java.util.List;

public class JLibrary {
	List<JBookId> books = new ArrayList<>();
	   public List<JBookId> getBooks() {
	      return books;
	   }
	   public void addBook(JBookId book) {
		   books.add(book);
	   }

}
