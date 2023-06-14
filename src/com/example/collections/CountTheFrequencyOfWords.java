package com.example.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * 13. Write a program to count the frequency of words in a sentence using a
       HashMap.
       Input:
       Sentence: "I love to code and I love to learn."
       Output:
       Word frequency:
       "I": 2
       "love": 2
       "to": 2
       "code": 1
       "and": 1
       "learn": 1
 */

public class CountTheFrequencyOfWords {
	public  LinkedHashMap<String,Integer> getCountFrequencyOfWords(String str) {
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			// containsKey(key) will return a boolean value
			// i.e. true if it contains the key and false if
			// it doesn't.
			if (linkedHashMap.containsKey(word)) {
				int count = linkedHashMap.get(word);
				count++;
				linkedHashMap.put(word, count);
			}
				

			else
				linkedHashMap.put(word, 1);
		}

		
		return linkedHashMap;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a string:");
		String str = sc.nextLine();
		CountTheFrequencyOfWords obj=new CountTheFrequencyOfWords();
		LinkedHashMap<String,Integer>output=obj.getCountFrequencyOfWords(str );
		System.out.print("Word frequency:"+output);
	}

	
}
