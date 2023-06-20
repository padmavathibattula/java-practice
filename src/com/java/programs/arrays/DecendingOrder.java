package com.java.programs.arrays;

import java.util.Scanner;

/*
 * 15. Write a program to sort an array in descending order.
       Input:
       Enter the size of the array: 5
       Enter the array elements: 10 5 20 25 15
       Output:
       Array in descending order: 25 20 15 10 5
 */
//Time complexity:O(n*n)
//space complexity:O(n)
public class DecendingOrder {
	public int [] getDecendingOrder(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the  array :");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in descending order
		
		DecendingOrder obj = new DecendingOrder();
		int[] arr1 = obj.getDecendingOrder(arr);
		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		sc.close();
	}
}
