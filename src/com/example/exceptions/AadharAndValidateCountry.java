package com.example.exceptions;

import java.util.Scanner;

/*
 * create a class called Aadhar and validate country.if country is not "india" throw the cusom exception called invalidCountryException
 */
public class AadharAndValidateCountry {
	public String getCountryName(String countryname) throws InvalidCountryException {
		if (countryname != "India") {
			throw new InvalidCountryException("Invalid country");
		} else {
			return "123456789A";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a country name: ");
		String countryname = scanner.nextLine();
		scanner.close();
		AadharAndValidateCountry obj = new AadharAndValidateCountry();
		String output = null;
		try {
			output = obj.getCountryName(countryname);
			System.out.println("country name: " + output);
		} catch (InvalidCountryException ivc) {
			System.out.println(ivc.getMessage());
		}

	}

}
