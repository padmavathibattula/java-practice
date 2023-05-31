package com.example.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To handle checked Exception
 */
public class FileNotFoundExceptionExample {
	public static void main(String[] args) {
		File file = new File("jtps.txt");
		FileInputStream fis = null;
		//this mistake can't be done by developer
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Rest of the program");
	}

}
