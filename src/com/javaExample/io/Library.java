package com.javaExample.io;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "library")
public class Library {
	private List<XbookId> books = new ArrayList<>();
	@XmlElement(name = "book")
    public List<XbookId> getBooks() {
        return books;
    }

    public void addBook(XbookId book) {
        books.add(book);
    }

}
