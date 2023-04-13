package com.java.example;

public class Operator {
	public static void main(String[] args) {
		// Arithmetic operators
		int a = 10;
		int b = 2;
		int addition = a + b;
		int subtraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		int modulus = a % b;
		System.out.println("addition :" + addition);
		System.out.println("subtraction :" + subtraction);
		System.out.println("multiplication :" + multiplication);
		System.out.println("division :" + division);
		System.out.println("modulus :" + modulus);

		// Assignment operators
		String name = "Padmavathi"; // equal to
		System.out.println(name);
		int c = 0;
		c += 2; // Plus equal to c=c+2 = 0+2=2
		System.out.println("plus equal to :" + c);
		c -= 2; // minus equal to c=c-2=2-2=0
		System.out.println("minus equal to :" + c);
		c *= 2; // multiplication equal to c= c*2=0*2=0
		System.out.println("multiplication equal to :" + c);
		c /= 2; // division equal to c=c/2=0/2=0
		System.out.println("division equal to :" + c);

		// comparison or relational operators
		int d = 20;
		int e = 10;
		boolean equalTo = (d == e); // false
		boolean notEqualTo = (d != e); // true
		boolean greaterThan = (d > e); // true
		boolean lessThan = (d < e); // false
		boolean greaterThanorEqualTo = (d >= e); // true
		boolean lessThanorEqualTo = (d <= e); // false
		System.out.println("equal to : " + equalTo);
		System.out.println("notEqualTo : " + notEqualTo);
		System.out.println("greterthan : " + greaterThan);
		System.out.println("lessThan : " + lessThan);
		System.out.println("greaterThanorEqualTo : " + greaterThanorEqualTo);
		System.out.println("lessThanorEqualTo : " + lessThanorEqualTo);

		// Logical operator
		boolean logicalAnd = (d > e) && (d < 100); // true && true = true
		boolean logicalOr = (d < e) || (e > 2); // false || true = true
		boolean logicalNot = !(d == e); // !false = true
		System.out.println("logicalAnd : " + logicalAnd);
		System.out.println("logicalOr : " + logicalOr);
		System.out.println("logicalNot : " + logicalNot);
		

	}

}
