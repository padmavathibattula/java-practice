package com.example.programs.arrays;
//Time complexity:O(n)
//space complexity:O(n)
import java.util.Scanner;

public class ArrayAverageExample {
	public double getAverage(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the array :");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayAverageExample obj = new ArrayAverageExample();
		double average = obj.getAverage(arr);
		System.out.println("The average of all elements in array is " + average);
		sc.close();
	}

}
