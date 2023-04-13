package com.java.example;

public class Fruit {
	String name = "mango";
	String season = "summer";
	String location = "AndraPradesh";
	int price = 20;

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		System.out.println("in " + fruit.season + " the cost of " + fruit.name + "  is " + fruit.price
				+ " Rupees is in " + fruit.location);
	}

}
