package com.coltaj.miscwork.lab5;

public class lab5parent {

    private int x;
    private int y;

    public lab5parent() {

        x = 0;
        y = 0;
    }

    public lab5parent(int x1, int y1) {

        x = x1;
        y = y1;
    }

    public void print() {

        System.out.print(x + " " + y + " ");
    }

    public String toString() {

        return x + " " + y + " ";
    }

    public void set(int x1, int y1) {

        x = x1;
        y = y1;
    }

}
