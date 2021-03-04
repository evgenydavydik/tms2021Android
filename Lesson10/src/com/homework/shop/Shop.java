package com.homework.shop;

import java.util.List;

public class Shop {
    private final List<Cashbox> cashboxList;
    private int freeCashbox;
    private int countClients;


    public Shop(List<Cashbox> cashboxList, int countClients) {
        this.cashboxList = cashboxList;
        freeCashbox = cashboxList.size();
        this.countClients = countClients;
    }

    public synchronized void buy(String purchase) {
        while (countClients-- > 0) {
            boolean checkServe = cashboxList.get(freeCashbox - 1).serveBuyer(purchase);
            freeCashbox--;
            if (freeCashbox == 0) {
                freeCashbox = cashboxList.size();
            }
            if (checkServe)
                break;
        }
    }

    public int getCountClients() {
        return countClients;
    }
}
