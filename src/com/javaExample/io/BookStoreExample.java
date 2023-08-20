package com.javaExample.io;
import java.util.ArrayList;
import java.util.List;

public class BookStoreExample {
	 List<SerialazationExample> books = new ArrayList<>();
	   public List<SerialazationExample> getBooks() {
	      return books;
	   }
	   public void addBook(SerialazationExample book) {
		   books.add(book);
	   }

}
