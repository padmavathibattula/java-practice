package com.example.constructors;
/*
 * perimeter =a+b+c;
 * area =1/2*b*h;
 */

import java.util.Scanner;

public class TriAngle {
	double a,b,c,height=0;
	public TriAngle(double a,double b,double c,double height) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.height=height;
	}
	
	public double calPerimeter() {
		return this.a+this.b+this.c;
		
	}
	public double calArea() {
		return (1/2)*this.b*this.height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle:");
		double height = sc.nextDouble();
		System.out.println("Enter the a  is :");
		double a =sc.nextDouble();
		System.out.println("Enter the b is:");
		double b=sc.nextDouble();
		System.out.println("Enter the c is:");
		double c=sc.nextDouble();
		sc.close();
		TriAngle obj = new TriAngle(a, b, c, height);
		double perimeter=obj.calPerimeter();
		System.out.println( "The perimeter of the triangle is:"+perimeter);
		double area=obj.calArea();
		System.out.println("The area of the triangle is:"+area);
	}
	

}
