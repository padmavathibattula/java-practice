package com.example.collections;

public class Person implements Comparable<Person>{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Person person = (Person) obj;
		if (this.age == person.age && this.name.equals(person.name))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		int result = this.name.hashCode();
		result = result + age;
		return result;
	}
	@Override
	public int compareTo(Person obj) {
		if (this.age < obj.age) {
			return -1;
		} else if (this.age > obj.age) {
			return 1;

		} else {
			return 0;
		}

	}
    
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person person1 = new Person("Sujatha", 26);
		Person person2 = new Person("padmavathi", 26);
		Person person3 = new Person("Sujatha", 26);
		Person person4 = person3;
		System.out.println(".equals():" + person1.equals(person3) + "==" + (person1 == person3));
		System.out.println(person1.hashCode());
		System.out.println(person3.hashCode());
	}
}
