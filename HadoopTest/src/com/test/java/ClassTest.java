package com.test.java;

public class ClassTest {
		
	public class SuperClass {};
    public class SubClass extends SuperClass {};

    public static void main(String[] args) {

        //System.out.println(SuperClass.class.asSubclass(SubClass.class));

        System.out.println(SubClass.class.asSubclass(SuperClass.class));
    }
}
