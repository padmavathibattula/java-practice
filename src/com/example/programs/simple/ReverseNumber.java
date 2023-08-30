package com.example.programs.simple;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;// 0*10+1234%10=4//4*10+123%10=40+3=43//43*10+12%10=430+2=432//432*10+1%10=1=4321
			n = n / 10;//1234/10=123 // 123/10=12//12/10=1//1/10=0
		}
		System.out.println("Reverse of number : " + rev);
		sc.close();
	}

}
