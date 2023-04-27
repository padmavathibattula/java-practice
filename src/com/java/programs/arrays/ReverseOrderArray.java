package com.java.programs.arrays;

import java.util.Scanner;

public class ReverseOrderArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the number of elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = arr.length - 1; i >=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		sc.close();
	}
}
