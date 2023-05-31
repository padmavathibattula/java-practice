package com.example.exceptions;
import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a numerator:");
		int numerator = sc.nextInt();
		System.out.println("Enter a denominator:");
		int denominator=sc.nextInt();
		try {
			int output=numerator/denominator;
			System.out.println("The output is:"+output);
			System.out.println("Enter a name:");
			String name=sc.next();
			System.out.println(name.charAt(2));
			int[] arr=new int[Integer.MAX_VALUE];
		}catch(ArithmeticException | StringIndexOutOfBoundsException | OutOfMemoryError e) {
			System.out.println(e.getMessage());// this line will be executed in case of exception
		}finally {
			sc.close();// this line will be executed irrespective of exception
		}
		System.out.println("Rest of the program");
	}

}
