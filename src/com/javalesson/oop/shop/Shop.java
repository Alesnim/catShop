package com.javalesson.oop.shop;

public class Shop {
    Saler saler;
    Cash cash;
    Warehouse warehouse;


    public Shop() {
        saler = new Saler();
        cash = new Cash();
        warehouse = new Warehouse(10);
    }

    public Yarn buy(String name, int money) {
        // TODO: add realization this method
        return new YarnNone();
    }

}
