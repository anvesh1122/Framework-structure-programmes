package com.Automation.Supporters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\Automation\\Supporters\\TextUtilities.txt");
		boolean status = file.createNewFile();
		if(status) {
			System.out.println("create a new file");
		}
		else {
			System.out.println("return to existing");
		}
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("practice");
		bw.newLine();
		bw.write("9 hours");
		bw.newLine();
		bw.write("for");
		bw.newLine();
		bw.write("job");
		bw.newLine();
		bw.flush();
	}

}
