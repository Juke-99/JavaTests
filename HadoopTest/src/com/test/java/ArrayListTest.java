package com.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest{
	//private static CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<String>();
	static List<String> arrayList = Collections.synchronizedList(new ArrayList<String>()); 
	
	public static void main(String[] args) {	 
		//要素追加
	    for(int i = 0; i < 10000; i++)
	    {
	    	arrayList.add("ArrayList" + i);
	    }
	    
	    //別スレッドでリストを走査する
	    Thread th = new Thread(new Runnable(){
	            @Override
	            public void run(){
	            	
	            	synchronized(arrayList){
		            	for(String h : arrayList)
		            	{
		            		arrayList.remove(h);  //ConcurrentModificationException発生
		            	}
	            	}
	            }
	    });
	    
	    th.start();
	    
	    //操作中に削除
	    arrayList.remove("ArrayList0");
	    System.out.println("削除完了");
	 }
}
