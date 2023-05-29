package com.example.oops;

public class Lion extends Animal{
	public void sound() {
		System.out.println("Lion is roraing");
	}
	public static void main(String[] args) {
		Lion obj =new Lion();
		obj.eat();
		obj.sleep();
		obj.sound();
	}

}
