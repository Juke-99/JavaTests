package com.test.java.lang;

public class StringTest {

	public static void main(String[] args) {
		String str = "Google";
		char[] char1 = str.toCharArray();
		
		for(char partChar : char1)
		{
			System.out.println(partChar);
		}
	}
}
