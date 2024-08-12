package com.aishu;

public class Myclass2 {
    int b = 20;
    static int c = 30;

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Local Variable: " + a);
        Myclass2 obj = new Myclass2();
        System.out.println(obj.b);
        System.out.println(Myclass2.c); 
    }
}
