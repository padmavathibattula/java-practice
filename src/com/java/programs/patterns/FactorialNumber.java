package com.java.programs.patterns;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = sc.nextInt();
		int i = 1,fact =1;
		do {
			
			fact = fact*i;
			i++;
		}while(i<=num);
		System.out.println("factorial of "+num+ " is " +fact+ " using do while loop");
		sc.close();
		
		
	}

}
