package com.Automation.Supporters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file =new File("D:\\workspace\\Com.FrameWorkTestDemo\\src\\com\\Automation\\Supporters\\TextUtilities.txt");
		boolean status =file.createNewFile();
		if(status) {
			System.out.println("create new file ");
		}
		else {
			System.out.println("return to existing");
		}
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String value= br.readLine();
		System.out.println(value);
		
		String value1=br.readLine();
		System.out.println(value1);
		
		String value2=br.readLine();
		System.out.println(value2);

		
		//System.out.println("read string"+value);
	
		
		/*while(br.ready()) {
			System.out.println(br.readLine());
		}
*/
	}

}
