package com.java.programs.patterns;

import java.util.Scanner;

public class LcmOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println(" Enter the second number : ");
		int num2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) { //divides both the numbers by i, if the remainder is 0 the number is completely divisible by i
			                                          //Checks that i is present in both or not  
			                                          
			if (num1 % i == 0 && num2 % i == 0) {  // returns true if both conditions are true
				// assigns i into gcd 
				gcd = i;

			}
		}
		int lcm = (num1 * num2) / gcd;
		System.out.println("The Lcm of " + num1 + " and " + num2 + " is : " + lcm);
		sc.close();
	}

}
