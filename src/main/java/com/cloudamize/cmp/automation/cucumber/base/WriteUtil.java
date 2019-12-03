package com.cloudamize.cmp.automation.cucumber.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUtil extends TestBase
{
	public static void writeData(String startTime,String content,String TestName, String modulename) {
		try {
 
 
			File file = new File("ResponceTime.csv");
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			if (!file.exists()) {
				
				file.createNewFile();	
			}
			
			bw.write(","+startTime+","+TestName+","+content+","+modulename+",\n");
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
