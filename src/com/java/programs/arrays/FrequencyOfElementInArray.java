package com.java.programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the  array :");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // do not use java library 
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}

			System.out.print(arr[i] + "occurs " + count + "times" + ", ");
			count++;
		}
		sc.close();
	}
}
