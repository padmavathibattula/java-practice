package com.java.programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 14. Write a program to find the kth smallest element in an array.
       Input:
       Enter the size of the array: 5
       Enter the array elements: 10 5 20 25 15
       Enter k value:3
       Output:
       The 3rd smallest element is 15
 */
// time complexity:O(n*n)
// space complexity:O(n)
public class KthSmallestElementInAnArray {
	public int getKthSmallestElement(int[] arr, int k) {
		int kthSmallest = arr[0];
		for (int i = 0; i < k; i++) {
			int max = arr[0];
			int maxIndex = 0;
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
					maxIndex = j;
				}
			}
			kthSmallest = max;
			arr[maxIndex] = arr[arr.length - 1];
			arr = Arrays.copyOf(arr, arr.length - 1);
		}
		return kthSmallest;
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
		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();
		// Find the kth smallest element
		KthSmallestElementInAnArray obj = new KthSmallestElementInAnArray();
		int kthSmallest = obj.getKthSmallestElement(arr, k);

		System.out.println("The " + k + "th smallest element is: " + kthSmallest);
		sc.close();
	}
}
