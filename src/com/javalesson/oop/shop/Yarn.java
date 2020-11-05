package com.javalesson.oop.shop;

public class Yarn {
    boolean wool;
    int size;
    String color;
    int price;

    public Yarn(boolean wool) {
        this.wool = wool;
    }

    public Yarn(boolean wool, int size) {
        this(wool);
        this.size = size;
    }

    public Yarn(boolean wool, int size, String color) {
        this(wool, size);
        this.color = color;
    }

    public Yarn(boolean wool, int size, String color, int price) {
        this(wool, size, color);
        this.price = price;
    }

    public String ride() {
        return "Yarn rides";
    }
}
