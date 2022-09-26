package com.techelevator;

public class Employee {

    public String getFullName() {
        return lastName + ", " + firstName;
    }
    public void raiseSalary(double percentage) {
        double raiseAmount = annualSalary * ( percentage/100.00);
        annualSalary += raiseAmount;
    }


}
