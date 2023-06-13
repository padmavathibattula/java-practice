package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4.Write a program to sum elements from one ArrayList to another ArrayList.
     Input:
     ArrayList 1: [10, 20, 30]
     ArrayList 2: [40, 50, 60]
     Output:
     ArrayList1 after adding all elements from ArrayList 2: [50,70,90]
 */

import java.util.ArrayList;
/*
 * 4.Write a program to sum elements from one ArrayList to another ArrayList.
     Input:
     ArrayList 1: [10, 20, 30]
     ArrayList 2: [40, 50, 60]
     Output:
     ArrayList1 after adding all elements from ArrayList 2: [50,70,90
 */
public class SumOfElementsInArrayList {
	public ArrayList sumofArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> sumList) {
		boolean isList = false;
		if (list1.size() != list2.size()) {
			isList = true;
		} else {
			for (int i = 0; i < list1.size(); i++) {
				int sum = list1.get(i) + list2.get(i);
				sumList.add(sum);
			}

		}
		return sumList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ArrayList1 length:");
		int size = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<>();
		sc.nextLine();
		System.out.println("Enter a Integers");
		for (int i = 0; i < size; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("Enter a number ArrayList2 length:");
		int size1 = sc.nextInt();

		ArrayList<Integer> list2 = new ArrayList<>();
		sc.nextLine();
		System.out.println("Enter a Integers");
		for (int i = 0; i < size1; i++) {
			list2.add(sc.nextInt());
		}

		ArrayList<Integer> sumList = new ArrayList<>();
		SumOfElementsInArrayList obj = new SumOfElementsInArrayList();

		ArrayList<Integer> output = obj.sumofArrayList(list1, list2, sumList);
		System.out.println(" ArrayList1 after adding all elements from ArrayList 2:"+output);
	}

	
}
