package com.example.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 10.Write a program to remove all elements from a linked list that are greater than a given value
Input:
[1 6 2 3 4 5 9]
Enter the value:4
Output:
LinkedList after removal:[1 2 3 4]
 */

public class RemoveFirstElementInLinkedList {
	public LinkedList<Integer> removeElementGreaterThan4(LinkedList<Integer> list,int value) {
		for(int i=0;i<list.size();i++) {
			int element=(int)list.get(i);
			if(element>value) {
				list.remove(element);
				
			}
		}
		return list;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of element:");
		int size=sc.nextInt();
		LinkedList<Integer> list=new LinkedList();
		System.out.println("Enter a element:");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		RemoveFirstElementInLinkedList obj=new RemoveFirstElementInLinkedList();
		LinkedList ouputlist=obj.removeElementGreaterThan4(list, value);
		System.out.println("LinkedList After removal:"+ouputlist);
	}
	
}
