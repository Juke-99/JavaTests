package com.test.java;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	static ConcurrentHashMap<String,String> concurrenthashmap=new ConcurrentHashMap<String,String>();
	
	public static void main(String[] args) {
		String[] key=new String[5];
		String[] value=new String[5];
		
		for(int i=0 ;i<key.length;i++)
		{
			key[i]="Key"+i;
			value[i]="Value"+i;
			
			concurrenthashmap.put(key[i],value[i]);
		}
		
		System.out.println(concurrenthashmap);
		
		key[1]=null;
		concurrenthashmap.put(key[1],value[1]);
		System.out.println(concurrenthashmap);
	}

}
