package com.example.programs.patterns;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("List of even numbers :");
		for(int i =0;i<=num;i++) {
			if(i % 2 == 0 ) {
				System.out.println(i+ " ");
			}
		}
		sc.close();
	}

}
