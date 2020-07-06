package fr.eni.ecole.location;

import java.time.LocalDate;

public abstract class CycleAutonome extends Cycle {
    private int autonomie;

    /**
     * Constructeur.
     *
     * @param marque    String | Marque du cycle autonome.
     * @param modele    String |  Modele du cycle autonome.
     * @param dateAchat LocalDate | Date d'achat du cycle autonome.
     * @param autonomie double| Autnomie en kilomètres du cycle autonome.
     */
    public CycleAutonome(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat);
        setAutonomie(autonomie);
    }

    /**
     *
     * @return String | Affichage formaté des spécificités du cycle autonome.
     */
    @Override
    protected String getSpecificites() {
        return String.valueOf(getAutonomie()) + "km d'autonomie";
    }


    // GETTERS AND SETTERS

    public double getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }
}
