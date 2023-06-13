package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5.Write a program to remove duplicates from an ArrayList.
     Input:
     [10,20,30,20,40,30,50]
     Output:
     ArrayList after removing duplicates: [10,20,30,40,50]
 */

public class RemoveAllDuplicateElements {
	public ArrayList<Integer> removeAllDuplicatesFromArrayList(ArrayList<Integer> obj) {
		int count = obj.size();

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (obj.get(i).equals(obj.get(j))) {
					obj.remove(j--);
					count--;
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int size = sc.nextInt();
		ArrayList<Integer> obj = new ArrayList<>();
		sc.nextLine();
		System.out.print("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			obj.add(sc.nextInt());
		}
		RemoveAllDuplicateElements rade = new RemoveAllDuplicateElements();
		ArrayList<Integer> outputList = rade.removeAllDuplicatesFromArrayList(obj);
		System.out.println("ArrayList after removing duplicates:" + outputList);

	}

}
