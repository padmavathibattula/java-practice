package com.java.example;

public class OperatorPractice {
	public static void main(String[] args) {
		// Arithmetic operator
		int a = 12;
		int b = 3;
		int addition = a + b; // a=12,b=3,12+3=15
		int subtraction = a - b; // a=4, b=3,12-3=9
		int multiplication = a * b;// 12*3=36
		int division = a / b;// 12/3=4
		int modulus = a % b;// 12%3=0
		System.out.println("addition : " + addition);// 15
		System.out.println("subtraction : " + subtraction);// 9
		System.out.println("multiplication : " + multiplication);// 36
		System.out.println("Division : " + division);// 4
		System.out.println("modulus : " + modulus);// 0

		// Assignment operator
		String name = "nihaswi";
		System.out.println(name);
		int c = 0;
		c += 4; // Plus equal to c=c+4=0+4=4
		System.out.println("puls equal to : " + c);
		c -= 4; // minus equal to c=c-4=4-4=0
		System.out.println("minius equal to : " + c);
		c *= 4; // multiplication equal to c=c*4=0*4=0
		System.out.println("multiplication equal to : " + c);
		c /= 4;// division equal to c=c/4=0/4=0
		System.out.println("division equal to : " + c);
		c %= 4; // modulus equal to c=0%4=0
		System.out.println("modulus equal to : " + c);

		// comparison operator or relational operator
		int d = 15;
		int e = 100;
		boolean equalTo = (d == e);// false
		boolean notequalTo = (d != e);// true
		boolean greaterThan = (d > e);// false
		boolean lessThan = (d < e);// true
		boolean greaterThanequalTo = (d >= e);// false
		boolean lessThanequalto = (d <= e);// true
		System.out.println("euqlTo : " + equalTo);
		System.out.println("notequalto : " + notequalTo);
		System.out.println("greaterThan : " + greaterThan);
		System.out.println("lessThan : " + lessThan);
		System.out.println("greaterThanequalTo : " + greaterThanequalTo);
		System.out.println("lessThanequalTo : " + lessThanequalto);

		// Logical operator
		boolean logicalAnd = (d == e) && (d == 15);// false &&true=false
		boolean logicalOr = (d >= 100) || (d > e);// ||false||false=false
		boolean logicalNot = !(d < e);// !true=false
		System.out.println("logicalAnd : " + logicalAnd);
		System.out.println("logicalOr : " + logicalOr);
		System.out.println("logicalNot : " + logicalNot);

	}

}
