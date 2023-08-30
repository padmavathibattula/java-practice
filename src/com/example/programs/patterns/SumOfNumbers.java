package com.example.programs.patterns;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt(); // 876
		int sum =0;
		int digit = 0;
		
		while(number>0) {
			digit = number%10;//876%10=6, 87%10=7,8%10=8
			sum = sum+digit; //0+6=6,6+7=13,13+8=21
			number = number/10;//876/10=87,87/10=8,8/10=0
			
		}
		System.out.println("The sum of numbers :" +sum);
		sc.close();
	}

}
