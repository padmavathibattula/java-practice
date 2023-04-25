package com.java.programs.patterns;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = sc.nextInt();
		int i =0;
		while(i<=num) {
			System.out.println(i+ "");
			i++;
		}
		sc.close();
	}
}
 