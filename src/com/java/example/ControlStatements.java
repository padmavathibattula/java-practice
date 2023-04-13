package com.java.example;

public class ControlStatements {
	public static void main(String[] args) {
		int age = 15;
		boolean isPancard = true;
		if (age > 18) { // condition can be comparison or logical
			// statement(s) to be executed if condition is true
			System.out.println("Eligible to vote");
			
		} 
		else if(isPancard){
			System.out.println("Eligible to vote");
		}
		else {
			// statement to be executed if condition is false
			System.out.println("Not Eligible to vote");
		}
		
		int dayOfWeek = 4;
		switch(dayOfWeek) {
		case 1:
			// statement(s) to be executed if expression matches value1
			System.out.println("Sunday");
			//break;
		case 2:
			// statement(s) to be executed if expression matches value2
			System.out.println("Monday");
			//break;
		case 3:
			// statement(s) to be executed if expression matches value3
			System.out.println("Tuesday");
			//break;
		case 4:
			// statement(s) to be executed if expression matches value4
			System.out.println("Wednsday");
			break;
		case 5:
			// statement(s) to be executed if expression matches value5
			System.out.println("Thursday");
			//break;
		case 6:
			// statement(s) to be executed if expression matches value6
			System.out.println("Friday");
			//break;
		case 7:
			// statement(s) to be executed if expression matches value7
			System.out.println("Saturday");
			//break;
		default:
			// statement(s) to executed if none of the above cases matches
			System.out.println("Invalid");
			//break;
		}
	}

}
