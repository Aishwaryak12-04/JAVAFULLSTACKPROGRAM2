package com.ai;

public class Question4 {
    
    public static class Shape {
        public double getArea() {
            return 0;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("Area of Circle: " + circle.getArea());
    }
}
