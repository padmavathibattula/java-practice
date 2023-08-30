package com.example.io;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExcelExample {
	public static void main(String[] args) {
		String filePath = "D:\\expenses.xlsx";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a serachText:");
		String searchText = sc.next();
		int columnNo = 1;
		
		// write to excel file
		excelWrite(filePath, "2023-07-20", "tea", "Fee", "$150");
		
		// read from an excel file
		readExcel(filePath);
		
		// finding rows from given search text
		List<Row> matchingRows = findRows(filePath, searchText, columnNo);
		System.out.println("Matching rows:");
		for (Row row : matchingRows) {
			System.out.println("Row number: " + (row.getRowNum() + 1));
		}
		
		// delete rows from given search text
		deleteRows(filePath, searchText, columnNo);
		System.out.println("Rows deleted successfully.");
		
		sc.close();

	}

	public static void readExcel(String filePath) {
		try (FileInputStream fis = new FileInputStream(new File(filePath)); XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + " | ");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
							System.out.print(dateFormat.format(cell.getDateCellValue()) + " | ");
						} else {
							System.out.print(cell.getNumericCellValue() + " | ");
						}
						break;

					default:
					}
				}
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void excelWrite(String filePath, String date, String category, String description, String amount) {
		try (FileInputStream fis = new FileInputStream(new File(filePath)); XSSFWorkbook wb = new XSSFWorkbook(fis)) { // Create a new Excel workbook
			XSSFSheet sheet = wb.getSheetAt(0); // Create a new sheet
			Row dataRow = sheet.createRow(sheet.getLastRowNum()+1);
			dataRow.createCell(0).setCellValue(date);
			dataRow.createCell(1).setCellValue(category);
			dataRow.createCell(2).setCellValue(description);
			dataRow.createCell(3).setCellValue(amount);

			try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
				wb.write(fileOut); // Write the workbook content to the file
			}

			System.out.println("Excel file created successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Row> findRows(String filePath, String searchText, int columnNo) {
        List<Row> matchingRows = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(columnNo);
                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                    String cellValue = cell.getStringCellValue();
                    if (cellValue.contains(searchText)) {
                        matchingRows.add(row);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return matchingRows;
        
    }
	
	
	public static void deleteRows(String filePath, String searchText, int columnNo) {
		try (FileInputStream fis = new FileInputStream(filePath); XSSFWorkbook wb = new XSSFWorkbook(fis)) {

			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			List<Row> rowsToDelete = new ArrayList<>();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Cell cell = row.getCell(columnNo);
				if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
					String cellValue = cell.getStringCellValue();
					if (cellValue.contains(searchText)) {
						rowsToDelete.add(row);
					}
				}
			}

			for (Row row : rowsToDelete) {
				sheet.removeRow(row);
			}

			// Shift rows to remove empty rows after deletion
			sheet.shiftRows(sheet.getLastRowNum() + 1, sheet.getLastRowNum() + 1, -1);

			try (FileOutputStream fos = new FileOutputStream(filePath)) {
				wb.write(fos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
