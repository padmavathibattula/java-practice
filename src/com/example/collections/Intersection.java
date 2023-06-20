package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 *  21. Write a program to find the intersection of two arrays using a
HashMap.
Input:
Array 1: [1, 2, 4, 3, 4, 5]
Array 2: [4, 4, 4, 5, 6, 4, 7, 8, 4]
Map-1
1-1
2-1
4-0
3-1
5-1
Output:
[4,4]
Intersection of arrays: [4, 4, 5]
 */
public class Intersection {
	public static ArrayList<Integer> findIntersection(int[] array1, int[] array2) {
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		ArrayList<Integer> intersection = new ArrayList<>();

		// Count frequencies of elements in array1
		for (Integer element : array1) {
			if (frequencyMap.containsKey(element)) {
				int count = frequencyMap.get(element);
				count++;
				frequencyMap.put(element, count);
			} else {
				frequencyMap.put(element, 1);
			}
		}

		// Find intersection by checking elements of array2 with frequency map
		for (int num : array2) {
			if (frequencyMap.containsKey(num)) {
				int count = frequencyMap.get(num);
				if (count > 0) {
					intersection.add(num);
					frequencyMap.put(num, count - 1);
				}

			}
		}

		return intersection;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no of elements: ");
		int size = scanner.nextInt();
		System.out.println("Enter first array elements: ");
		int[] array1 = new int[size];
		for (int i = 0; i < size; i++) {
			array1[i] = scanner.nextInt();
		}
		System.out.println("Enter second array elements: ");
		int[] array2 = new int[size];
		for (int i = 0; i < size; i++) {
			array2[i] = scanner.nextInt();
		}

		ArrayList<Integer> intersection = findIntersection(array1, array2);

		System.out.println("Intersection: " + intersection);
	}

}
