package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class readExcel {

	public static void main(String[] args) throws IOException {
		Object[][] excelData = null;
		File file = new File(".\\testData\\testData1.xls");
		FileInputStream inputStream = new FileInputStream(file);
		// Create workbook object
		Workbook wb = new HSSFWorkbook(inputStream);
		// From which sheet we need data
		Sheet sheet1 = wb.getSheet("Sheet1");
		// Numbers of rows present in Sheet1
		int rowcount = sheet1.getLastRowNum() - sheet1.getFirstRowNum();
		int colcount = sheet1.getRow(1).getLastCellNum();
		excelData = new Object[rowcount][colcount];
		for (int i = 1; i <= rowcount; i++) {
			Row row = sheet1.getRow(i);
			int colcount1 = sheet1.getRow(i).getLastCellNum();
			System.out.println("colcount " + colcount1);
			for (int j = 0; j < colcount1; j++) {
				String d = row.getCell(j).getStringCellValue();
				excelData[i - 1][j] = d;
			}
		}
	}

}
