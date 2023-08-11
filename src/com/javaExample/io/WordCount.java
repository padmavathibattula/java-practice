package com.javaExample.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		
		String filePath="D:\\poem.txt";
		try {
			BufferedReader reader=new BufferedReader(new FileReader(filePath));
			Map<String,Integer>frequency=new HashMap<>();
			String Line=reader.readLine();
			while(Line!=null){
				if(!Line.trim().equals(" ")) {
					String[] words=Line.split(" ");
					for(String word: words) {
						if(word==null || word.trim().equals(" ")) {
							continue;
						}
						String proceessed=word.toLowerCase();
						//proceessed=proceessed.replace(" ", "");
						if(frequency.containsKey(proceessed)) {
							frequency.put(proceessed, frequency.get(proceessed)+1);
						}else {
							frequency.put(proceessed, 1);
						}
						
					}
					Line=reader.readLine();
				}
				String thenWord=sc.next();
				
				thenWord=null;
				int mostFrequentlyUsed=0;
				for(String word:frequency.keySet()) {
					Integer theVal=frequency.get(word);
					if(theVal>mostFrequentlyUsed) {
						mostFrequentlyUsed=theVal;
						thenWord=word;
					}
				}
				System.out.println();
				System.out.println("the most frequently used word: " +thenWord+ "times"+mostFrequentlyUsed);
				
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
