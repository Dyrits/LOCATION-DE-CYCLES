package fr.eni.ecole.location;

import java.time.LocalDate;

public class Gyropode extends CycleAutonome {
    private int tailleMinimale;

    /**
     * Constructeur.
     *
     * @param marque String | Marque du gyropode.
     * @param modele String |  Modèle du gyropode.
     * @param dateAchat LocalDate | Date d'achat du gyropode.
     * @param autonomie double| Autonomie en kilomètres du gyropode.
     * @param tailleMinimale int | Taille minimale en centimètres, nécessaire pour pouvoir louer le gyropode.
     */
    public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMinimale) {
        super(marque, modele, dateAchat, autonomie);
        setTailleMinimale(tailleMinimale);
        setTarifHoraire(29.90f);
    }

    /**
     *
     * @return String | Affichage formaté des spécificités du gyropode.
     */
    @Override
    protected String getSpecificites() {
        return super.getSpecificites() + "[" + getTailleMinimale() / 100 + "m" + (getTailleMinimale() -  100) + " minimum]";
    }


    // GETTERS AND SETTERS

    public int getTailleMinimale() {
        return tailleMinimale;
    }

    public void setTailleMinimale(int tailleMinimale) {
        this.tailleMinimale = tailleMinimale;
    }
}
