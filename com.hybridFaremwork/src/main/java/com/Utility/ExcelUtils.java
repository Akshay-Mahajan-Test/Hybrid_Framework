package com.Utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	
	public static void writeToExcel (String filePath, String sheetName, int rowNum, int cellNum, String value)
	{
        XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);

        Row row = sheet.createRow(rowNum);
        Cell cell = row.createCell(cellNum);
        cell.setCellValue(value);

        try (FileOutputStream outputStream = new FileOutputStream(Paths.get(filePath).toFile())) {
            workbook.write(outputStream);
            System.out.println("Data written to Excel successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to Excel: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                System.out.println("Error closing workbook: " + e.getMessage());
            }
        }
	}
}
