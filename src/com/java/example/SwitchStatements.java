package com.java.example;

public class SwitchStatements {
	public static void main(String[] args) {
		char grade = 'D';
		switch (grade) {
		case 'A':
			// Statement(s) to be executed if expression matches value A
			System.out.println("Excellent");
			break;
		case 'B':
			// Statements(s) to be executed if expression matches value B
			System.out.println("Good job");
			break;
		case 'C':
			// Statements(s) to be executed if expression matches value C
			System.out.println("You can do better");
			break;
		case 'D':
		case 'E':
			// Statements(s) to be executed if expression matches value D
			System.out.println("You need to improve ");
			break;
		default:
			// Statements(s) to be executed if none of the above cases matches
			System.out.println("Invalid Grade");
			break;

		}
	}

}
