package com.test.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		String[] strs = {"a","b","c","d"};
		List<String> list = new ArrayList<String>(Arrays.asList(strs));
		ListIterator<String> listIterator = list.listIterator();
		
		while(listIterator.hasNext()){
			System.out.println("インデックス " + listIterator.nextIndex() + " の要素は " + listIterator.next());
		}
	}
}
