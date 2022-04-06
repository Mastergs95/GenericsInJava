package com.skillsoft.generics;

public class Car {

    private String make;
    private String model;
    private int price;

    public Car(String make,String model,int price){
        this.make=make;
        this.model=model;
        this.price=price;
    }

    @Override
    public String toString() {
        return String.format("{Make: %s, Model: %s, Price: %s",make,make,price);
    }
}
