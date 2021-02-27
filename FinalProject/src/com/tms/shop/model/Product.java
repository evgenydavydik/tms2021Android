package com.tms.shop.model;

public class Product {
    private int id;
    private String name;
    private String type;
    private int price;
    private int indexProductAdd;

    public Product(int id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIndexProductAdd() {
        return indexProductAdd;
    }

    public void setIndexProductAdd(int indexProductAdd) {
        this.indexProductAdd = indexProductAdd;
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price;
    }
}
