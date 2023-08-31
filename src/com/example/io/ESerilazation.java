package com.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ESerilazation {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (Reader reader = new FileReader("C:\\Users\\battula.padmavathi\\Documents\\employees.json")) {
			BufferedReader br = new BufferedReader(reader);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			String json = sb.toString();

			// Deserialize the JSON string into a JBookStore object
			EmployeeConvertJavaObject emp = gson.fromJson(json, EmployeeConvertJavaObject.class);

			// Create a new JBook instance and set its properties
			EmployeeDetailsObject newEmp = new EmployeeDetailsObject();
			newEmp.setId(11);
			newEmp.setFirstName("sujatha");
			newEmp.setLastName("kogapu");
			newEmp.setPosition("student");
			newEmp.setDepartment("coding");
			newEmp.setSalary(10000);

            // Serialize the modified Employee object to JSON string
            String newJson = gson.toJson(emp);

            // Write the JSON string back to the original file to modify it
            try (FileWriter writer = new FileWriter("C:\\Users\\battula.padmavathi\\Documents\\output.json")) {
                writer.write(newJson);
                System.out.println("New employee added successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }

}
	
