package com.java.programs.arrays;
// time complexity:O(n)
// space complexity:O(n)

import java.util.Scanner;

public class MaximumElementInArray {
	public int getMaximumElementInArray(int[] arr, int max) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) // we are compare elements of array with max
				max = arr[i];
		}
		return max;
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
		// 3
		int max = arr[0];
		MaximumElementInArray obj = new MaximumElementInArray();
		max = obj.getMaximumElementInArray(arr, max);
		// 4
		System.out.println("The maximum element is : " + max); // we are printing maximum element
		sc.close();
	}

}
