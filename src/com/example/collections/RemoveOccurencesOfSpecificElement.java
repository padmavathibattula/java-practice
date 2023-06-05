package com.example.collections;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
 * 3.Write a program to remove all occurrences of a specific element from an
     ArrayList.
     Input:
     Enter the number of elements: 7
     Enter the array elements: 20 30 10 50 30 45 60
     Element to remove: 30
     Output:
     ArrayList after removing all occurrences of element 30: [20,10,50,45,60]
 */

public class RemoveOccurencesOfSpecificElement {
	public ArrayList removeSpecificElementFromArrayList(ArrayList obj,int item) {
		for(int i=0;i<obj.size();i++) {
			 if(obj.get(i).equals(item)){
			        obj.remove(i--);
			    }
			
		}
		return obj;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int size=sc.nextInt();
		ArrayList obj =new ArrayList();
		sc.nextLine();
		System.out.print("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			obj.add(sc.nextInt());
		}
		System.out.println("Element to remove:");
		int item=sc.nextInt();
		RemoveOccurencesOfSpecificElement rose=new RemoveOccurencesOfSpecificElement();
		ArrayList outputList=rose.removeSpecificElementFromArrayList(obj,item);
		System.out.println("ArrayList after removing all occurrences of element"+item+":"+outputList);
		sc.close();
	}
	

}
