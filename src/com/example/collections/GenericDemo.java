package com.example.collections;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> flowers = new ArrayList<>();
		flowers.add("rose");
		flowers.add("jashim");
		flowers.add("lily");
		flowers.add("tulip");
		//flowers.add(1);
		String flower = flowers.get(0);
		System.out.println(flowers);
	}

}
