package com.javaExample.io;
import java.io.FileReader;
import java.io.FileWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class AddBook {
	 public static void main(String[] args) {
	        try {
	        	//java object -> xml (marshalling) ->add  a third book ->write operation
	            // Unmarshal existing XML content
	            JAXBContext context = JAXBContext.newInstance(BookStore.class);
	            Unmarshaller unmarshaller = context.createUnmarshaller();
	            BookStore bookstore = (BookStore) unmarshaller.unmarshal(new FileReader("C:\\Users\\DELL\\Documents\\book-store.xml"));

	            // Create a new book
	            MarshallingExample newBook = new MarshallingExample();
	            newBook.setTitle("Advanced XML Programming");
	            newBook.setAuthor("David Johnson");
	            newBook.setPrice(49.95);

	            // Add the new book to the list
	            bookstore.addBook(newBook);

	            // Marshal the updated data back to XML and write to the file
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	            marshaller.marshal(bookstore, new FileWriter("C:\\Users\\DELL\\Documents\\book-store.xml"));

	            System.out.println("New book added and XML updated.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
