package com.homework.shop;

public class Cashbox {
    private final int number;

    public Cashbox(int number) {
        this.number = number;
    }

    public boolean serveBuyer(String purchase) {
        System.out.println("The client is served cashbox " + number + " " + purchase + "\nCustomer served");
        return true;
    }
}
