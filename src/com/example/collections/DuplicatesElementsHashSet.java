package com.example.collections;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 10. Write a program to remove the duplicate elements in an array using a
       HashSet.
       Input:
       Array: [1, 2, 3, 2, 4, 3, 5, 2, 4]
       Output:
       Array after removing duplicate elements: [1, 2, 3, 4, 5]
 */

public class DuplicatesElementsHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = sc.nextInt();
		HashSet<Integer> obj = new HashSet<>();
		sc.nextLine();
		System.out.println("Enter the Hashset elements:");
		for (int i = 0; i < size; i++) {
			obj.add(sc.nextInt());
		}
		for (Object number : obj) {
			System.out.print(number + " ");
		}
		sc.close();
	}

}
