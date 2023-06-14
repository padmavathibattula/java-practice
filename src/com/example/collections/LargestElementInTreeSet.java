package com.example.collections;

import java.util.TreeSet;

/*
 * Write a Java program to find the largest element in a TreeSet.
   Input:
   TreeSet: [3, 1, 4, 2, 5]
   Output:
   Largest element: 5

 */
public class LargestElementInTreeSet {
public static void main(String[] args) {
	 TreeSet<Integer> num = new TreeSet <Integer>();
		num.add(3);
		num.add(1);
		num.add(4);
		num.add(2);
		num.add(5);
		num.add(20);
		int large = num.last();
		System.out.println("Largest Item in TreeSet : " + large);
}

}
