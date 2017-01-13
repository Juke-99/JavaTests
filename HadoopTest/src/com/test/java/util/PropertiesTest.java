package com.test.java.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException{
		Properties properties = new Properties();
		
		properties.load(new FileInputStream("./Property/test.properties"));
		
		System.out.println(properties.getProperty("key1"));
		System.out.println(properties.getProperty("key2"));
		
		System.out.println(properties.getProperty("element"));
		
		properties.setProperty("element", "element1");
		
		System.out.println(properties.getProperty("element"));
	}
}
