package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/*
 * 12. Write a program to find the duplicate elements in an array using a
       HashMap.
       Input:
       Array: [1, 2, 3, 2, 4, 3, 5]
       1 - 1
       2 - 2
       3 - 2
       4 - 1
       5 - 1
       Output:
       Duplicate elements: [2, 3]

 */

public class FindDuplicateElements {
	public ArrayList<Integer> findDuplicateElements(ArrayList<Integer> arrayElements) {
        ArrayList<Integer>Outputarr=new ArrayList<>();
		Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();
		for (Integer e : arrayElements) {
			if (arrayMap.containsKey(e) ) {
				int count =arrayMap.put(e, 1);
				count++;
			} else {
				arrayMap.put(e, 1);
			}
		}
		// print all the duplicate elements:
		
		for (Integer value: arrayMap.keySet()) {
			 if (value.getValue()>1)){
	           
	        	   Outputarr.add(value.getKey());
	           }
			
		}
		//return arrayElements;
		return Outputarr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size = sc.nextInt();
		ArrayList<Integer> obj = new ArrayList<>();
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			obj.add(sc.nextInt());
		}
		FindDuplicateElements arr = new FindDuplicateElements();
		ArrayList<Integer>array = arr.findDuplicateElements(obj);
		System.out.println("Duplicate elements:"+array);

	}

}
