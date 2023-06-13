package com.example.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 8.Write a program to remove the first element from a LinkedList
Input:
[10 20 30 40 50]
Output:
LinkedList after removing the first element: 20 30 40 50.
 * 
 */
public class RemoveElementInLinkedList {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of element:");
		int size=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<>();
		System.out.println("Enter a element:");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		RemoveElementInLinkedList obj=new RemoveElementInLinkedList();
		list.removeFirst();
		System.out.println("LinkedList After removal:"+list);
	}

	
	
}
