package com.javalesson.oop.shop;

public class Cat {
    Yarn yarn;
    int money;

    public Cat(int money) {
        yarn = new YarnNone();
        this.money = money;

    }

    public void buyYarn(String name, Shop shop){
        yarn = shop.buy(name, money);
    }


}
