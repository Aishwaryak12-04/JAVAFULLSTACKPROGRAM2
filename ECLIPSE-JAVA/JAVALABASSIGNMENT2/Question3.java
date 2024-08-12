package com.ais;

public class Question3 {

    private double width;
    private double height;

    
    public Question3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double calculateArea() {
        return width * height;
    }

    
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    
    public double getWidth() {
        return width;
    }

    
    public void setWidth(double width) {
        this.width = width;
    }

    
    public double getHeight() {
        return height;
    }

   
    public void setHeight(double height) {
        this.height = height;
    }

    
    public static void main(String[] args) {
       
        Question3 rectangle = new Question3(5.0, 3.0);

     
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}


	
