package com.ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelloopingValidate {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException  {
	
			
			FileInputStream fip = new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExcelData\\Practice.xlsx");

			Workbook workbook = WorkbookFactory.create(fip);
			Sheet sheet1 = workbook.getSheet("Sheet1");
			
			for(int i=0;i<=sheet1.getLastRowNum();i++)
			{
				Row row = sheet1.getRow(i);
				
				for(int j=0;j<row.getLastCellNum();j++)
				{
					Cell cell = row.getCell(j);
					if (cell.getCellType()==CellType.STRING) {
						System.out.println(cell.getStringCellValue());
					}
					else if (cell.getCellType()==CellType.NUMERIC) {
						System.out.println(cell.getNumericCellValue());
					}
					else if (cell.getCellType()==CellType.BOOLEAN) {
						System.out.println(cell.getBooleanCellValue());
					}
				}
			}

	}

}
