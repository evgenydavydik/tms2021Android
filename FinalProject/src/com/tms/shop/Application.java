package com.tms.shop;

import com.tms.shop.model.Product;
import com.tms.shop.model.Shop;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);
    Shop shop = new Shop(new LinkedList<>());

    public void start() {
        int action = 5;
        boolean isTrue = true;
        do {
            System.out.println("""
                    Select an action:
                    1-Display of all products
                    2-Adding a product
                    3-Removing a product
                    4-Editing a product
                    0-Exit""");
            if (scanner.hasNextInt()) {
                action = scanner.nextInt();
            }
            switch (action) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    remoteProduct();
                    break;
                case 4:
                    editProduct();
                    break;
                case 0:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Please select an action from the list");
            }
        }
        while (isTrue);
    }

    private void displayProducts() {
        List<Product> products = new LinkedList<>();
        products = shop.getProductList();
        boolean check = true;
        int action = 0;
        do {
            System.out.println("""
                    Select to sort the product list
                    1 - by price (ascending)
                    2 - by price (decreasing)
                    3 - by adding (first new, then older)""");
            if (scanner.hasNextInt()) {
                action = scanner.nextInt();
            }
            switch (action) {
                case 1:
                    sortPriceIncrease(products);
                    System.out.println(shop.toString());
                    check = false;
                    break;
                case 2:
                    sortPriceDecreasing(products);
                    System.out.println(shop.toString());
                    check = false;
                    break;
                case 3:
                    sortAdding(products);
                    System.out.println(shop.toString());
                    check = false;
                    break;
                default:
                    System.out.println("Please select a sort from the list");
            }
        } while (check);

    }

    private void sortPriceIncrease(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    private void sortPriceDecreasing(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
    }

    private void sortAdding(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getIndexProductAdd() - o1.getIndexProductAdd();
            }
        });
    }

    private void addProduct() {
        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter type");
        String type = scanner.nextLine();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        Product product = new Product(id, name, type, price);
        shop.addProduct(product);
    }

    private void remoteProduct() {
        System.out.println("Enter id");
        int id = scanner.nextInt();
        shop.removeProduct(id);
    }

    private void editProduct() {
        System.out.println("Enter id");
        int id = scanner.nextInt();
        for (Product product : shop.getProductList()) {
            if (product.getId() == id) {
                shop.editProduct(product);
            }
        }

    }
}
