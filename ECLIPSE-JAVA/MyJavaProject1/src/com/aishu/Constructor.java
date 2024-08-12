package com.aishu;

public class Constructor {

    
    Constructor(String name) {
        System.out.println("Welcome " + name);
    }

    Constructor(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    
    Constructor(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact); 
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(5);      
        Constructor obj2 = new Constructor("Aishu"); 
        Constructor obj3 = new Constructor(5, 10);   
    }
}
