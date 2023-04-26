package com.java.programs.array;

import java.util.Scanner;

public class MostFrequencyOfElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenth of the array :");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the array:");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int maxCount = 0;
		int maxElement = 0;

		int count = 0;
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
		System.out.print("Element :" + maxElement + "," + "Occurrences : " + maxCount);
		sc.close();
	}
}
