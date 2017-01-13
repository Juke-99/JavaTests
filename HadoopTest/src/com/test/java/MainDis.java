package com.test.java;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class MainDis {

	public static void main(String[] args) {
		WeakHashMap<String,Boolean> whm=new WeakHashMap<String,Boolean>();
		
		Set<String> set=Collections.newSetFromMap(whm);
		set.add("key");	
		System.out.println(whm);
		System.out.println(set);
		System.out.println("gc");
		System.gc();
		System.out.println(whm.toString());
	}

}
