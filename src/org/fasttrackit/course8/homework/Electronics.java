package org.fasttrackit.course8.homework;

public class Electronics extends Product{
    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;

    public Electronics(String name, int price, String description, int quantity, String type, int length, int width, int height, int weight) {
        super(name, price, description, quantity);
        System.out.println("Create an electronic product:");
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
