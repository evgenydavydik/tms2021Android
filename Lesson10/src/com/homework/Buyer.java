package com.homework;

import com.homework.shop.Shop;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Buyer extends Thread {
    private final Shop shop;
    private List<String> shoppingList;

    public Buyer(Shop shop) {
        this.shop = shop;
        randomListShopping();
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }

    public void randomListShopping() {
        String[] products = new String[]{"Bread", "Cheese", "Meat", "Oil", "Apple", "Orange"};
        Random random = new Random();
        shoppingList = new LinkedList<>();

        for (int i = 0; i < random.nextInt(products.length) + 1; i++) {
            shoppingList.add(products[random.nextInt(products.length)]);
        }

    }

    @Override
    public void run() {
        shop.buy(getShoppingList().toString());
    }
}
