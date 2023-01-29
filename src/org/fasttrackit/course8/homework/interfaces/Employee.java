package org.fasttrackit.course8.homework.interfaces;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee implements Person{
    Date dateOfEmployment;
    String position;

    public Employee(Date dateOfEmployment, String position) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public void getPosition(){
        System.out.println("Position is blbla");
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getBirthday() {
        return null;
    }

    @Override
    public String getAdress() {
        return null;
    }
}
