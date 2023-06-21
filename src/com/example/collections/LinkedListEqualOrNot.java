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
	
	public boolean isLinkedListsEquals(LinkedHashSet set1,LinkedHashSet set2) {
		boolean value=set1.equals(set2);
		return value;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of elements:");
		int size=sc.nextInt();
		System.out.println("Enter a first set Elements:");
		LinkedHashSet<String>set1=new LinkedHashSet<>();
		String str1=sc.nextLine();
		for(int i=0;i<size;i++) {
			set1.add(sc.nextLine());
		}
		System.out.println("Enter a second set elements:");
		LinkedHashSet<String>set2=new LinkedHashSet<>();
		String str2=sc.nextLine();
		for(int i=0;i<size;i++) {
			set2.add(sc.nextLine());
		}
		LinkedListEqualOrNot obj = new LinkedListEqualOrNot();
		boolean linkedSets = obj.isLinkedListsEquals(set1, set2);
		System.out.println("LinkedHash sets are equal?:"+linkedSets);
	}
}
