package ch.gibb.rothHeatcalculator.model;

import ch.gibb.rothHeatcalculator.model.Heizung;

/**
 * @author Liam Roth
 * @version 1.0
 * @since 31.08.2023
 */
public class Schnitzelheizung extends Heizung {
    /** Datentyp von holzname definieren
     *
     */
    protected String holzname;

    /** Konstruktor von Schnitzelheizung
     * @param holzname
     * @param kWh
     */
    public Schnitzelheizung(String holzname, int kWh, String heizungsname) {
        super (kWh, heizungsname);
        this.holzname = holzname;
        this.kWh = kWh;
        getKg();
        getM3();
    }


    /**
     * Berechnet die M^3
     * @return
     */
    @Override
    public double getM3() {
        return (double) getKg() / dichte();
    }

    /** Berechnet die Kg
     * @return
     */
    @Override
    public double getKg() {
        return getkWh() / 3.5;
    }

    /** Berechnet die Dichte
     * @return
     */
    public int dichte() {
        switch (holzname) {
            case "Buche":
                return 280;
            case "Tanne":
                return 230;
            case "Gemischt":
                return 250;
            default:
                throw new IllegalArgumentException("Falsche Holzart! ");
        }
    }

    /** Errorhandler Holzname
     *
     */
    public void checkholzname() {
        if (holzname.length() < 26) {
            this.holzname = holzname;
        } else {
            throw new IllegalArgumentException("Der Name der Holzart ist zu lang! ");
        }
    }

    /**
     * toString Schnitzelheizung
     * @return
     */
    @Override
    public String toString() {
        return "Schnitzelheizung" +
                super.toString() +
                ", Holzname='" + holzname + '\'' +
                ", M3= " + getM3() +
                ", Kg= " + getKg()
                ;
    }
}
