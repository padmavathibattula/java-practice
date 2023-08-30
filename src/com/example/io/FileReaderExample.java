package com.example.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		String filePath = "D:\\JavaSyllabus.txt";
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			int linesToShow = 30;
			for (int i = 0; i < linesToShow; i++) {
				if ((line = br.readLine()) != null) {
					System.out.println(line);
				}

				else {
					break;
				}

				System.out.println(i);
			}
			String lastLine = null;// 100th
			while ((line = br.readLine()) != null) {
				lastLine = line;
			}

			if (lastLine != null) {
				System.out.println("Last Line: " + lastLine);
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
