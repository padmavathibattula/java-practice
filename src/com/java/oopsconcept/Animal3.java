package com.java.oopsconcept;

public class Animal3 {
	void eat() {
		System.out.println("eating----");
	}

}
class Dog3 extends Animal3{
	void bark() {
		System.out.println("barking-----");
	}
}
class Cat extends Animal3{
	void meow() {
		System.out.println("meoww----");
	}
}
class TestInheritance3{
	public static void main(String[] args) {
		Cat c= new Cat();
		c.eat();
		c.meow();
		
	}
}
