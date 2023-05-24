package com.example.constructors;
/*
 * Area=lh
 * perimeter=2l+2w
 */
import java.util.Scanner;
public class Parallelogram {
	double height,length,width;
	public Parallelogram(double length,double width,double height) {
		this.height=height;
		this.width=width;
		this.length=length;
	}
	public double claPerimeter() {
		return 2*this.length+2*this.width;
	}
	public double calArea() {
		return this.length*this.height;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of the Area:");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the area:");
		double width=sc.nextDouble();
		System.out.println("Enter the height of the area:");
		double height=sc.nextDouble();
		Parallelogram obj =new Parallelogram(length,width,height);
		double perimeter=obj.claPerimeter();
		System.out.println("The perimeter of the parallelogram:"+perimeter);
		double area=obj.calArea();
		System.out.println("The area of the parallelogram:"+area);
		sc.close();
	}
	

}
