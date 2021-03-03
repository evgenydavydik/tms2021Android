package com.homework.shop;

import com.homework.Buyer;

import java.util.List;

public class Cashbox {
    Buyer buyer;

    public Cashbox(Buyer buyer) {
        this.buyer = buyer;
    }

    synchronized String serveBuyer(String name) {
        return "The client is served " + name + " " + buyer.getShoppingList().toString()+"\nCustomer served";
    }

}
