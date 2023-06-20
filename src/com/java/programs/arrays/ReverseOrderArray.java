package com.java.programs.arrays;
//time complexity:O(n)
// space complexity:O(n)

import java.util.Scanner;

public class ReverseOrderArray {
	public int[] getReverseOrder(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the number of elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		ReverseOrderArray obj = new ReverseOrderArray();
		 obj.getReverseOrder(arr);
	
		sc.close();
	}

}
