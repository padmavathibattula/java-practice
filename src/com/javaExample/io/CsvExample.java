package com.javaExample.io;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CsvExample {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\DELL\\Documents\\input.csv";
		String name = "Padma";
        int age = 29;
        String location = "Hyderabad";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String wordInCount=sc.next();
		System.out.print("Enter actual string: ");
		String actual = sc.next();
		System.out.print("Enter the string to replace : ");
		String replace = sc.next();
         
	

		// readCsv(String filePath);
		// writeCsv(String filePath, String name, int age, String location);
		// countOccurences(String filePath, String word);
		// findAndReplace(String filePath, String actual, String replace);
		// countLines(String filePath);
		readCSV(filePath);
		writeCsv(filePath, name, age, location);
        int wordCount = countOccurrences(filePath, wordInCount);
        System.out.println("The word '" + wordInCount + "' appears " + wordCount + " times.");
		findAndReplace(actual, replace, filePath);
		System.out.println("Word replaced successfully.");
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
	
	private static void writeCsv(String filePath, String name, int age, String location) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
            String[] record = {name, String.valueOf(age), location};
            writer.writeNext(record);
        } catch (IOException e) {
			e.printStackTrace();
		}
    }

	private static int countOccurrences(String filePath, String wordToCount) {
		int totalCount = 0;

		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			String[] nextLine;
			try {
				while ((nextLine = reader.readNext()) != null) {
					for (String cell : nextLine) {
						totalCount += countOccurrencesInString(cell, wordToCount);
					}
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return totalCount;
	}

	private static int countOccurrencesInString(String text, String word) {
		int count = 0;
		int index = text.indexOf(word);
		while (index != -1) {
			count++;
			index = text.indexOf(word, index + 1);
		}
		return count;
	}
	
	
	private static void findAndReplace(String filePath, String actualWord, String replaceWord) {
		List<String[]> newLines = new ArrayList<>();

		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			String[] nextLine;
			try {
				while ((nextLine = reader.readNext()) != null) {
					String[] newLine = new String[nextLine.length];
					for (int i = 0; i < nextLine.length; i++) {
						newLine[i] = nextLine[i].replace(actualWord, replaceWord);
					}
					newLines.add(newLine);
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
			for (String[] line : newLines) {
				writer.writeNext(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void countLines(String filePath) {
		int lineCount = 0;
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			try {
				while (reader.readNext() != null) {
					lineCount++;
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Line count: " + lineCount);
	}

	

	
}
