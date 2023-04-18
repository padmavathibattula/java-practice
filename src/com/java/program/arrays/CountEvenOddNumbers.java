package com.java.program.arrays;

import java.util.Scanner;

public class CountEvenOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Eter the number of elements in the  array :");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int oddcount = 0;
		int evencount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evencount = evencount + 1;
			} else {
				oddcount = oddcount + 1;
			}
		}
		System.out.println("Even numbers = " + evencount+  "  odd numbers = " + oddcount);
		sc.close();

	}

}
