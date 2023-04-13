package com.java.program;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number :");
		int base = sc.nextInt();
		System.out.println("Enter the exponent number ");
		long result = 1;
		int exponent =sc.nextInt();
		int expo =exponent;
		sc.close();
		
		for(; exponent!= 0; --exponent) {
			result = result*base;
		}
		System.out.println( base+ "to the power " +expo+ "is : "+result);
		
	}

}
