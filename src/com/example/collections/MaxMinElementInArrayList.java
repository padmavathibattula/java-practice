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
	public   ArrayList findMaxMin(ArrayList obj,ArrayList maxMin) {
		int max = Integer.MIN_VALUE;
	     int min = Integer.MAX_VALUE;
	    
		for(int i=0;i<obj.size();i++) {
			int input=(Integer)obj.get(i);
			if(input>max) {
				max=input;
			}
			if(input<min) {
				min=input;
			}
		}
		return maxMin;
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int size=sc.nextInt();
		ArrayList obj =new ArrayList();
		sc.nextLine();
		System.out.print("Enter the array elements:");
		int length=sc.nextInt();
		MaxMinElementInArrayList mme=new MaxMinElementInArrayList();
		ArrayList maxMin = null;
		ArrayList output=mme.findMaxMin(obj, maxMin);
        System.out.println("MaximumElement:"+maxMin);
        
        sc.close();
	}

}
