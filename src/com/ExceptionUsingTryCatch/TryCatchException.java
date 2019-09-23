package com.ExceptionUsingTryCatch;

import java.io.FileInputStream;

public class TryCatchException {

	int a=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*int a=10;
	int b=20;
	int c=30;
	int d=a+b+c;*/
	try {
		FileInputStream fip=new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\ObjectRepository\\OR_Properties.locators.file");
		System.out.println("Identify.1");
		FileInputStream fip1=new FileInputStream("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\ExcelData\\Practice1234.xlsx");
		System.out.println("identify.2");
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("file");
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("file 1234");
	}

	}

}
