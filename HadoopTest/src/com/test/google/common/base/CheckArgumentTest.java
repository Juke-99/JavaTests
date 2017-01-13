package com.test.google.common.base;

import com.google.common.base.Preconditions;

public class CheckArgumentTest {
	public static void main(String[] args) {
		String[] string = {};
		
		//if(string == null){
			//throw new IllegalArgumentException();
		//}
		
		Preconditions.checkArgument(string.length > 0);
	}
}
