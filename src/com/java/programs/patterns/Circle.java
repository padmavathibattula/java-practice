package com.java.programs.patterns;

import java.util.Scanner;

public class Circle {
	public double calArea(double radius) {
		double area = (22 * radius * radius) / 7;
		return area;
	}

	public double calCircumference(double radius) {
		double circumference = (22 * radius) / 7;
		return circumference;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		Circle circle = new Circle();
		double area = circle.calArea(radius);
		System.out.println("Area of the circle is :" + area);
		double circumference = circle.calArea(radius);
		System.out.println("The area of the Circle is : " + circumference);
		sc.close();
	}

}
