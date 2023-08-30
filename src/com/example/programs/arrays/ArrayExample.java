package com.example.programs.arrays;
// Time complexity:O(n)
//space complexity:O(n)
public class ArrayExample {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		System.out.println("numbers length: "+numbers.length);
		numbers[0]=12;
		//numbers[1]=5;
		//numbers[2]=3;
		numbers[3]=4;
		numbers[4]=6;
		//numbers[5]=1;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
