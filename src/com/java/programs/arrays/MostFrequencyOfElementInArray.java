package com.java.programs.arrays;

import java.util.Scanner;
/*
 * 19. Write a program to find the element that occurs the most in an array
of integers and the number of times it occurs.
Input:
Enter the size of the array: 8
Enter the array elements: 1 2 3 2 4 1 5 1
Output:
Element: 1, Occurrences: 3

 */
// time complexity:O(n)
// space complexity:O(n)

public class MostFrequencyOfElementInArray {
	public int[] getMostFrequencyOfElementInArray(int[] arr) {
		int maxCount = 0;
		int maxElement = 0;
		int count = 0;
		int[] outputArr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxElement = arr[i];
				maxCount = count;
			}
		}
		outputArr[0] = maxElement;
		outputArr[1] = maxCount;

		return outputArr;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenth of the array :");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the array:");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}

		MostFrequencyOfElementInArray obj = new MostFrequencyOfElementInArray();
		int[] output = obj.getMostFrequencyOfElementInArray(arr);
		System.out.println("Element: " + output[0] + " occurences: " + output[1]);

		sc.close();
	}
}
