package com.javaExample.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfWordInDescendingOrder {
	public static void main(String[] args) {
		Map<String, Integer> eachWordFreqMap = new HashMap<String, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\poem.txt"))) {
			String line = br.readLine();
			while (line != null) {
				String[] words = line.split("\\s+");// those are your words
				for (String word : words) {
					word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
					if (!word.isEmpty()) {
						int count = eachWordFreqMap.getOrDefault(word, 0) + 1;
						eachWordFreqMap.put(word, count);
					}
				}
				line = br.readLine();
			}
			Set<Entry<String, Integer>> set = eachWordFreqMap.entrySet();
			List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

					return o2.getValue().compareTo(o1.getValue());
				}
			});
			for (Entry<String, Integer> entry : list) {
				System.out.println("The frequency of each word: " + entry.getKey() + " " + entry.getValue());
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
