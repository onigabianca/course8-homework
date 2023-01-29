package org.fasttrackit.course8.homework;

import java.lang.management.MonitorInfo;
public class MainCode {
    public static void main(String[] args) {
        Product product = new Product("Ceas",223,"ceas de mana",10);
        System.out.println(product.getName());
        System.out.println("Pretul produsului este:");
        System.out.println(product.getPrice());

       Cosmetics cosmetics=new Cosmetics("black",11,"Rimel",22,"Pentru ochi",22);
        System.out.println(cosmetics.getName());
       System.out.println(cosmetics.getDescription());


       Product cosmetics1=new Cosmetics("red",2,"lipstick",33,"pentru buze",123);
        System.out.println("Try POLYMORPHISM");
        if(cosmetics1 instanceof Cosmetics){
            System.out.println("Culoarea produsului este:");
            System.out.println(((Cosmetics)cosmetics).getColor());
        }

        Electronics electronicProduct=new Electronics("Aragaz",5500,"Aragaz cu plita electrica",3,"electric",22,33,100,40);
        System.out.print("Height is: ");
        System.out.println(electronicProduct.getHeight());
        System.out.println(electronicProduct.getName());

        Fridge fridge=new Fridge(120,"Arctic",1400,"frigider modern",5,"A2213",120,50,200,34);
        System.out.println("Temperatura este:");
        System.out.println(fridge.getTemperature());
        System.out.println(fridge.getName());

    }
}
