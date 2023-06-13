package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1.Write a program to create an ArrayList and add five integers to it. Then
     print the elements of the ArrayList.
 */

public class AddArrayList {
	public ArrayList<Integer> AddIntegersFromArrayList(ArrayList<Integer> obj) {
		for (int i = 0; i < obj.size(); i++) {
			int input = obj.get(i);
		}
		return obj;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of a Integers");
		int size = sc.nextInt();
		ArrayList<Integer> obj = new ArrayList();
		sc.nextLine();
		System.out.println("Enter a Integers");
		for (int i = 0; i < size; i++) {
			obj.add(sc.nextInt());
		}
		AddArrayList addList = new AddArrayList();
		ArrayList<Integer> intList = addList.AddIntegersFromArrayList(obj);
		System.out.println("ArrayList is" + intList);
		sc.close();
	}
	

}
