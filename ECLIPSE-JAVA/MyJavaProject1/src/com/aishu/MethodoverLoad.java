package com.aishu;

public class MethodoverLoad {

    
    void myMethod(String name) {
        System.out.println("Welcome " + name);
    }

   
    void myMethod(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    
    void myMethod(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void main(String[] args) {
        MethodoverLoad obj = new MethodoverLoad();
        obj.myMethod(5);           
        obj.myMethod("Aishu");     
        obj.myMethod(10, 20);      
    }
}
