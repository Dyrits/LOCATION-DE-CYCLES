package fr.eni.ecole.location;

import java.time.LocalDate;

public class Velo extends Cycle {
    private int vitesses;

    /**
     * Constructeur.
     *
     * @param marque String | Marque du vélo.
     * @param modele String |  Modele du vélo.
     * @param dateAchat LocalDate | Date d'achat du vélo.
     * @param vitesses int | Nombre de vitesses du vélo.
     */
    public Velo(String marque, String modele, LocalDate dateAchat, int vitesses) {
        super(marque, modele, dateAchat);
        setVitesses(vitesses);
        setTarifHoraire(4.90f);
    }

    /**
     *
     * @return String | Affichage formaté des spécificités du vélo.
     */
    @Override
    protected String getSpecificites() {
        return String.valueOf(getVitesses()).concat(" vitesses");
    }


    // GETTERS AND SETTERS

    public int getVitesses() {
        return vitesses;
    }

    public void setVitesses(int vitesses) {
        this.vitesses = vitesses;
    }
}
