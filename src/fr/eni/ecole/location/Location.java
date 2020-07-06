package fr.eni.ecole.location;

import java.time.LocalDate;
import java.time.Month;

public class Location {
    public static void main(String[] args) {
        Cycle[] disponibles = {
                new Velo("Lapierre", "speed 400", LocalDate.of(2017, Month.JUNE, 2),27),
                new Velo("Btwin", "riverside 900", LocalDate.of(2018, Month.APRIL, 9), 10),
                new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2018, Month.JUNE, 5),40, 150),
                new Gyropode("Weebot", "Echo", LocalDate.of(2017, Month.MAY, 2), 35, 160),
                new Gyroroue("Immotion", "v8", LocalDate.of(2018, Month.MARCH, 25), 40),
                new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2018, Month.MARCH, 25), 30)
        };
        System.out.println("Voici les cycles que nous proposons à la location :");
        for(Cycle cycle : disponibles) {
            System.out.println(cycle);
        }
    }
}
