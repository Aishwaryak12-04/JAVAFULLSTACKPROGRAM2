package com.ai;

public class Question5 {
    
    public static class Shape {
        public double getArea() {
            return 0;
        }
    }

    public static class Triangle extends Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(6.0, 8.0);
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
