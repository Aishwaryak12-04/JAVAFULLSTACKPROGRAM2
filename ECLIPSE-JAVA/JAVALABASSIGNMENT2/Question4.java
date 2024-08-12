package com.ais;

public class Question4 {
    private double radius;

    
    public Question4(double radius) {
        this.radius = radius;
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public static void main(String[] args) {
      
        Question4 circle = new Question4(5.0);

       
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
