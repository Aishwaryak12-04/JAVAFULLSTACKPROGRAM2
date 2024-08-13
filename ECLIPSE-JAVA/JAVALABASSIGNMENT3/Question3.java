package com.ai;

public class Question3 {
    
    public static class Shape {
        
        public double getArea() {
            return 0; 
        }
    }

    
    public static class Rectangle extends Shape {
        private double width;
        private double height;

       
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

   
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + rect.getArea()); 
    }
}
