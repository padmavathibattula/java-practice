package com.example.constructors;
/*
 * Area=1/2(b1+b2)
 * perimeter=a+b1+a1+b2
 */
import java.util.Scanner;
public class Trapezoid {
	double a,b1,a1,b2,h=0;
	public Trapezoid(double a,double b1,double a1,double b2,double h) {
		this.a=a;
		this.b1=b1;
		this.b2=b2;
		this.a1=a1;
		this.h=h;
	}
	public double calPerimeter() {
		return this.a+this.b1+this.a1+this.b2;
	}
	public double calArea() {
		return 1/2 * this.h* (this.b1+this.b2);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the height of the Trapeziod:");
		double height=sc.nextDouble();
		System.out.println("Enter the a is :");
		double a=sc.nextDouble();
		System.out.println("Enter the b1 is:");
		double b1=sc.nextDouble();
		System.out.println("Enter the b2 is:");
		double b2=sc.nextDouble();
		System.out.println("Enter the a1 is:");
		double a1=sc.nextDouble();
		Trapezoid obj=new Trapezoid(a,b1,b2,a1,height);
		double perimeter=obj.calPerimeter();
		System.out.println("The perimeter of the trapeziod:"+perimeter);
		double area=obj.calArea();
		System.out.println("the area of the trapeziod: "+area);
		sc.close();
		
		
	}
	
}
