package com.ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream fip=new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExcelData\\Practice.xlsx");
	
	Workbook workbook=WorkbookFactory.create(fip);
	Sheet sheet1=workbook.getSheet("Sheet1");
	
	Row row0=sheet1.getRow(0);
	Cell cell00=row0.getCell(0);
	
	String Cell00Value= cell00.getStringCellValue();
	System.out.println("data is:"+Cell00Value);
	
	Cell cell01=row0.getCell(1);
	String Cell01Value=cell01.getStringCellValue();
	System.out.println("Data is:"+Cell01Value);
	
	Row row1=sheet1.getRow(1);
	
	Cell cell10=row1.getCell(0);
	String cell01Value=cell10.getStringCellValue();
	System.out.println("data is:"+cell01Value);
	
	Cell Cell11=row1.getCell(1);
	String Cell11Value=Cell11.getStringCellValue();
	System.out.println("data is:"+Cell11Value);
	
	Cell Cell12=row1.getCell(2);
	Double Cell12Value=Cell12.getNumericCellValue();
	System.out.println("data is:"+Cell12Value);
	
	Row row2=sheet1.getRow(2);
	
    Cell cell02=row2.getCell(0);
    String CellO2Value=cell02.getStringCellValue();
    System.out.println("data is:"+CellO2Value);
    
    Cell cell12=row2.getCell(1);
    String Cell12Value1=cell12.getStringCellValue();
    System.out.println("data is:"+Cell12Value1);
    
    Cell cell22=row2.getCell(2);
    Double Cell22value=cell22.getNumericCellValue();
    System.out.println("data is "+Cell22value);
    
    Row row3=sheet1.getRow(3);
    
    Cell cell23=row3.getCell(0);
    String cell23Value=cell23.getStringCellValue();
    System.out.println(" "+cell23Value);
   
    
    
    
	
	
	}

}
