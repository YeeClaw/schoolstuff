package com.coltaj.miscwork.lab5;

import org.jetbrains.annotations.NotNull;

public class Person {

    private String firstName, lastName;

    // Constructors
    public Person() {

        this("", "");
    }

    public Person(String firstName, String lastName) {

        setName(firstName, lastName);
    }

    // Methods
    public void printLastFirst() {

        System.out.print(this.firstName + ", " + this.lastName);
    }

    public void print() {

        System.out.print(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;

        Person other = (Person)o;

        return firstName.equals(other.getFirstName()) &&
                lastName.equals(other.getLastName());
    }

    public void copy(@NotNull Person person) {

        person.getCopy();
    }

    // Setters
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = firstName;
    }

    //Getters
    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    @Override
    public String toString() {

        return "Person: " + firstName + ", " + lastName;
    }

    public Person getCopy() {

        return new Person(this.firstName, this.lastName);
    }
}
