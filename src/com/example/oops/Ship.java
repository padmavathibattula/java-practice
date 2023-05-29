package com.example.oops;

public class Ship extends Vehicle{
	public void drive() {
		System.out.println("sailing the ship on water");
	}
	public void start() {
		System.out.println("The start the vehicle");
	}
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.drive();
		obj.start();
	}

}
