package com.example.io;

import com.google.gson.*;

import java.io.*;

public class JSerializationExample {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String filePath = "C:\\Users\\DELL\\Documents\\library.json";
		String outPut = "C:\\Users\\DELL\\Documents\\output.json";

		StringBuilder jsonString = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				jsonString.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		JLibrary obj = gson.fromJson(jsonString.toString(), JLibrary.class);

		// Create a new JBookId instance and set its properties
		JBookId newBook = new JBookId();
		newBook.setId("004");
		newBook.setTitle("The Great Gatsby");
		newBook.setAuthor("Harper");
		newBook.setPublicationYear(2023);
		newBook.setGenre("Fiction");

		// Create and set the availability for the new book
		JAvaliability availability = new JAvaliability();
		availability.setStatus("checked_out");
		availability.setDueDate("2023-08-25");
		availability.setBorrower("John");
		newBook.setAvailability(availability);

		// Add the new book to the existing library's book list
		obj.getLibrary().add(newBook);

		// Serialize the updated library to JSON
		String newJson = gson.toJson(obj);

		try (FileWriter writer = new FileWriter(outPut)) {
			writer.write(newJson);
			System.out.println("New book added to JSON file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
