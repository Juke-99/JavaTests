package com.test.java;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class CollectionsTest {
	static WeakHashMap<String,Boolean> weakhashmap=new WeakHashMap<String,Boolean>();
	static Set<String> set=Collections.newSetFromMap(weakhashmap);
	
	public static void main(String[] args) {
		String[] key=new String[5];
		
		for(int i=0 ;i<key.length;i++)
		{
			key[i]="Key"+i;
			
			 set.add(key[i]);
		}
		
		System.out.println("Set is: "+set);
		System.out.println("Map is: "+weakhashmap);
		key[1]=null;
		System.out.println("ガーベジコレクション");
		System.gc();
		System.out.println("Set is: "+set);
		System.out.println("Map is: "+weakhashmap);
	}

}
