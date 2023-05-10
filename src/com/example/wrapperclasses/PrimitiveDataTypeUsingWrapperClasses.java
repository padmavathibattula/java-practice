package com.example.wrapperclasses;

import java.util.Scanner;

public class PrimitiveDataTypeUsingWrapperClasses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a is: ");
		String str = sc.nextLine();
		int a = Integer.parseInt(str);
		System.out.println("String converted to int: " + a);
		System.out.print("Enter the number b is: ");
		String str1 = sc.nextLine();
		int b = Integer.valueOf(str1);
		System.out.println("String to int using(): " + b);
		System.out.print("Enter the number c1 is: ");
		Integer c1 = sc.nextInt();
		System.out.print("Enter the number c2 is: ");
		Integer c2 = sc.nextInt();
		int c = c1.compareTo(c2);
		System.out.println("The comparision of two  integer is : " + c);
		System.out.print("Enter the number d is:");
		Integer d = sc.nextInt();
		System.out.print("Enter the number e is: ");
		Integer e = sc.nextInt();
		System.out.println("The equals of two integers:" + d.equals(e));
		System.out.println("String to using toString(): " + str1.toString());
		sc.close();

	}

}
