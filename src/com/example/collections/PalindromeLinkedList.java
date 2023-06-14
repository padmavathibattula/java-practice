package com.example.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 12. Write a program to check if a linked list is palindrome.
       Input:
       [1 2 3 2 1]
       Output:
       It is a palindrome
 */

public class PalindromeLinkedList {
	public boolean isPalindrome(LinkedList<Integer> list) {
		boolean isPalindrome = false;
		int reverse = 0;
		LinkedList<Integer> list2 = new LinkedList<>();
		for (int j = list.size() - 1; j >= 0; j--) {
			int val =  list.get(j);
			list2.add(val);
		}
		if (list2.equals(reverse)) {// madam.equals(madam)
			isPalindrome = true;
		}
		return isPalindrome;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of elements: ");
		int size = scanner.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter a elements: ");
		for (int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		PalindromeLinkedList obj = new PalindromeLinkedList();
		boolean outputlist = obj.isPalindrome(list);
		System.out.println(" It is a palindrome: " + outputlist);
	}

}
