package com.example.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
16. Write a Java program to check if a specific element exists in a
LinkedHashSet.
Input:
LinkedHashSet: [Java, Python, C++]
Element to check: Python
Output:
Element Python exists in LinkedHashSet.
 */

public class SpecificElementExistsInLinkedList {
	public boolean  existsElement(LinkedHashSet<String> set,String existEle) {
		System.out.println(set);
		System.out.println(existEle);
		boolean isPresent=set.contains(existEle);
		return isPresent;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size=scanner.nextInt();
		System.out.println("Enter elements: ");
		scanner.nextLine();
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<size;i++) {
			set.add(scanner.nextLine());
	}
		System.out.println("Enter a exist element: ");
		String existEle=scanner.nextLine();

		SpecificElementExistsInLinkedList obj=new SpecificElementExistsInLinkedList();
		boolean  outputSet=obj.existsElement(set, existEle);
		if(outputSet) {
			System.out.println("Element "+existEle+" exists in LinkedHashSet");
		}else {
			System.out.println("Element "+existEle+" does not exist in LinkedHashSet");
		}

	}

}
