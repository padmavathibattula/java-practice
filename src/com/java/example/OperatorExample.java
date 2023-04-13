package com.java.example;

public class OperatorExample {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int addition = a + b;
		System.out.println("addition :" + addition);// a=10,b=20,addition=10+20=30
		int subtraction = a - b;// 20-10=10
		System.out.println("subtraction :" + subtraction);// 10
		int multiplication = a * b;// 20*10=200
		System.out.println("multiplication :" + multiplication); // 200
		int division = a / b;// 20/10=2
		System.out.println("division :" + division);// 2
		int modulus = a % b;// 20%10=0
		System.out.println("modulus : " + modulus);// 0

		// Assignment operator
		String name = "padma";
		System.out.println(name);
		int c = 0;
		c += 5;// Plus equal to c=c+5=0+5=5
		System.out.println("puls equal to : " + c);
		c -= 5;// minus equal to c=c-5=5-5=0
		System.out.println("minius equal to : " + c);
		c *= 5;// multiplication equal to c=c*5=0*5=0
		System.out.println("multiplication equal to : " + c);
		c /= 5;// division equal to c=c/5=0/5=0
		System.out.println("division equal to : " + c);
		c %= 5;// modulus equal to c=c%5 =0%5=0
		System.out.println("modulus equal to : " + c);

		// comparison operator
		int d = 3;
		int e = 5;
		boolean equalTo = (d == e);// 3==5=false
		boolean notEqualTo = (d != e);// 3!=5=True
		boolean greaterThan = (d > e);// 3>5=false
		boolean lessThan = (d < e);// 3<5=true
		boolean greaterThanequalto = (d >= e);// (3>=5)=false
		boolean lessthanequalTo = (d <= e);// (3<=5)= true
		System.out.println("equalTo : " + equalTo);
		System.out.println("notEqualTo : " + notEqualTo);
		System.out.println("greaterThan : " + greaterThan);
		System.out.println("lessthan : " + lessThan);
		System.out.println("greaterThanequalTo : " + greaterThanequalto);
		System.out.println("lessThanequalto : " + lessthanequalTo);

	}

}
