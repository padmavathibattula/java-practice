package com.javaExample.io;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReader {
	public static void main(String[] args) {
		String filePath = "D:\\Book1.xlsx";
		//excelWrite(String filePath, String Date, String category, String Description,int Amount);
		excelWrite(filePath, "2023-07-20", "Books", "Fee", 150);
		try (Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath))) {
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				for (Cell cell : row) {
					System.out.print(cell.toString() + "\t");
				}
				System.out.println();
			}
		} catch (IOException | EncryptedDocumentException | InvalidFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void excelWrite(String filePath, String date, String category, String description, int amount) {
        try (Workbook workbook = new XSSFWorkbook()) { // Create a new Excel workbook
            Sheet sheet = workbook.createSheet("Sheet1"); // Create a new sheet

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Date");
            headerRow.createCell(1).setCellValue("Category");
            headerRow.createCell(2).setCellValue("Description");
            headerRow.createCell(3).setCellValue("Amount");

            Row dataRow = sheet.createRow(1);
            dataRow.createCell(0).setCellValue(date);
            dataRow.createCell(1).setCellValue(category);
            dataRow.createCell(2).setCellValue(description);
            dataRow.createCell(3).setCellValue(amount);

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut); // Write the workbook content to the file
            }

            System.out.println("Excel file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
