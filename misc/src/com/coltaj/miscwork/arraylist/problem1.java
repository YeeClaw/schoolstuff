package com.coltaj.miscwork.arraylist;

import java.util.ArrayList;

public class problem1 {

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<String>();
        ArrayList<String> veggie = new ArrayList<String>();

        fruit.add("Honeydew");
        fruit.add("Grape");
        fruit.add("Huckleberry");
        fruit.add("Kumquat");
        fruit.add("Jujube");
        fruit.add("Tangerine");
        fruit.add("Pear");
        fruit.add("Lemon");
        fruit.add("Watermelon");
        fruit.add("Pineapple");

        veggie.add("Broccoli");
        veggie.add("Asparagus");
        veggie.add("Carrot");
        veggie.add("Cauliflower");
        veggie.add("Sweet corn");
        veggie.add("Onion");
        veggie.add("Tomato");
        veggie.add("Pea");
        veggie.add("Lettuce");
        veggie.add("Pumpkin");

        ArrayList<String> fruitveggie = new ArrayList<String>();
        fruitveggie.addAll(fruit);
        fruitveggie.addAll(veggie);

        System.out.println(fruitveggie.toString());
    }
}
