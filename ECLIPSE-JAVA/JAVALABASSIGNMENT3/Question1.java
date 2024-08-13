package com.ai;


class Animal {
    
    void makeSound() {
        System.out.println("Animal sound");
    }
}


class Cat extends Animal {
    
    
    void makeSound() {
        System.out.println("Cat barks");
    }
}


public class Question1 {
    public static void main(String[] args) {
      
        Cat myCat = new Cat();
        
        
        myCat.makeSound(); 
    }
}
