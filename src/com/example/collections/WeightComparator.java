package com.example.collections;

import java.util.Comparator;

public class WeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		double weight1 = o1.getWeight();
		double weight2 = o2.getWeight();
		if (weight1 == weight2) {
			return 0;
		} else if (weight1 < weight2) {
			return -1;
		} else {
			return 1;
		}
	}

}
