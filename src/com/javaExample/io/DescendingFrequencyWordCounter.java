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
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class DescendingFrequencyWordCounter {

    public static void main(String[] args) {
        String filePath = "D:\\poem.txt";
        String outputFilePath = "D:\\output.txt";
        Scanner sc = new Scanner(System.in);
    	System.out.print("Enter actual string: ");
    	String actual = sc.next();
    	System.out.print("Enter the string to replace : ");
    	String replace = sc.next();
        //countLines(String filePath)
        //findAndReplace(String actual,String replace,String filePath)
        //longestWord(String filePath)
        //writeReverse(Map<String,Integer> eachWordFreqMap,outputFilePath)
        Map<String, Integer> eachWordFreqMap = countWordOccurrences(filePath);
        printDescendingFrequency(eachWordFreqMap);
        writeWordFrequency(eachWordFreqMap, outputFilePath);
        countLines(filePath);
        findAndReplace(actual,replace,filePath);
    	String longest=longestWord(filePath);
    	System.out.println("The longestWord: "+longest);
    	 writeReverse(eachWordFreqMap, outputFilePath);
         System.out.println("Reversed content written to the output file.");
         reverseFileLines(filePath, outputFilePath);
         System.out.println("File lines reversed successfully.");
         sc.close();
        
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
	
	private static String longestWord(String filePath) {
		String longestWord = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					if (word.length() > longestWord.length()) {
						longestWord = word;
					}
				}
			}

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return longestWord;

	}
	
	 private static void writeReverse(Map<String, Integer> eachWordFreqMap, String outputFilePath) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
	            for (Map.Entry<String, Integer> entry : eachWordFreqMap.entrySet()) {
	                String reversedKey = reverseString(entry.getKey());
	                String reversedLine = reversedKey + " " + entry.getValue(); 
	                writer.write(reversedLine);
	                writer.newLine();
	            }
	        } 
	        
	        catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    private static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }
	    
	    private static void reverseFileLines(String filePath, String outputFilePath) {
			List<String> lines = new ArrayList<>();
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				String line;
				try {
					while ((line = reader.readLine()) != null) {
						lines.add(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Collections.reverse(lines);
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
				for (String line : lines) {
					writer.write(line);
					writer.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	    

}
