package com.example.collections;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 30. Write a Java program to convert a LinkedHashMap to a TreeMap.
Input:
LinkedHashMap: {C=3, A=1, B=2}
Output:
TreeMap: {A=1, B=2, C=3}
 */

public class ConvertLinkedMapToTreeMap {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number of elements:");
		int size=sc.nextInt();
		LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
		sc.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Enter a key:");
			String key = sc.nextLine();
			System.out.println("Enter a value:");
			int value = sc.nextInt();
			map.put(key, value);
			sc.nextLine();
		}
		System.out.println("LinkedHashMap:"+map);
		TreeMap<String, Integer> tmap = new TreeMap<>();
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			tmap.put(key, value);
		}
		// tmap.add(map);
		System.out.println("TreeMap: " + tmap);
	
	}

}
