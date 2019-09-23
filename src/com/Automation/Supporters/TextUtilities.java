package com.Automation.Supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class TextUtilities {

	private String filepath;
	private  File file;
	private FileReader fr;
	private FileWriter fw;
	private BufferedWriter bw;
	private BufferedReader br;
	
	

	public TextUtilities(String filepath) throws IOException {
		this.filepath=filepath;
		file=new File(filepath);
		boolean status=file.createNewFile();
	  if(status) 
		  System.out.println("new file is created");
		  else 
			  System.out.println("return existing file");
	  
	     fw=new FileWriter(file,true);
	     fr=new FileReader(file);
	     bw=new BufferedWriter(fw);
	     br=new BufferedReader(fr);
	}
	    
	     public void writeData(int data) throws IOException {
	    	 bw.write(data);
	    	 bw.flush();
	     }
	     public void writeData(String data) throws IOException {
	    	 bw.write(data);
	    	 bw.flush();
	     }
	     public String readsingleLine() throws IOException {
	    	 String value="";
	    	 if (br!=null) {
	    		 value=br.readLine();
	    	 }
			return value;
	     }
	     public List getTotalData() throws IOException {
	    	 List data=new ArrayList();
	    	 while(br.ready()) {
	    		 String data1=br.readLine();
	    		 data.add(data1);
	    		 
	    	 }
			return data;
	     }
	     		
	}