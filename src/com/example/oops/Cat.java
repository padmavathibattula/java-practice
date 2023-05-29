package com.example.oops;

public class Cat extends Animal{
	public void sound() {
		System.out.println("cat is meow");
	}
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		obj.sleep();
		obj.sound();
				
	}

}
