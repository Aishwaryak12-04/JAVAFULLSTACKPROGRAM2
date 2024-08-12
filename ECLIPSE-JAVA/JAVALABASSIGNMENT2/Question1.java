package com.ais;

public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        Person person1 = new Person("Aishu", 20);
        Person person2 = new Person("Aathi", 21);

        
        System.out.println("Person 1 details:");
        person1.printDetails();

        System.out.println("\nPerson 2 details:");
        person2.printDetails();
    }
}
