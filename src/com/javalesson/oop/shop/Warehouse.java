package com.javalesson.oop.shop;

public class Warehouse {
    Yarn yarns[];
    int countYarn = 0;


    public Warehouse(int size){
        yarns = new Yarn[size];
    }

    public void setYarn(Yarn yarn) {
        if (countYarn < yarns.length) {
            yarns[countYarn] = yarn;
        }
        countYarn++;
    }

    public Yarn getYarn(String name) {
        Yarn result = new YarnNone();
        for (int i=0; i < countYarn; i++) {
            if (name.equals(yarns[i].name)){
                result = yarns[i];
                yarns[i] = new YarnNone();
                break;
            }

        }
        return result;
    }


}
