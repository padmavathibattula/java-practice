package com.example.constructors;
/*
 * Perimeter=2w+2l
 * Area=l*w
 * 
 */
import java.util.Scanner;
public class Rectangle {
	double length=0;
	double width=0;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double calPerimeter() {
		return 2*this.width+2*this.length;
	}
	public double calArea() {
		return length*width;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle:");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the Rectangle:");
		double width=sc.nextDouble();
		Rectangle obj=new Rectangle(length,width);
		double perimeter=obj.calPerimeter();
		System.out.println("The perimeter of the Rectangle is:"+perimeter);
		double area=obj.calArea();
		System.out.println("The area of the Rectangle is:"+area);
		sc.close();
	}

}
