package com.test.java.util;

import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedListTest{

	public static void main(String[] args){
		LinkedList<String> linkedlist = new LinkedList<String>();
		Map<String, String[]> map = new ConcurrentHashMap<String, String[]>();
		String[] source;
		
		for(int i = 0; i < 5; i++){
			linkedlist.add("element" + i);
		}
		
		System.out.println("LinkedList: " + linkedlist);
		
		source = linkedlist.toArray(new String[linkedlist.size()]);
		
		if(source != null){
			map.put("key", source);
		}
		
		System.out.println("Map<String, String[]>: " + map);
	}

}
