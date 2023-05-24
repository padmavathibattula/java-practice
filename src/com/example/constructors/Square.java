package com.example.constructors;

import java.util.Scanner;

/*
 * perimeter=4s
 * Area=s*s
 */
public class Square {
	double side=0;
	public Square(double s) {
		this.side=s;
	}
	public double calPerimeter() {
		return 4*this.side;
	}
	public double calArea() {
		return this.side*this.side;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the Square:");
		double side=sc.nextDouble();
		Square obj = new Square(side);
		double perimeter=obj.calPerimeter();
		System.out.println("The perimeter of the square is:"+perimeter);
		double area=obj.calArea();
		System.out.println("The Area of the square is:"+area);
		sc.close();
		
	}

}
