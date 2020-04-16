package com.example.demo;

public class HasStatic {
    private static int x=100;
    public static void main(String args[]){
        HasStatic hs1=new HasStatic();
        hs1.x++;//101
        System.out.println("x="+x);
        HasStatic  hs2=new HasStatic();
        hs2.x++;//102
        System.out.println("x="+x);
        hs1=new HasStatic();
        hs1.x++;//103
        System.out.println("x="+x);
        HasStatic.x--;//102
        System.out.println("x="+x);
    }
}
