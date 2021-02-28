package com.tms.shop.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private List<Product> productList;

    public Shop(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        if (productList.size() == 0) {
            productList.add(product);
            productList.get(0).setIndexProductAdd(0);
        }
        for (int i = 0; i < productList.size(); i++) {
            if (product.getId() != productList.get(i).getId()) {
                productList.add(product);
                productList.get(i).setIndexProductAdd(i + 1);
                break;
            }
        }
    }

    public void removeProduct(int idProduct) {
        Map<Integer, Integer> mapProducts = new LinkedHashMap<>();
        for (Product product : productList) {
            mapProducts.put(product.getId(), productList.indexOf(product));
        }
        int index = mapProducts.get(idProduct);
        productList.remove(index);
    }

    public void editProduct(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        product.setName(scanner.nextLine());
        System.out.println("Enter type");
        product.setType(scanner.nextLine());
        System.out.println("Enter price");
        product.setPrice(scanner.nextInt());
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Product product : productList) {
            text.append(product.toString()).append('\n');
        }
        return text.toString();
    }
}
