package com.example.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 9.Write a program to add an element at the end of a LinkedList
     Input:
     [10 20 30 40 50]
     Element to add: 6
     Output:
     LinkedList after adding element 6 at end: 10 20 30 40 50 6.
 */

public class AddElementAtEndInLinkedList {
	public LinkedList addElement(LinkedList list, int addElement) {
		list.addLast(addElement);
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size=sc.nextInt();
		LinkedList list=new LinkedList();
		System.out.println("Enter a element:");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the add:");
		int value=sc.nextInt();
		AddElementAtEndInLinkedList obj=new AddElementAtEndInLinkedList();
		list.addLast(value);
		System.out.println("LinkedList After removal:"+list);
		
		

	}

}
