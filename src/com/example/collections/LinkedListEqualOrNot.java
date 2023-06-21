package com.example.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 18. Write a Java program to check if two LinkedHashSets are equal.
       Input:
       LinkedHashSet1: [A, B, C]
       LinkedHashSet2: [C, A, B]
       Output:
       LinkedHashSets are equal.
 */


public class LinkedListEqualOrNot {
	
	public boolean isLinkedListsEquals(LinkedHashSet<String> set1,LinkedHashSet<String> set2) {
		boolean value=set1.equals(set2);
		return value;
	}
	public static void main(String[] args) {
		LinkedHashSet<String>set1=new LinkedHashSet<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of elements:");
		int size=sc.nextInt();
		System.out.println("Enter a first set Elements:");
		for(int i=0;i<size;i++) {
			set1.add(sc.next());
		}
		System.out.println(set1);
		System.out.println("Enter a second set elements:");
		LinkedHashSet<String>set2=new LinkedHashSet<>();
		for(int i=0;i<size;i++) {
			set2.add(sc.next());
		}
		System.out.println(set2);
		LinkedListEqualOrNot obj = new LinkedListEqualOrNot();
		boolean linkedSets = obj.isLinkedListsEquals(set1, set2);
		System.out.println("LinkedHash sets are equal?:"+linkedSets);
		sc.close();
	}
}
