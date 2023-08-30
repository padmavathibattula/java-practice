package com.example.programs.arrays;

import java.util.Scanner;

/*
 * 12. Write a program to find the number of occurrences of a given element
in an array.
Input:
Enter the size of the array: 6
Enter the array elements: 3 7 2 9 6 3
Enter the element to search for: 3
Output:
The element 3 occurs 2 times in the array

 */
// time complexity:O(n)
// space complexity:O(n)
public class NumberOfOccurrenceOfElements {
	public int[] getNumberOfOccurencesOfElements(int[] arr, int search) {
		int[] outputArr = new int[2];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				count = count + 1;
			}
		}
		outputArr[0] = search;
		outputArr[1] = count;
		return outputArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the arry : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the number of elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int search = 0;
		System.out.print("Enter the element to be searched :");
		search = sc.nextInt();

		NumberOfOccurrenceOfElements obj = new NumberOfOccurrenceOfElements();
		int[] output = obj.getNumberOfOccurencesOfElements(arr, search);
		System.out.print("The element " + output[0] + " occurs " + output[1] + " times in the array");
		sc.close();
	}

}
