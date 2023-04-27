package com.java.programs.arrays;

import java.util.Scanner;

public class SecondLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		while (true) {
			System.out.print("Enter the length of the array: ");
			length = sc.nextInt();
			if (length < 2) {
				System.out.println("Array must have at least two elements");
			} else {
				break;
			}
		}
		System.out.print("Enter the array elements : ");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int secondMax = arr[1];
		if (max < secondMax) {
			max = arr[1];
			secondMax = arr[0];
		}
		int temp;
		for (int i = 2; i < arr.length ; i++) {
			if (arr[i] > secondMax) {
				secondMax = arr[i];
			}
			if (max < secondMax) {
				temp = max;
				max = secondMax;
				secondMax = temp;
			}
		}
		System.out.println("The second largest element is " + secondMax);
		sc.close();
	}
}
