package org.fasttrackit.course8.homework;

public class Fridge extends Electronics{
    private int temperature;
    public Fridge(int temperature,String name, int price, String description, int quantity, String type, int length, int width, int height, int weight) {
        super(name, price, description, quantity, type, length, width, height, weight);
         this.temperature=temperature;

    }

    public int getTemperature() {
        return temperature;
    }
}

