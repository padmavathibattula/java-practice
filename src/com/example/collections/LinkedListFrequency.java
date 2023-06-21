package com.example.collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 15. Write a program to find the frequency of a given element in the linked
list.
Input:
[1 2 3 2 4 2 2 5 6 3 3 4 2]
Enter element: 2
Output:
Frequency of 2 is: 5
 */

public class LinkedListFrequency {
	public int findFrequency(LinkedList<Integer> list, int element) {
		int frequency = 0;

		for (int num : list) {
			if (num == element) {
				frequency++;
			}
		}

		return frequency;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of elements:");
		int size = sc.nextInt();
		System.out.println("Enter a list  Elements:");
		LinkedList<Integer> linkedlist = new LinkedList<>();
		sc.nextLine();
		for (int i = 0; i < size; i++) {
			linkedlist.add(sc.nextInt());
		}
		System.out.println("Enter elment:");
		int element = sc.nextInt();
		LinkedListFrequency obj = new LinkedListFrequency();
		int frequency = obj.findFrequency(linkedlist, element);
		System.out.println("Frequency of " + element + ": " + frequency);
	}

}
