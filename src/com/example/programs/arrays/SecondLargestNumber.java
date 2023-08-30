package com.example.programs.arrays;
// time complexity:O(n)
// space complexity:O(n)
import java.util.Arrays;
/*
 * 7.Write a program to reverse an array.
     Input:
     Enter the size of the array: 5
     Enter the array elements: 1 2 3 4 5
     Output:
     5 4 3 2 1
*/
import java.util.Scanner;
public class SecondLargestNumber {
	public int getSecondLargestNumber(int[] arr) {
		int secondLargest = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != arr[arr.length - 1]) {
				secondLargest = arr[i];
				break;
			}
		}
		return secondLargest;
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
		System.out.print("Enter the array element:");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);// do not use java library 
		SecondLargestNumber obj = new SecondLargestNumber();
		int secondLargest =obj.getSecondLargestNumber(arr);
		System.out.println("The second largest element is " + secondLargest);
		sc.close();
	}

	
}
