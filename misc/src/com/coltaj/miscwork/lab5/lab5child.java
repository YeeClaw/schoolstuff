package com.coltaj.miscwork.lab5;

public class lab5child extends lab5parent{

    private int z;

    public lab5child() {

        super();
        this.z = 0;
    }

    public lab5child(int x1, int y1, int z1) {

        super(x1, y1);
        this.z = z1;
    }

    public void print() {

        super.print();
        System.out.print(z);
    }

    public String toString() {

        return super.toString() + z;
    }

    public void set(int x1, int y1, int z1) {

        super.set(x1, y1);
        this.z = z1;
    }
}
