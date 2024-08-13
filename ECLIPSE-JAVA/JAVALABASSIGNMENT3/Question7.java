package com.ai;

public class Question7 {
    
    public static class Shape {
        public double getArea() {
            return 0;
        }
    }

    public static class Parallelogram extends Shape {
        private double base;
        private double height;

        public Parallelogram(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return base * height;
        }
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(5.0, 7.0);
        System.out.println("Area of Parallelogram: " + parallelogram.getArea());
    }
}
