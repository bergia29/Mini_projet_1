package fr.isep.algo;

class Avion {
    protected String immatriculation;
    protected String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public boolean verifierDisponibilite() {
        // Logique pour vérifier la disponibilité
        return true;
    }
}

