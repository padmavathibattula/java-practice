package com.javaExample.io;

import com.google.gson.*;

import java.io.*;

public class JSerializationExample {
	 public static void main(String[] args) {
	        String filePath = "C:\\Users\\DELL\\Documents\\library.json"; // Replace with your JSON file path

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

	        JsonParser parser = new JsonParser();
	        JsonObject rootObject = parser.parse(jsonString.toString()).getAsJsonObject();

	        JsonObject newBook = new JsonObject();
	        newBook.addProperty("id", "004");
	        newBook.addProperty("title", "The Great Gatsby");
	        newBook.addProperty("author", "Harper");
	        newBook.addProperty("publication_year", 2023);
	        newBook.addProperty("genre", "Fiction");

	        JsonObject availability = new JsonObject();
	        availability.addProperty("status", "checked_out");
	        availability.addProperty("due_date", "2023-08-25");
	        availability.addProperty("borrower", "John");
	        newBook.add("availability", availability);

	        JsonArray libraryArray = rootObject.getAsJsonArray("library");
	        libraryArray.add(newBook);

	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String updatedJsonString = gson.toJson(rootObject);

	        try (FileWriter writer = new FileWriter(filePath)) {
	            writer.write(updatedJsonString);
	            System.out.println("New book added to JSON file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
   }
