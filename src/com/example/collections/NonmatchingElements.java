package com.example.collections;

import java.util.HashSet;
/*
 * 19. Write a Java program to remove all the elements from one HashSet that
       are not present in another HashSet.
       Input:
       HashSet1: [1, 2, 3, 4, 5]
       HashSet2: [3, 4, 5, 6]
       Output:
       HashSet1 after removing non-matching elements: [3, 4, 5]
 */
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NonmatchingElements {

    public  HashSet<Integer>  removeNonMatchingElements(HashSet<Integer> set1, HashSet<Integer> set2) {
        set1.retainAll(set2);
		return set2;
		
    }
	    public static void main(String[] args) {
	    	Scanner sc =new Scanner(System.in);
			System.out.println("Enter size of elements:");
			int size=sc.nextInt();
			System.out.println("Enter a first set Numbers:");
			HashSet<Integer>set1=new HashSet<>();
			sc.nextLine();
			for(int i=0;i<size;i++) {
				set1.add(sc.nextInt());
			}
			System.out.println("Enter the size of second set:");
			int size1=sc.nextInt();
			System.out.println("Enter a second set numbers:");
			HashSet<Integer>set2=new HashSet<>();
			sc.nextLine();
			for(int i=0;i<size1;i++) {
				set2.add(sc.nextInt());
			}
			
			NonmatchingElements obj = new NonmatchingElements();
			HashSet<Integer>output=obj.removeNonMatchingElements(set1, set2);
			System.out.println("HashSet1 after removing non-matching elements:"+output);
	        
	    }

	}


