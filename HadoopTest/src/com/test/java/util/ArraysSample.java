package com.test.java.util;

import java.util.Arrays;

public class ArraysSample {
	
	public static void main(String[] args){
		char[] strs = {'a','b'};
		char[] copyStrs = Arrays.copyOf(strs,4);
		
		for(int i = 0; i < copyStrs.length; i++){
			System.out.println("配列copyStrs    の" + i + "番目は → " + copyStrs[i]);
		}
	}
}