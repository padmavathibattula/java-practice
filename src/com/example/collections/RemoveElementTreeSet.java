package com.example.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 22. Write a Java program to remove a specific element from a TreeSet.
      Input:
      TreeSet: [Apple, Banana, Orange]
      Element to remove: Banana
      Output:
      TreeSet after removal: [Apple, Orange]
 */
public class RemoveElementTreeSet {
	public TreeSet removeElement(TreeSet set, String element) {
		set.remove(element);
		return set;
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Eneter size of elements:");
		int size = sc.nextInt();
		System.out.println("Enter a treeset elements:");
		TreeSet<String>treeset=new TreeSet<>();
		String str1 =sc.nextLine();
		for(int i=0;i<size;i++) {
			treeset.add(sc.nextLine());
		}
		System.out.println("Enter the remove string: ");
		String element=sc.nextLine();
		RemoveElementTreeSet obj=new RemoveElementTreeSet();
		TreeSet outputset=obj.removeElement(treeset, element);
		TreeSet<String> outputset1=obj.removeElement(treeset, element);
		System.out.println("TreeSet after remove: "+outputset1);
	}
}
