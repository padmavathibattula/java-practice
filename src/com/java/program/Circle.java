package com.java.program;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		double r = sc.nextInt();
		double  area;
		area = (r*r)*Math.PI;
		System.out.println("The area of the Circle is : " + area);
		sc.close();
	}

}
