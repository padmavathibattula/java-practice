package com.javaExample.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class JDeseralizationExample {
	public static void main(String[] args) {

		// pretty print 
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	      //Gson gson = new Gson();

        try (Reader reader = new FileReader("C:\\Users\\DELL\\Documents\\library.json")) {
        	JsonElement json = gson.fromJson(reader, JsonElement.class);

            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);
        	
        } catch (IOException e) {
            e.printStackTrace();
        }

}

}
