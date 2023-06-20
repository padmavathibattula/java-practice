package com.java.programs.arrays;

import java.util.Scanner;

/*
 * 3.Write a program to find the minimum element in an array.
     Input:
     Enter the size of the array: 5
     Enter the array elements: 10 5 20 25 15
     Output:
     The minimum element is 5
*/
// time complexity:O(n)
// space complexity:O(n)
public class MinimumElementInArray {
	public int getMinimumElementsInArray(int[] arr, int min) {
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with min
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		// 2
		int[] arr = new int[length];// instantiation,empty array create
		System.out.print("Enter the array of the elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();// initialization,we are loading elements into the array
		}

		int min = arr[0];
		MinimumElementInArray obj = new MinimumElementInArray();
		// Loop through the array
		min = obj.getMinimumElementsInArray(arr, min);
		// 4
		System.out.println("The minimum element is " + min);// we are printing min element
		sc.close();
	}

}
