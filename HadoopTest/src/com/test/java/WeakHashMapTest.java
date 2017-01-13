package com.test.java;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {
	static WeakHashMap<String,String> weakhashmap=new WeakHashMap<String,String>();
	//static HashMap<String,String> hashmap=new HashMap<String,String>();
	
	public static void main(String[] args){
		
		String[] key=new String[5];
		String[] value=new String[5];
		
		for(int i=0 ;i<key.length;i++)
		{
			key[i]="Key"+i;
			value[i]="Value"+i;
			
			weakhashmap.put(key[i],value[i]);
			//hashmap.put(key[i],value[i]);
		}
		
		//System.out.println(hashmap);
		System.out.println(weakhashmap);
		System.out.println(weakhashmap.keySet());
		key[1]=null;
		value[2]=null;
		System.out.println("ガーベジコレクション");
		System.gc();
		//System.out.println(hashmap);
		System.out.println(weakhashmap);
	}
}
