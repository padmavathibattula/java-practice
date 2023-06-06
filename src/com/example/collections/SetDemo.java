package com.example.collections;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(6);
		set.add(8);
		set.add(9);
		set.add(10);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(7));
	    set.add(144444);
	    set.add(45);
	    set.add(145);
	    set.add(120);
		System.out.println(set);
		for(Object number:set) {
			System.out.print(number+ " ");
		}
	}

}
