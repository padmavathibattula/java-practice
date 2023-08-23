package com.javaExample.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class SerializationExample {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try (FileReader reader = new FileReader("C:\\Users\\DELL\\Documents\\book-store.json")) {
			BufferedReader br = new BufferedReader(reader);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			String json = sb.toString();

			// Deserialize the JSON string into a JBookStore object
			JBookStore obj = gson.fromJson(json, JBookStore.class);

			// Create a new JBook instance and set its properties
			JBook newBook = new JBook();
			newBook.setTitle("java");
			newBook.setAuthor("james");
			newBook.setPrice(50.95);

			// Add the new book to the existing JBookStore
			obj.getBookstore().addBook(newBook);

			// Serialize the modified JBookStore object to JSON string
			String newJson = gson.toJson(obj);
			try (FileWriter writer = new FileWriter("C:\\Users\\DELL\\Documents\\.json")) {
				
				writer.write(newJson);
				System.out.println("New book added and json updated.");

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
