package com.example.collections;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Mango", "AndhraPredesh");
		map.put("Orange", "Maharastra");
		map.put("banana", "karnataka");
		map.put("apple", "Keshmir");
		for (String fruit : map.keySet()) {
			System.out.print(fruit + " ");
			System.out.print(map.get(fruit));
			System.out.println();
		}
		System.out.println("Removing banana:" );
		map.remove("banana");
		System.out.println(map);
		System.out.println("Mango is replace to tamilnaadu:");
		map.replace("Mango", "Tamilnaadu");
		System.out.println(map.get("grapes"));
		System.out.println(map.size());

	}
}
