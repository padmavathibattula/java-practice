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
		Map m1 = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\poem.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split(" ");//those are your words
                for (int i = 0; i < words.length; i++) {
                    if (m1.get(words[i]) == null) {
                        m1.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
                        newValue++;
                        m1.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a word:");
            String word=sc.next();
            
            if(!word.isEmpty()) {
            	int frequency=(int) m1.getOrDefault(word, 0);
            	System.out.println("Frequency of word:"+word+":" +frequency);
            }else {
            	System.out.println("Invalid output");
            }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
    }
		
	

}

