package fr.isep.algo;

import java.util.ArrayList;
import java.util.List;

class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private StatutVol etat; // Utilisation de l'énumération StatutVol
    private Avion avion;
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;
    private List<Passager> passagers;
    private List<Pilote> pilotes;
    private List<PersonnelCabine> equipageCabine;

    // Constructeur
    public Vol(String numeroVol, String origine, String destination,
               String dateHeureDepart, String dateHeureArrivee,
               Aeroport aeroportDepart, Aeroport aeroportArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = StatutVol.PROGRAMME; // État par défaut
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.passagers = new ArrayList<>();
        this.pilotes = new ArrayList<>();
        this.equipageCabine = new ArrayList<>();
    }

    public Vol(String numeroVol) {
    }

    public Vol(String numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
    }

    // Méthodes spécifiques

    // Planifier un vol
    public void planifierVol() {
        if (this.etat == StatutVol.PROGRAMME) {
            System.out.println("Vol déjà programmé.");
        } else {
            this.etat = StatutVol.PROGRAMME;
            System.out.println("Vol " + this.numeroVol + " planifié avec succès.");
        }
    }

    // Annuler un vol
    public void annulerVol() {
        if (this.etat == StatutVol.ANNULE) {
            System.out.println("Vol déjà annulé.");
        } else {
            this.etat = StatutVol.ANNULE;
            System.out.println("Vol " + this.numeroVol + " annulé.");
        }
    }

    // Modifier un vol
    public void modifierVol(String nouvelleDestination, String nouvelleDateHeureDepart, String nouvelleDateHeureArrivee) {
        this.destination = nouvelleDestination;
        this.dateHeureDepart = nouvelleDateHeureDepart;
        this.dateHeureArrivee = nouvelleDateHeureArrivee;
        System.out.println("Vol " + this.numeroVol + " modifié.");
    }

    // Afficher la liste des passagers
    public void listingPassager() {
        if (this.passagers.isEmpty()) {
            System.out.println("Aucun passager inscrit pour ce vol.");
        } else {
            System.out.println("Liste des passagers pour le vol " + this.numeroVol + ":");
            for (Passager passager : this.passagers) {
                System.out.println("- " + passager.getNom());
            }
        }
    }

    // Autres méthodes (Getters, Setters, etc.)

    // Getters et Setters
    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public StatutVol getEtat() {
        return etat;
    }

    public void setEtat(StatutVol etat) {
        this.etat = etat;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    public List<Passager> getPassagers() {
        return passagers;
    }

    public void ajouterPassager(Passager passager) {
        this.passagers.add(passager);
    }

    public List<Pilote> getPilotes() {
        return pilotes;
    }

    public void ajouterPilote(Pilote pilote) {
        this.pilotes.add(pilote);
    }

    public List<PersonnelCabine> getEquipageCabine() {
        return equipageCabine;
    }

    public void ajouterMembreEquipage(PersonnelCabine membreEquipage) {
        this.equipageCabine.add(membreEquipage);
    }

    // Énumération StatutVol pour les états du vol
    public enum StatutVol {
        PROGRAMME,
        EN_COURS,
        TERMINE,
        ANNULE,
    }
}
