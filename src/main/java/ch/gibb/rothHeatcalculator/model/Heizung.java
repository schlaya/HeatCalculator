package ch.gibb.rothHeatcalculator.model;

/**
 * @author Liam Roth
 * @version 1.0
 * @since 07.09.2023
 */
public abstract class Heizung {
    /**
     * Datentyp von kWh definieren
     */
    protected int kWh;
    /**
     * Datentyp von heizungsname definieren
     */
    protected String heizungsname;

    /**
     * Constructor der Heizung
     * @param kWh
     * @param heizungsname
     */
    public Heizung(int kWh, String heizungsname) {
        this.kWh = kWh;
        checkkWh();
        this.heizungsname = heizungsname;
        checkheizungsname();
    }

    public abstract double getM3();
    public abstract double getKg();

    /**
     * gibt Heizungsname zurück
     * @return
     */
    public String getHeizungsname() {
        return heizungsname;
    }

    /** Gibt die kWh zurück
     * @return
     */
    public int getkWh() {
        return kWh;
    }

    /**
     * kWh wird zugewiesen
     * @param kWh
     */
    public void setkWh(int kWh) {
        this.kWh = kWh;
    }

    /**
     * Weist den Heizungsnamen zu
     * @param heizungsname
     */
    public void setHeizungsname(String heizungsname) {
        this.heizungsname = heizungsname;
    }

    /**
     * Errorhandler für kWh
     */
    public void checkkWh() {
        if (kWh <= 200000) {
            this.kWh = kWh;
        } else {
            throw new IllegalArgumentException("So viele kWh bieten wir nicht an! ");
        }
    }

    /**
     * Errorhandler für heizungsname
     */
    public void checkheizungsname(){
        if (heizungsname.length()<26) {
            this.heizungsname = heizungsname;
        } else {
            throw new IllegalArgumentException("Der Name der Heizung ist zu lang! ");
        }
    }

    /**
     * toString
     * @return
     */
    public String toString() {
        return ", Heizungsname='" + heizungsname + '\'' +
                ", kWh=" + kWh
                ;
    }
}
