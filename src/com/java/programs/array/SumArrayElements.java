package com.java.programs.array;

import java.util.Scanner;

public class SumArrayElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		System.out.print("Enter the length  of the array : ");
		int length = scanner.nextInt();
		//2
		int[] arr = new int[length];// instantiation,empty array create
		System.out.print("Enter the array of the elements :");
		for (int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();// initialization,we are loading elements into the array
		}
		//3
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];//we are adding elements in the array
		}
		//4
		System.out.println("The sum of all elements in the arry is :" + sum);//we are printing sum
		scanner.close();
	}

}
