package ch.gibb.rothHeatcalculator.application;

import ch.gibb.rothHeatcalculator.model.Holzheizung;
import ch.gibb.rothHeatcalculator.model.Pelletheizung;
import ch.gibb.rothHeatcalculator.model.Schnitzelheizung;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Holzheizung abc = new Holzheizung("Tanne", "Judihui", 1500);
            System.out.println(abc);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        try {
            Pelletheizung def = new Pelletheizung(48000, "Judihui1.9");
            System.out.println(def);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        try {
            Schnitzelheizung ghi = new Schnitzelheizung("Buche", 48000, "Judihui2");
            System.out.println(ghi);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}