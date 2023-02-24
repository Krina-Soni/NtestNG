package com.automation.utils;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(new File("src//test//resources//data//testdata.xlsx"));
		XSSFSheet sheet = workbook.getSheetAt(0);
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);
//		System.out.println(cell.getStringCellValue());

		int numOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < numOfRows; i++) {
			XSSFRow row = sheet.getRow(i);
			int numOfCell = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numOfCell; j++) {
				System.out.print(row.getCell(j).toString() + "  ");
			}

			System.out.println();
		}
	}
}
