package com.test.java.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class HashTableSample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		Properties properties = new Properties();
		
		properties.load(new FileInputStream("./Property/temp.properties"));  //<--- defaultのプロパティとして
		hashTable = (Hashtable<String, String>) properties.clone();  //それをコピー
		
		System.out.println("Default Property: " + properties);
		
		if(properties.containsKey("key13")){
			System.out.println("key13 is exist.");
		} else {
			System.out.println("key13 isn't exist.");
		}
		
		properties.load(new FileInputStream("./Property/test.properties"));  //<----新たに設定したプロパティとして（defaultとしてではないプロパティ）
		properties.putAll(hashTable);  //それをすべて入れる
		
		System.out.println("Second Property: " + properties);
		
		if(properties.containsKey("key13")){
			System.out.println("key13 is exist.");
		} else {
			System.out.println("key13 isn't exist.");
		}
	}

}
