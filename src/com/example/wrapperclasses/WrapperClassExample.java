package com.example.wrapperclasses;

public class WrapperClassExample {
	public static void main(String[] args) {
		// create an Integer object
		Integer number = new Integer(10);
		System.out.println(number);
		// convert a String to an Integer object
		String str = "20";
		Integer number2 = Integer.valueOf(str);
		System.out.println(number2);
		// Autoboxing:convert int to Integer object
		int salary = 50000;
		Integer number3 = salary;
		System.out.println(number3);
		// unboxing:convert Integer object to int
		int number4 = number3;
		System.out.println(number4);

		// create a Double object
		Double number5 = new Double(12.54);
		System.out.println(number5);
		// convert a String to Double object
		String str1 = "12.534";
		Double number6 = Double.valueOf(str1);
		System.out.println(number6);
		// Autoboxing: convert double to Double object
		double salary1 = 10546.678;
		Double number7 = salary1;
		System.out.println(number7);
		// Unboxing:convert Double object to double
		double number8 = number7;
		System.out.println(number8);

		// create a Boolean object
		Boolean isEmployee = new Boolean(true);
		System.out.println(isEmployee);
		// convert a String to Boolean object
		String str2 = "false";
		Boolean isEmployee1 = Boolean.valueOf(str2);
		System.out.println(isEmployee1);
		// Autoboxing:convert boolean to Boolean object
		boolean isEmployee2 = true;
		Boolean isEmployee3 = isEmployee2;
		System.out.println(isEmployee3);
		// unboxing:convert Boolean object to boolean
		boolean isEmployee4 = isEmployee3;
		System.out.println(isEmployee4);

		// create a Character object
		Character char1 = new Character('a');
		System.out.println(char1);
		// convert a String to Character object
		String str4 = "c";
		Character char2 = str4.charAt(0);
		System.out.println(char2);
		// Autoboxing:convert char to Character object
		char char3 = 'd';
		Character char4 = char3;
		System.out.println(char4);
		// unboxing:convert Character object to char
		char char5 = char4;
		System.out.println(char5);

	}

}
