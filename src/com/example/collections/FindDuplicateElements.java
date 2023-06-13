package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElements {
	 public static void main(String[] args) 
	   {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number of elements: ");
			int size = sc.nextInt();
			ArrayList<Integer> obj = new ArrayList<>();
			System.out.println("Enter the array elements: ");
			for (int i = 0; i < size; i++) {
				obj.add(sc.nextInt());
			}
			FindDuplicateElements arr=new FindDuplicateElements();
			ArrayList<Integer>array=arr.findDuplicateElements(null, obj);
	      
	   }

	public ArrayList<Integer> findDuplicateElements(ArrayList<Integer> arrayElements,ArrayList<Integer> OutputArr) {
		
		Map<Integer, Integer>arrayMap=new HashMap<Integer, Integer>();
	      for(Integer e: arrayElements)
	      {
	         Integer count = arrayMap.get(e);
	         if(count == null)
	         {
	            arrayMap.put(e,1);
	         }
	         else
	         {
	            arrayMap.put(e, ++ count);
	         }
	      }
	      // print all the duplicate elements:
	      Set<Entry<Integer,Integer>> entrySet=arrayMap.entrySet();
	      for(Entry<Integer,Integer> entry : entrySet)
	      {
	         if(entry.getValue()>1)
	         {
	            System.out.println(entry.getKey());
	         }
	      }
		return arrayElements;
	}
	}
	
