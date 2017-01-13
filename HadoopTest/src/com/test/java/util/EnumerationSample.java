package com.test.java.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class EnumerationSample {

	public static void main(String[] args) throws FileNotFoundException, IOException{
	
		Properties properties = new Properties();
		properties.load(new FileInputStream("./Property/enumration_sample.properties"));
		
		for(Enumeration<Object> enumeration = properties.keys(); enumeration.hasMoreElements();){
			String name = (String) enumeration.nextElement();
			System.out.println(properties.getProperty(name));
		}
	}
}