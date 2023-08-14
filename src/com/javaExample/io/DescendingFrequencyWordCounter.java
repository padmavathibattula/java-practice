package com.javaExample.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DescendingFrequencyWordCounter {

    public static void main(String[] args) {
        String filePath = "D:\\poem.txt";
        String outputFilePath = "D:\\output.txt";
        //countLines(filePath)
        //findAndReplace(String actual,String replace)
        //longestWord(filePath)
        //writeReverse(eachWordFreqMap,outputFilePath)
        Map<String, Integer> eachWordFreqMap = countWordOccurrences(filePath);
        printDescendingFrequency(eachWordFreqMap);
        writeWordFrequency(eachWordFreqMap, outputFilePath);
    }

    private static Map<String, Integer> countWordOccurrences(String filePath) {
        Map<String, Integer> eachWordFreqMap = new HashMap<String, Integer>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        int count = eachWordFreqMap.getOrDefault(word, 0) + 1;
                        eachWordFreqMap.put(word, count);
                    }
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eachWordFreqMap;
    }

    private static void printDescendingFrequency(Map<String, Integer> eachWordFreqMap) {
        Set<Entry<String, Integer>> set = eachWordFreqMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Entry<String, Integer> entry : list) {
            System.out.println("The frequency of the word: " + entry.getKey() + " " + entry.getValue());
        }
    }
    
	private static void writeWordFrequency(Map<String, Integer> eachWordFreqMap, String outputFilepath) {
		Set<Entry<String, Integer>> set = eachWordFreqMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilepath,false))) {
			for (Entry<String, Integer> entry : list) {
				bw.append("The frequency of the word: " + entry.getKey() + " " + entry.getValue()+"\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
