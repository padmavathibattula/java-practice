package com.example.oops;

public class Aeroplane extends Vehicle{
	public void drive() { // same method and different behavior+inheritance->
		// dynamic polymorphism or method overriding
		System.out.println("Taxing the Aeroplane");
	}
	public static void main(String[] args) {
		Aeroplane obj=new Aeroplane();
		//obj.start();
		obj.drive();
		obj.drive();// java run time polymorphism or dynamic polymorphism
	}
}
