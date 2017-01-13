package com.test.java;

public class ClassLoaderTest {
	
	public static ClassLoader classLoader;
	
	static {
		classLoader = getClassLoader();
		System.out.println("ClassLoaded!!");
	}
	
	public static ClassLoader getClassLoader(){
		return classLoader;
	}
}
