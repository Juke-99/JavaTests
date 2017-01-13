package com.test.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] dakyuu=new String[6];
        int ballcon=0;
        int strikecon=0;
        
        for(int i=0;i<5;i++)
        {
            dakyuu[i]=sc.nextLine();
        }
        
        for(String hantei:dakyuu)
        {
            if(hantei=="ball")
            {
                ++ballcon;
                
                if(ballcon==4)
                {
                    System.out.println("fourball!");
                    return;
                }
                else
                {
                    System.out.println("ball!");
                }
            }
            
            if(hantei=="strike")
            {
                ++strikecon;
                
                if(strikecon==3)
                {
                    System.out.println("out!");
                    return;
                }
                else
                {
                    System.out.println("strike!");
                }
            }
        }
    }
}
