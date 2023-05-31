package com.example.exceptions;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());

		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		System.out.println("The rest of the program");

	}
	
	//1. NullPointerException -> Unchecked exception -> when will it occur? when the object is null
	//2. FileNotFoundException -> checked exception  -> It will occur when the file is not found 
}
