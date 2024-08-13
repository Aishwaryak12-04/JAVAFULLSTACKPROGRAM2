package com.ai;

public class Question6 {
    
    public static class Shape {
        public double getArea() {
            return 0;
        }
    }

    public static class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Square square = new Square(4.0);
        System.out.println("Area of Square: " + square.getArea());
    }
}
