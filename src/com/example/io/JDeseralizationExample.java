package com.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class JDeseralizationExample {
	public static void main(String[] args) {

		try (Reader reader = new FileReader("C:\\Users\\DELL\\Documents\\library.json")) {
			BufferedReader br = new BufferedReader(reader);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			String json = sb.toString();

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JLibrary root = gson.fromJson(json, JLibrary.class);

			for (JBookId book : root.getLibrary()) {
				System.out.println(book);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
