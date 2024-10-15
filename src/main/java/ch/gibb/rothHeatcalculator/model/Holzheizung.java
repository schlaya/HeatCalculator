package ch.gibb.rothHeatcalculator.model;

import ch.gibb.rothHeatcalculator.model.Heizung;
/**
 * @author Liam Roth
 * @version 1.0
 * @since 24.08.2023
 */

public class Holzheizung extends Heizung {
    /**
     * Datentyp von holzname definieren
     */
    protected String holzname;
    /**
     * Datentyp von ster definieren
     */
    protected double ster;

    /**
     * constructor Holzheizung
     * @param holzname
     * @param heizungsname
     * @param kWh
     */
    public Holzheizung(String holzname, String heizungsname, int kWh) {
        super (kWh, heizungsname);
        this.holzname = holzname;
        checkholzname();
    }

    /**
     * Holzname wird zurückgegeben
     * @return
     */
    public String getHolzname() {
        return holzname;
    }

    /**
     * Holzname wird zugewiesen
     * @param holzname
     */
    public void setHolzname(String holzname) {
        this.holzname = holzname;
    }

    /**
     *Ster wird ausgerechnet
     * @return
     */
    public double getSter() {
        ster = getM3() / 0.75;
        return ster;
    }

    /**
     * Volumen wird ausgerechnet
     * @return
     */
    @Override
    public double getM3() {
        return (double)getKg() / dichte();
    }

    /**
     * Kg wird ausgerechnet
     * @return
     */
    @Override
    public double getKg() {
         return getkWh() / 4;
    }

    /**
     * Dichte wird entschieden
     * @return
     */
    public int dichte(){
        switch(holzname) {
            case "Buche":
                return 500;
            case "Tanne":
                return 400;
            case "Gemischt":
                return 425;
            default:
                throw new IllegalArgumentException("Falsche Holzart! ");
        }
    }

    /**
     * Errorhandler Holzname
     */
    public void checkholzname(){
        if (holzname.length()<26) {
            this.holzname = holzname;
        } else {
            throw new IllegalArgumentException("Der Name der Holzart ist zu lang! ");
        }
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Holzheizung" +
                super.toString() +
                "Holzname= '" + holzname + '\'' +
                ", Ster= " + getSter() +
                ", M3= " + getM3() +
                ", Kg= " + getKg()
                ;
    }
}
