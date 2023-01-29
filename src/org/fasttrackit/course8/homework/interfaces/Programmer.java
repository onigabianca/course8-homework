package org.fasttrackit.course8.homework.interfaces;

import java.util.Date;

public class Programmer extends Employee {
    String language;

    public Programmer(Date dateOfEmployment, String position, String language) {
        super(dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void getPosition() {
        System.out.println("programmer");
    }
}
