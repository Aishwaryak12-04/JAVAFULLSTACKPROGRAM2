package com.ai;

public class Question2 {
    
    public static class Vehicle {
       
        public void drive() {
            System.out.println("Driving the vehicle");
        }
    }

    public static class Car extends Vehicle {
    
        @Override
        public void drive() {
            System.out.println("Repairing a car");
        }
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive(); 

        Car myCar = new Car();
        myCar.drive(); 
    }
}
