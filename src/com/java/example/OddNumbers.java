package com.java.example;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int sum = 0;
		//sc.close();
		for(int i=0;i<num;i++) {
			if(i % 2!=0) {
				sum += i;
			}
		}
		System.out.println("The sumofoddNumbers " +sum);
			sc.close();
		}
	   
	}


