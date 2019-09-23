package com.ExceldataDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Exlwrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		// TODO Auto-generated method stub
        FileInputStream fip=new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExceldataDemo\\excelpractice.xlsx");
        
         Workbook wb1=WorkbookFactory.create(fip);
         Sheet sheet = wb1.createSheet("SheetMine");
         
         Row row0=sheet.createRow(0);
         Cell cell0=row0.createCell(0);
         cell0.setCellValue("S.NO");
       
         Cell cell1=row0.createCell(1);
         cell1.setCellValue("Names");
         
         Cell cell2=row0.createCell(2);
         cell2.setCellValue("emails");
         
         Row row1=sheet.createRow(1);
         Cell cell01=row1.createCell(0);
         cell01.setCellValue(3);
         
         //Row row2=sheet.createRow(1);
         Cell cell11=row1.createCell(1);
         cell11.setCellValue(4);
         
       //  Row row3=sheet.createRow(1);
         Cell cell12=row1.createCell(2);
         cell12.setCellValue(5);
        
         FileOutputStream fop=new FileOutputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExceldataDemo\\excelpractice.xlsx");
          wb1.write(fop);
          
         double v=cell01.getNumericCellValue();
          System.out.println(v);
          
         double v1=cell11.getNumericCellValue();
          System.out.println(v1);
          
         double v2= cell12.getNumericCellValue();
         System.out.println(v2);
	}
}
    
         /* String v=cell0.getStringCellValue();
          System.out.println(v);*/
              
	

