package com.java.oopsconcept;

public class Animal {
	void eat() {
		System.out.println("eating---");
	}

}

class Dog extends Animal {

	void bark() {
		System.out.println("barking---");
	}
}

class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
	}
}
