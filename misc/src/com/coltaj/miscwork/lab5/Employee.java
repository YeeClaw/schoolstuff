package com.coltaj.miscwork.lab5;

import org.jetbrains.annotations.NotNull;

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

    @Override
    public void print() { super.print(); }

    @Override
    public boolean equals(Object o) {

        return super.equals(o);
    }

    public void copy(@NotNull Employee employee) {

        employee.getCopy();
    }

    // Getters
    @Override
    public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculateWage();
    }

    public double getHoursWorked() {

        return this.hoursWorked;
    }

    public double getPayRate() {

        return this.payRate;
    }

    public String getDepartment() {

        return this.department;
    }

    @Override
    public Employee getCopy() {

        return new Employee(super.getFirstName(), super.getLastName(), this.payRate, this.hoursWorked, this.department);
    }

    // Setters
    public void setAll(String firstName, String lastName, double payRate,
                       double hoursWorked, String department) {

        super.setName(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
    }
}
