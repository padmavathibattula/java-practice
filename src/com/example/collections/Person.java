package com.example.collections;

//default sort - internal sort - sorting logic is inside of the class
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private double weight;

	public Person(String name, int age,double weight) {
		this.name = name;
		this.age = age;
		this.weight=weight;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
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
		if (this.weight < obj.weight) {
			return -1;
		} else if (this.weight > obj.weight) {
			return 1;

		} else {
			return 0;
		}

	}
    
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age+" ,weight="  +weight+ "]";
	}

	public static void main(String[] args) {
		Person person1 = new Person("Sujatha", 26,12.3);
		Person person2 = new Person("padmavathi", 26,34.5);
		Person person3 = new Person("Sujatha", 26,56.4);
		Person person4 = person3;
		System.out.println(".equals():" + person1.equals(person3) + "==" + (person1 == person3));
		System.out.println(person1.hashCode());
		System.out.println(person3.hashCode());
	}
}
