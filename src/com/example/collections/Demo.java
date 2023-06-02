package com.example.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String array length:");
		int length = sc.nextInt();
		sc.nextLine();
		String[] fruits = new String[length];
		System.out.println("Enter the fruits:");
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = sc.nextLine();
		}
		//fruits[4]="guava";
		
		boolean hasMango = false;
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
			if (fruits[i].equals("Mango")) {
				hasMango = true;
				break;
			}

		}
		System.out.println(hasMango);
		
		sc.close();
	}

}
