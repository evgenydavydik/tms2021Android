package com.homework;

import com.homework.shop.Cashbox;
import com.homework.shop.Shop;

import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Cashbox> cashboxList = new LinkedList<>();
        cashboxList.add(new Cashbox(1));
        cashboxList.add(new Cashbox(2));
        cashboxList.add(new Cashbox(3));
        Shop shop = new Shop(cashboxList, 10);
        for (int i = 0; i <= shop.getCountClients(); i++) {
            Buyer buyer = new Buyer(shop);
            buyer.start();
        }
    }
}
