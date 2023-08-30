package com.example.programs.arrays;
// time complexity:O(n*n)
//space complexity:O(n)

import java.util.Scanner;

public class SearchIndexOfElements {
	public int getSearchIndeOfElement(int[] arr, int search) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				index = i;
				break;
			}
		}
		return index;
	}

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
		search = sc.nextInt();
		SearchIndexOfElements obj = new SearchIndexOfElements();
		int index = obj.getSearchIndeOfElement(arr, search);
		System.out.println("The index of search element: " + index);
		sc.close();
	}

}
