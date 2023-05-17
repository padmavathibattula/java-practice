package com.java.programs.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 13. Write a program to find the frequency of each element in an array.
      Input:
Enter the size of the array: 8
Enter the array elements: 1 2 3 2 4 1 5 1
Output:
1 occurs 3 times, 2 occurs 2 times, 3 occurs 1 time, 4 occurs 1 time, 5
occurs 1 time
 */
public class FrequencyOfElementInArray {
	public String[] getFrequencyOfEachElement(int[] arr) {
		String[] outputArr = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}

			outputArr[i] = (arr[i] + "occurs " + count + "times");
			count++;
		}

		return outputArr;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int length = sc.nextInt();
		System.out.print("Enter the number of elements in the  array :");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // do not use java library
		FrequencyOfElementInArray obj = new FrequencyOfElementInArray();
		String[] outputArr = obj.getFrequencyOfEachElement(arr);
		for (int i = 0; i < outputArr.length; i++) {
			if(outputArr[i]!= null) {
				System.out.print(outputArr[i] + ", ");
			}
			
		}

		sc.close();
	}
}
