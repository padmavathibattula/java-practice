package com.example.exceptions;
/*
 * An Example to print a custom message Example
 */
public class CustomMessageExample {
	public static void main(String[] args) {
		try {
			int data=50/0;
		}catch(Exception e) {
			System.out.println("can't divided by zero");
		}
	}

}
