

package com.java.program.arrays;

import java.util.Scanner;

public class SearchIndexOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		System.out.print("Enter the number of elemets in the array : ");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int search = 0;
		System.out.print("Enter the element to be searched :");
		 search= sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("The index of " + search + " is " + i);
			}
		}
		sc.close();
	}

}
