package com.java.example;

public class OddEvenStatements {
	public static void main(String[] args) {
		int num = 201;
		switch(num%2) {
		case 0:
			System.out.println(num+ " is an Even number ");
			break;
		case 1:
			System.out.println(num+ " is an Odd number ");
			break;
		default:
			System.out.println(" The number is invalid ");
			break;
		}
	}

}
