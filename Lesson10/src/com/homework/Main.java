package com.homework;

import com.homework.shop.Shop;

public class Main {
    public static void main(String[] args) {
        for (int i = 0;i<3;i++){
            new Shop("CashBox "+i,10).start();
        }
    }
}
