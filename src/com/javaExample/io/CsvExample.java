package com.javaExample.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CsvExample {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\DELL\\Documents\\input.csv";
		String name = "padma";
		int age = 28;
		String location = "Hyderabad";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter actual string: ");
    	String actual = sc.next();
    	System.out.print("Enter the string to replace : ");
    	String replace = sc.next();
        
		Map<String, Integer> eachWordFreqMap = new HashMap<String,Integer>();
		
		// readCsv(String filePath);
		// writeCsv(String filePath, String name, int age, String location);
		// countOccurences(String filePath, String word);
		// findAndReplace(String filePath, String actual, String replace);
		// countLines(String filePath);
		readCSV(filePath);
		writeCsv(filePath,name,age,location);
		countOccurences(filePath, eachWordFreqMap);
		wordFrequency(eachWordFreqMap);
		findAndReplace(actual,replace,filePath);
		countLines(filePath);
		sc.close();

	}

	private static void readCSV(String filePath) {
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			String[] nextLine;
			try {
				while ((nextLine = reader.readNext()) != null) {
					for (String value : nextLine) {
						System.out.print(value + ", ");
					}
					System.out.println(); // Move to the next line after printing a row
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	 private static void countOccurences(String filePath, Map<String, Integer> eachWordFreqMap) {
	        
		 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.split(","); // CSV files are comma-separated
	                for (String word : words) {
	                    word = word.toLowerCase().trim();
	                    if (!word.isEmpty()) {
	                        int count = eachWordFreqMap.getOrDefault(word, 0) + 1;
	                        eachWordFreqMap.put(word, count);
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	    }
	 
	 private static void wordFrequency(Map<String, Integer> eachWordFreqMap) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a word:");
	        String word = sc.next().toLowerCase();

	        if (!word.isEmpty()) {
	            int frequency = eachWordFreqMap.getOrDefault(word, 0);
	            System.out.println("Frequency of word '" + word + "': " + frequency);
	        } else {
	            System.out.println("Invalid input");
	        }

	        sc.close();
	    }
	 
	 private static void findAndReplace(String actual, String replace, String filePath) {
			StringBuilder content = new StringBuilder();
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				String line;
				while ((line = reader.readLine()) != null) {
					content.append(line).append(System.lineSeparator());
				}
				String updatedContent = content.toString().replace(actual, replace);

				try (FileWriter writer = new FileWriter(filePath)) {
					writer.write(updatedContent);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	 
	 private static void countLines(String filePath) {
			int lineCount = 0;
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				while (reader.readLine() != null) {
					lineCount++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Line count: " + lineCount);
		}

		private static void writeCsv(String filePath, String name, int age, String location) {
			try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
				String[] record = { name, Integer.toString(age), location };
				writer.writeNext(record);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


}
