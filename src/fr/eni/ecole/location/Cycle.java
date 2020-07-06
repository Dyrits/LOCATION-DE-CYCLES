package fr.eni.ecole.location;

import java.time.LocalDate;

public abstract class Cycle {
    private String marque, modele;
    private LocalDate dateAchat;
    private float tarifHoraire;

    /**
     * Constructeur.
     *
     * @param marque String | Marque du cycle.
     * @param modele String |  Modèle du cycle.
     * @param dateAchat LocalDate | Date d'achat du cycle.
     */
    public Cycle(String marque, String modele, LocalDate dateAchat) {
        setMarque(marque);
        setModele(modele);
        setDateAchat(dateAchat);
    }

    /**
     *
     * @return String | Affichage formaté détaillant les informations sur le cycle.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " " + getMarque() +
                " " + getModele() +
                " (" + getAge() + (getAge() > 1 ? "ans)" : "an)") +
                " " + getSpecificites() +
                " " + String.format("%.02f€/heure", getTarifHoraire());
    }

    /**
     *
     * @return String | Affichage formaté des spécificités propre à chaque catégorie de cycle.
     */
    protected abstract String getSpecificites();

    /**
     *
     * @return int | Nombre d'années depuis l'achat du cycle.
     */
    public int getAge() {
        return this.dateAchat.until(LocalDate.now()).getYears();
    }


    // GETTERS AND SETTERS

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public float getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(float tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }
}
