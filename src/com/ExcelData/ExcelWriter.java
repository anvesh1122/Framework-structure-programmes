package com.ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
	
		FileInputStream fip=new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExcelData\\practice1.xlsx");
     
		Workbook  wb=WorkbookFactory.create(fip);
		Sheet sheet=wb.getSheet("Sheet1");

		Row	row=sheet.createRow(3);
		Cell cell=row.createCell(2);
		cell.setCellValue("SRK");
		
		Row row1=sheet.createRow(4);
		Cell cell1=row1.createCell(2);
		cell1.setCellValue("ABCD");
		
		Cell cell11=row1.createCell(1);
		cell11.setCellValue("EFGH");
		
		Row row7=sheet.createRow(5);
		Cell cell3=row7.createCell(0);
		cell3.setCellValue("NOOO");
		
		
		
	FileOutputStream fop = new FileOutputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExcelData\\practice1.xlsx");
	wb.write(fop);
	
		
		String value=cell.getStringCellValue();
		System.out.println(value);
		
		String value1=cell1.getStringCellValue();
		System.out.println(value1);
		
		String value4=cell3.getStringCellValue();
		System.out.println(value4);
		
		String value2=cell11.getStringCellValue();
		System.out.println(value2);
		
		
		
		
	}

}
