package com.example.constructors;

import java.util.Scanner;

public class Circle {
	double radius = 0;// instance variable radius

	public Circle(double radius) {// parameterized constructor
		this.radius = radius;// assign value to the instance variable radius
	}

	public double calArea() {
		double area = (22 * this.radius * this.radius) / 7;
		return area;
	}

	public double calCircumference(double radius) {
		double circumference = (22 * this.radius) / 7;
		return circumference;
	}

	public double calDiameter() {
		double diameter = 2 * this.radius;
		return diameter;
	}

	public static void main(String[] args) {
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius of the circle:");
		double radius = sc.nextDouble();
		Circle obj = new Circle(radius);
		double area = obj.calArea();
		System.out.println("The circle of the area is: " + area);
		double circumference = obj.calCircumference(radius);
		System.out.println("The area of the circumference is:" + circumference);
		double diameter = obj.calDiameter();
		System.out.println("the are of the diameter is: " + diameter);
		sc.close();

	}

}
