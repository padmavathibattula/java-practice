package com.javaExample.io;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bookstore")
public class XBookStore {
	private List<XBook> xbooks = new ArrayList<>();

    @XmlElement(name = "book")
    public List<XBook> getBooks() {
        return xbooks;
    }

    public void addBook(XBook xbook) {
        xbooks.add(xbook);
    }

}
