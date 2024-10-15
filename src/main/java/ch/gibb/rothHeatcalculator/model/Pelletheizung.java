package ch.gibb.rothHeatcalculator.model;
/**
 * @author Liam Roth
 * @version 1.0
 * @since 31.08.2023
 */
public class Pelletheizung extends Heizung {

    /**
     * constructor Pelletheizung
     * @param kWh
     * @param heizungsname
     */
    public Pelletheizung(int kWh, String heizungsname) {
    super (kWh, heizungsname);
    }

    /**
     * Kg wird ausgerechnet
     * @return
     */
    @Override
    public double getKg(){
        return getkWh() / 4.8;
    }

    /**
     * Volumen wird ausgerechnet
     * @return
     */
    @Override
    public double getM3(){
        return getKg() / Heizungskonstante.DICHTE_PELLETS;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Pelletheizung" +
                super.toString() +
                ", M3= " + getM3() +
                ", Kg= " + getKg();
    }
}

