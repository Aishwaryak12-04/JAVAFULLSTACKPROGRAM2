package com.ais;

public class Question2 {

    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");

       
        System.out.println("Initial details:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

     
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Rocky");
        dog2.setBreed("Poodle");

        
        System.out.println("\nUpdated details:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}

class Dog {
    private String name;
    private String breed;

    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getBreed() {
        return breed;
    }

    
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
