package com.example.collections;

import java.util.Comparator;

//External sort - sorting logic is outside of the class
public class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		if (age1 == age2) {
			return 0;
		} else if (age1 > age2) {
			return 1;
		} else {
			return -1;
		}
	}

}
