package com.homework.shop;

import com.homework.Buyer;

public class Shop extends Thread {
    private int coutClients;

    public Shop(String name, int countClients) {
        super(name);
        this.coutClients = countClients;
    }

    public void run() {
        while (coutClients-- > 0) {
            Buyer buyer = new Buyer();
            Cashbox cashbox = new Cashbox(buyer);
            System.out.println(cashbox.serveBuyer(Thread.currentThread().getName()));
        }
    }

}
