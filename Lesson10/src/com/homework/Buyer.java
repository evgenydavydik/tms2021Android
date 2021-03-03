package com.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Buyer {
    private List<String> shoppingList;

    public Buyer() {
        randomListShopping();
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }

    public void randomListShopping() {
        String[] products = new String[]{"Bread", "Cheese", "Meat", "Oil", "Apple", "Orange"};
        Random random = new Random();
        shoppingList = new LinkedList<>();

        for (int i = 0; i < random.nextInt(products.length)+1; i++) {
            shoppingList.add(products[random.nextInt(products.length)]);
        }

    }
}
