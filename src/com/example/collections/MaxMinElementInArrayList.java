package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 2.Write a program to find the maximum and minimum element in an ArrayList.
     Input:
     Enter the number of elements: 5
     Enter the array elements: 40 50 30 10 20
     Output:
     Maximum Element: 50
     Minimum Element: 10
 */
public class MaxMinElementInArrayList {
	public ArrayList<Integer> getMaxMin(ArrayList<Integer> obj, int size) {
		ArrayList <Integer>output = new ArrayList<>();

		int max =  obj.get(0);
		int min =  obj.get(0);
		int elements = obj.size();
		for (int i = 0; i < size; i++) {
			int val =  obj.get(i);
			if (val < min) {
				min = val;
			}
		}
		for (int i = 0; i < size; i++) {
			int maxval = (int) obj.get(i);
			if (maxval > max) {
				max = maxval;
			}
		}
		output.add(min);
		output.add(max);
		return output;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size = scanner.nextInt();
		ArrayList<Integer> obj = new ArrayList<>();
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			obj.add(scanner.nextInt());
		}
		MaxMinElementInArrayList maxmin = new MaxMinElementInArrayList();
		ArrayList output = maxmin.getMaxMin(obj, size);
		System.out.println("maximum: " + output.get(1));
		System.out.println("minimum: " + output.get(0));
		System.out.println(output.size());
		scanner.close();

	}

}
