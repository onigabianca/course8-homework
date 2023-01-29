package org.fasttrackit.course8.homework;

public class Product {
    private String name;
    private int price;
    private String description;
    private int quantity;

    public Product(String name, int price, String description, int quantity) {
        System.out.println("Create a product:");
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getName() {
        return "Numele produsului este: "+name;
    }

    public int getPrice() {
        return  price;
    }

    public String getDescription() {
        return "Despre produs:" + description;
    }

    public int getQuantity() {
        return quantity;
    }
}
