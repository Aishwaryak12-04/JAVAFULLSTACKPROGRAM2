package com.ais;

public class Question6 {
   
    private String name;
    private String jobTitle;
    private double salary;

    
    public Question6(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getJobTitle() {
        return jobTitle;
    }

    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

   
    public double getSalary() {
        return salary;
    }

    
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    
    public void applySalaryIncrease(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    
    public static void main(String[] args) {
        
        Question6 emp = new Question6("John Doe", "Software Engineer", 70000.00);

        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: $" + emp.getSalary());

       
        emp.updateSalary(75000.00);
        System.out.println("\nUpdated Salary: $" + emp.getSalary());

        
        emp.applySalaryIncrease(10);
        System.out.println("Salary after 10% increase: $" + emp.getSalary());
    }
}
