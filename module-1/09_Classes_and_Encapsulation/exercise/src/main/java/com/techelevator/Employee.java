package com.techelevator;



public class Employee {

    public int employeeId;

    public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public String firstName;
    public String lastName;
    public String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String department;
    public double annualSalary;

   public String fullName() {
        return lastName + ", " + firstName;
    }
    public void raiseSalary(double percentage) {
        double raiseAmount = annualSalary * ( percentage/100.00);
        annualSalary += raiseAmount;
    }


}
