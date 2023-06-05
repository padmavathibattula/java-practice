package com.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("Andhra Pradesh");
		list.add("Telangana");
		list.add("Tamilanadu");
		list.add("karnataka");
		list.add("kerala");
		list.add("Gova");
		list.add("odisa");
		for(int i=0;i<list.size();i++) {
			String states=(String)list.get(i);
			String output=states.toUpperCase();
			//System.out.println(output);
		}
		// 0->1->2->3->4->5
		System.out.println(list.isEmpty());//false
		System.out.println(list);
		list.addFirst("Maharastra");
		list.addLast("panjab");
		list.add(2, "delhi");
		list.set(8, "Assam");
		System.out.println(list);
		LinkedList list2=new LinkedList();
		System.out.println(list2.isEmpty());//true
		ArrayList numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println(numbers);
		numbers.add(1,34);
		System.out.println(numbers);
		numbers.set(2, 6);
		System.out.println(numbers);
		
	}

}
