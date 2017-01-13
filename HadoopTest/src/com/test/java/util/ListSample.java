package com.test.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		String[] strs = {"a","b","c"};
		List<String> list = new ArrayList<String>();
		
		list.addAll(Arrays.asList(strs));
		
		System.out.println("First add " + list);
		
		list.add("d");
		list.add(2,"h");
		
		System.out.println("Second add " + list);
		
		/* 追加 */
		
		System.out.println("Objectととして変換: ");
		
		for(Object item : list.toArray()){
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println("Stringととして変換: ");
		
		for(String item : list.toArray(new String[list.size()])){
			System.out.println(item);
		}
	}

}
