package com.example.programs.arrays;

import java.util.Scanner;

/*
 * 5.Write a program to check if an array is sorted in ascending order.
     Input:
     Enter the size of the array: 5
     Enter the array elements: 1 2 3 4 5
     Output:
     True
 */
//Time complexity:O(n)
// space complexity:O(n)
public class AscendingOrder {
	public static boolean isArraySorted(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;

			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements : ");
		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean isSorted = isArraySorted(arr);
		if (isSorted) {
			System.out.println("The array is sorted.");
		} else {
			System.out.println("The array is not sorted.");
		}

		sc.close();
	}
}
