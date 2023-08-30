package com.example.programs.arrays;
//time complexity:O(n)
// space complexity:O(1)

import java.util.Scanner;

public class SumOfAllElementsInArray {
	public  int getSumOfElement(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the number of elements in the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		SumOfAllElementsInArray obj = new SumOfAllElementsInArray();
		sum = obj.getSumOfElement(arr, sum);
		System.out.println(sum);
		sc.close();
	}

}
