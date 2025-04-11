package fr.isep.algo;

import java.util.ArrayList;
import java.util.List;

class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private List<Vol> volsDepart;
    private List<Vol> volsArrivee;

    // Constructeur
    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.volsDepart = new ArrayList<>();
        this.volsArrivee = new ArrayList<>();
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Vol> getVolsDepart() {
        return volsDepart;
    }

    public List<Vol> getVolsArrivee() {
        return volsArrivee;
    }

    // Méthode spécifique demandée
    public void affecterVol(Vol vol, boolean estDepart) {
        if (estDepart) {
            volsDepart.add(vol);
            vol.setAeroportDepart(this);
            System.out.println("Vol " + vol.getNumeroVol() + " affecté au départ de l'aéroport " + this.nom);
        } else {
            volsArrivee.add(vol);
            vol.setAeroportArrivee(this);
            System.out.println("Vol " + vol.getNumeroVol() + " affecté à l'arrivée de l'aéroport " + this.nom);
        }
    }

    public List<Vol> listerVolsDepart() {
        System.out.println("Liste des vols au départ de l'aéroport " + this.nom + ":");
        for (Vol vol : volsDepart) {
            System.out.println("- Vol " + vol.getNumeroVol() + " vers " + vol.getDestination() +
                    " à " + vol.getDateHeureDepart());
        }
        return volsDepart;
    }

    public List<Vol> listerVolsArrivee() {
        System.out.println("Liste des vols à l'arrivée de l'aéroport " + this.nom + ":");
        for (Vol vol : volsArrivee) {
            System.out.println("- Vol " + vol.getNumeroVol() + " depuis " + vol.getOrigine() +
                    " à " + vol.getDateHeureArrivee());
        }
        return volsArrivee;
    }

    @Override
    public String toString() {
        return "Aéroport [Nom: " + nom + ", Ville: " + ville + ", Description: " + description + "]";
    }

}