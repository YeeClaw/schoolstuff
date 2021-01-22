package com.coltaj.miscwork;

import com.coltaj.miscwork.lab5.*;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Austin", "Colt", 14.5, 1, "Health");

        String product = employee.toString();
        System.out.println(product);
    }
}
