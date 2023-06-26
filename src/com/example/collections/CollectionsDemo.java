package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("padma");
		names.add("sujatha");
		names.add("nihaswi");
		names.add("siva");
		names.add("latha");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		ArrayList<Person>persons=new ArrayList<>();
		Person person1=new Person("padma",35,34.2);
		Person person2=new Person("Sujatha",21,78.6);
		Person person3=new Person("Siva",29,65.3);
		Person person4=new Person("latha",30,34.56);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		System.out.println(persons);
		Collections.sort(persons);
		System.out.println(persons);
	}

}
