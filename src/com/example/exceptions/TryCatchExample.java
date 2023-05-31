package com.example.exceptions;
/*
 * to handle unchecked exception
 */
public class TryCatchExample {
	public static void main(String[] args) {
		try {
			int arr[]= {1,3,2,4};
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
