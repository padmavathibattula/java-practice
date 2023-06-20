package com.java.programs.arrays;

import java.util.Scanner;
/*
 * 6.Write a program to find the second largest element in an array.
     Input:
     Enter the size of the array: 5
     Enter the array elements: 10 5 20 25 15
     Output:
     The second largest element is 20
*/
// time complexity:O(n)
// space complexity:O(n)
public class SecondLargestElement {
	public int getSecondLargestElement(int[] arr) {
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
		
		return secondMax;
		
	}
		
	
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
		
		SecondLargestElement obj = new SecondLargestElement();
		int output = obj.getSecondLargestElement(arr);
		
		System.out.println("The second largest element is " + output);
		sc.close();
	}
}
