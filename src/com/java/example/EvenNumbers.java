package com.java.example;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<num;i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("the sum of evennumbers "+sum);
		sc.close();
	}
}
