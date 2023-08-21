package com.javaExample.io;
import java.util.ArrayList;
import java.util.List;

public class JBookStore {
	 List<JBook> books = new ArrayList<>();
	   public List<JBook> getBooks() {
	      return books;
	   }
	   public void addBook(JBook book) {
		   books.add(book);
	   }

}
