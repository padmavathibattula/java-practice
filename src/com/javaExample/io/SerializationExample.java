package com.javaExample.io;

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
		try (FileReader reader = new FileReader("C:\\Users\\DELL\\Documents\\book-store.json")) {
			JsonParser parser = new JsonParser();
			JsonObject rootObject = parser.parse(reader).getAsJsonObject();
			JsonObject newBook = new JsonObject();
			newBook.addProperty("title", "Advanced XML Programming");
			newBook.addProperty("author", "David Johnson");
			newBook.addProperty("price", 49.95);

			JsonObject bookstore = rootObject.getAsJsonObject("bookstore");
			bookstore.getAsJsonArray("book").add(newBook);
			try (FileWriter writer = new FileWriter("C:\\Users\\DELL\\Documents\\book-store.json")) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				writer.write(gson.toJson(rootObject));
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
