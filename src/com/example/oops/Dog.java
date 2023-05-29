package com.example.oops;

public class Dog extends Animal {
	public void sound() {
		System.out.println("the dog is eating");
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sleep();
		dog.eat();
		
	}

}
