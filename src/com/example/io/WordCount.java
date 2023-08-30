package com.example.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Map<String, Integer> wordFreqMap = new HashMap<String, Integer>();

		try (BufferedReader br = new BufferedReader(new FileReader("D:\\poem.txt"))) {
			// StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				String[] words = line.split("\\s+");// those are your words
				for (String word : words) {
					word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
					if (!word.isEmpty()) {
						int count = wordFreqMap.getOrDefault(word, 0) + 1;
						wordFreqMap.put(word, count);

					}
				}
				// sb.append(System.lineSeparator());
				line = br.readLine();
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word:");
			String word = sc.next().toLowerCase();

			if (!word.isEmpty()) {
				int frequency = wordFreqMap.getOrDefault(word, 0);
				System.out.println("Frequency of word:" + word + ":" + frequency);
			} else {
				System.out.println("Invalid output");
			}
			sc.close();
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
