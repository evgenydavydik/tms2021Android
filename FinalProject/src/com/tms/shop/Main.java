package com.tms.shop;

import com.tms.shop.model.Product;
import com.tms.shop.model.Shop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        Shop shop = new Shop(productList);
        Product product1 = new Product(1,"oil","food product",5);
        Product product2 = new Product(2,"meet","food product",15);
        Product product3 = new Product(3,"cheese","food product",3);
        Product product4 = new Product(4,"bread","food product",6);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.getProductList().sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(shop.toString());
        shop.removeProduct(2);
        shop.getProductList().sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getIndexProductAdd()-o1.getIndexProductAdd();
            }
        });
        for (int i=shop.getProductList().size()-1;i>=0;i--){
            System.out.println(shop.getProductList().get(i).toString());
        }
        shop.editProduct(product4);
        System.out.println(shop.toString());
    }
}
