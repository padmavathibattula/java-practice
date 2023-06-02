package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList obj = new ArrayList();
	System.out.println("Enter the number of fruits you want:");
	int numberOfFruits = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the fruits:");
	for (int i = 0; i < numberOfFruits; i++) {
		obj.add(sc.nextLine());
	}
	obj.add("Guava");
	System.out.println(obj);
	boolean isMangoPresent = obj.contains("Mango");
	System.out.println("From ArrayList:" + isMangoPresent);
	sc.close();
}
}
