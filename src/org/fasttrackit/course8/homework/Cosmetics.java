package org.fasttrackit.course8.homework;

public class Cosmetics extends Product{
    private String color;
    private int weight;

    public Cosmetics(String color, int weight,String name, int price, String description, int quantity) {
        super(name, price, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
