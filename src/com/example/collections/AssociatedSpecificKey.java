package com.example.collections;

import java.util.Scanner;
import java.util.TreeMap;

/*
 * 24. Write a Java program to get the value associated with a specific key
       in a TreeMap.
       Input:
       TreeMap: {Apple=Red, Banana=Yellow, Orange=Orange}
       Key to retrieve value: Banana
       Output:
       Value associated with key Banana: Yellow

 */

public class AssociatedSpecificKey {
	public TreeMap<String,String>getSpecificKeyValue(TreeMap<String,String>map){
		TreeMap<String,String>treeMap=new TreeMap<>();
		for(int i=0;i<map.size();i++) {
			treeMap.get("banana");
		}
		return treeMap;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number of elements:");
		int size=sc.nextInt();
		TreeMap<String,String>map=new TreeMap<>();
		sc.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Enter a key:");
			String key=sc.nextLine();
			System.out.println("Enter a value:");
			String value = sc.nextLine();
			map.put(key, value);
			sc.nextLine();
		}
		System.out.println("key to retrieve value:");
		String retriveval= sc.nextLine();
		for(String fruit:map.keySet()) {
			System.out.println(map);
		}
		AssociatedSpecificKey obj = new AssociatedSpecificKey();
		TreeMap<String,String>treemap1=obj.getSpecificKeyValue(map);
		System.out.println("value associated with key banana : "+treemap1);
		System.out.println("the value is:"+map);
		
		
	}

}
