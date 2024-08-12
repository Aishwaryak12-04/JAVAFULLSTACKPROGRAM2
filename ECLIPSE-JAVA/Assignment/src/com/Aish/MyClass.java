package com.Aish;

public class MyClass {

   
    class Student {
        int regno;
        String studentName;
        int[] subjects = new int[5];

       
        Student(int regno, String studentName) {
            this.regno = regno;
            this.studentName = studentName;
        }

        
        void setMarks(int[] marks) {
            if (marks.length == subjects.length) {
                System.arraycopy(marks, 0, subjects, 0, marks.length);
            } else {
                System.out.println("Incorrect number of marks provided.");
            }
        }

        
        void displayInfo() {
            System.out.println("Registration Number: " + regno);
            System.out.println("Student Name: " + studentName);
            System.out.print("Marks: ");
            for (int mark : subjects) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Student student = myClass.new Student(102, "Aishwarya");

        
        int[] marks = {85, 90, 78, 88, 92};
        student.setMarks(marks);
        student.displayInfo();
    }
}
