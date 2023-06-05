package com.example.exceptions;

import java.util.Scanner;

public class MarriageRegistraction {
	public String checkValidateCoupleAge(int girlAge, int boyAge) throws invalidCoupleAgeException {
		if (girlAge < 18 || boyAge < 21) {
			throw new invalidCoupleAgeException("Invalid couples");
		} else {
			return "marriageId";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a girl age: ");
		int girlAge = scanner.nextInt();
		System.out.println("Enter a boy age: ");
		int boyAge = scanner.nextInt();
		scanner.close();
		MarriageRegistraction obj = new MarriageRegistraction();
		try {
			String output = obj.checkValidateCoupleAge(girlAge, boyAge);
			System.out.println("valid couple " + output);
		} catch (invalidCoupleAgeException e) {
			e.printStackTrace();
		}

	}


}
