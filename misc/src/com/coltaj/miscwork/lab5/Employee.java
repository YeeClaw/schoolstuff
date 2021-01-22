package com.coltaj.miscwork.lab5;

public class Employee extends Person{

    private double payRate, hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    // Constructors
    public Employee() {

        super();
    }

    public Employee(String firstName, String lastName, double payRate, double hoursWorked, String department) {

        super(firstName, lastName);
        this.payRate = payRate;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    // Methods
    public double calculateWage() {

        double wage = 0;

        if(hoursWorked <= HOURS) {
            wage += hoursWorked * payRate;
        } else if(hoursWorked > HOURS){
            wage += (hoursWorked * payRate) * OVERTIME;
        }

        return wage;
    }

    // Getters
    public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculateWage();
    }

    // Setters
}
