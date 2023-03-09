package com.testng.readdatafromexcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcelExample {

	@Test
	public void testCase1() {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\suche\\OneDrive\\Desktop\\ExcelR\\Selenium_Morning_01_13_2023\\Day-32\\workbook.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int numOfRows = sheet.getPhysicalNumberOfRows(); // total number of rows
			// Takes care of rows
			for (int i = 0; i < numOfRows; i++) {
				XSSFRow row = sheet.getRow(i);
				int numOfCols = row.getPhysicalNumberOfCells(); // Total number of columns
				
				//Takes care of all the cells of a row
				for (int j = 0; j < numOfCols; j++) {
					XSSFCell cell = row.getCell(j);
					System.out.print(cell+" ");
				}
				System.out.println();

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
