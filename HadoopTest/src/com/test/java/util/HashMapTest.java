package com.test.java.util;

import java.util.HashMap;

public class HashMapTest{

	public static void main(String[] args){
		HashMap<String,String> hashmap = new HashMap<String,String>();
		
		hashmap.put("Hadoop","Java");  //キー、値をhashmapに格納
		hashmap.put("Spark","Scala");
		hashmap.put("Kafka","Java");
		
		System.out.println(hashmap);
		
		if(hashmap.containsKey("Hadoop")){
			System.out.println("Hadoop!!");
			System.out.println(hashmap.get("Hadoop"));
		}
	}
}
