package fr.eni.ecole.location;

import java.time.LocalDate;

public class Gyroroue extends CycleAutonome {

    /**
     * Constructeur.
     *
     * @param marque    String | Marque de la gyroroue.
     * @param modele    String |  Modèle de la gyroroue.
     * @param dateAchat LocalDate | Date d'achat de la gyroroue.
     * @param autonomie double| Autonomie en kilomètres de la gyroroue.
     */
    public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
        super(marque, modele, dateAchat, autonomie);
        setTarifHoraire(18.90f);
    }
}
