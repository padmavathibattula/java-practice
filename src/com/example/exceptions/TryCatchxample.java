package com.example.exceptions;

public class TryCatchxample {
	public static void main(String[] args) {
		try {
			int data=50/0;
			System.out.println("the rest of code executed");
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
