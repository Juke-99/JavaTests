package com.test.java.util;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class EntryTest{

	public static void main(String[] args){
		HashMap<String,String> hashmap = new HashMap<String,String>();
		WeakHashMap<String,String> weakhashmap = new WeakHashMap<String,String>();
		
		weakhashmap.put("Hadoop","Java");
		weakhashmap.put("Spark","Scala");
		weakhashmap.put("Kafka","Java");
		
		System.out.println("WeakHashMap:");
		System.out.println(weakhashmap);
		System.out.println("");
		
		for(Entry<String,String> entry : weakhashmap.entrySet()){
			hashmap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("HashMap:");
		System.out.println(hashmap);
		System.out.println("");
	}
}
