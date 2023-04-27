package com.java.programs.arrays;

import java.util.Scanner;

public class AverageOfAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the array :");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double average = sum / length;
		System.out.println("The average of all elements in array is " + average);
		sc.close();
	}

}
