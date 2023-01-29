package org.fasttrackit.course8.homework.interfaces;

import java.time.LocalDateTime;
import java.util.Date;

public class MainHierarchy {
    public static void main(String[] args) {

        Programmer programmer=new Programmer(LocalDateTime,"programmer","english");
       programmer.getPosition();

       DatabaseAdmin databaseAdmin=new DatabaseAdmin(LocalDateTime,"Admin","idk");
       databaseAdmin.getAdress();

    }
}
