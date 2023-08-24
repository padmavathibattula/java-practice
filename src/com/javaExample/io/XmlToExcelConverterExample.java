package com.javaExample.io;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XmlToExcelConverterExample {
	public static void main(String[] args) {
		String xmlFilePath = "C:\\Users\\DELL\\Documents\\library.xml";
		String excelFilePath = "C:\\Users\\DELL\\Documents\\output.xlsx";
		convertXmlToExcel(xmlFilePath, excelFilePath);
	}

	public static void convertXmlToExcel(String xmlFilePath, String excelFilePath) {
		try {
			File xmlFile = new File(xmlFilePath);
			JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Library library = (Library) jaxbUnmarshaller.unmarshal(xmlFile);

			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet("Books");

			List<XbookId> books = library.getBooks();
			Row headerRow = sheet.createRow(0);
			String[] columnNames = { "Book Id", "Title", "Author", "Publication-year", "Genere", "Availability",
					"Status", "DueDate", "Borrower" };

			// Populate the header row with column names
			for (int i = 0; i < columnNames.length; i++) {
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(columnNames[i]);
			}
			int rowIndex = 1;

			for (XbookId book : library.getBooks()) {
				Row row = sheet.createRow(rowIndex++);
				row.createCell(0).setCellValue(book.getId());
				row.createCell(1).setCellValue(book.getTitle());
				row.createCell(2).setCellValue(book.getAuthor());
				row.createCell(3).setCellValue(book.getPublicationYear());
				row.createCell(4).setCellValue(book.getGenre());

				// Check if availability information exists
				// Check if availability information exists
				XAvailability availability = book.getAvailability();
                Cell availabilityCell = row.createCell(6);
                if (availability != null) {
                    availabilityCell.setCellValue(availability.getStatus());
                } else {
                    availabilityCell.setCellValue("N/A");
                }

                Cell dueDateCell = row.createCell(7);
                Cell borrowerCell = row.createCell(8);

                if (availability != null) {
                    dueDateCell.setCellValue(availability.getDueDate());
                    borrowerCell.setCellValue(availability.getBorrower());
                }
			}

			try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\DELL\\Documents\\ouput.xlsx")) {
				workbook.write(outputStream);
			}

			System.out.println("XML data converted to Excel successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static List<XbookId> parseXmlAndGetBooks() {
		List<XbookId> books = null;
		// Simulated method, replace with actual parsing logic
		return books;
	}

}
