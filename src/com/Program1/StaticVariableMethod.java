package com.Program1;

public class StaticVariableMethod {

    static int a =10;
    static int b;
    static void MyFunction(int c){
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println("C:"+c);

    }
    static {
        System.out.println("Running Static Initialization Block");
        b=a+5;
    }
    public static void main(String args[]){
        MyFunction(8);
    }
}
