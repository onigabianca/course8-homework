package org.fasttrackit.course8.homework.interfaces;

import java.util.Date;

public class DatabaseAdmin extends Employee{
    String dbTechnology;

    public DatabaseAdmin(Date dateOfEmployment, String position, String dbTechnology) {
        super(dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAdress() {
        return "db admin" + super.getAdress();
    }
}
