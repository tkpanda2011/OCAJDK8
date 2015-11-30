package com.aurotech.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFilesAndDirectory {
	 
	public static void main(String[] args){
		File file=new File("C:\\test\\test");
		File file2=new File(file,"hello.java");
		try {
			
			file.mkdirs(); //create the directory structure
			if(!file2.exists()){
				file2.createNewFile();	
			}
			FileWriter fw=new FileWriter(file2.getAbsolutePath());
			BufferedWriter br=new BufferedWriter(fw);
			br.write("This is the test Date");
			br.close();
	         
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
