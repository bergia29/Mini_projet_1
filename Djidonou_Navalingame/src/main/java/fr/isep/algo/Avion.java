package fr.isep.algo;

class Avion {
    protected String immatriculation;
    protected String modele;
    private int capacite;
    private boolean disponible;


    public Avion(String immatriculation, String modele, int capacite, boolean disponible) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.disponible = disponible;
    }

    public boolean verifierDisponibilite() {
        System.out.println("Avion " + immatriculation + " (" + modele + "), capacité: " + capacite + ", disponible: " + disponible);
        return disponible;
    }


    public void affecterVol() {
        if (disponible) {
            disponible = false;
            System.out.println("Avion " + immatriculation + " (" + modele + ") affecté au vol.");
        } else {
            System.out.println("Avion " + immatriculation + " (" + modele + ") est actuellement indisponible. Il est déjà affecté à un vol ou nécessite une maintenance.");
        }
    }

    public boolean verifierCapacite(int passagers) {
        if (passagers <= capacite) {
            System.out.println("L'avion peut accueillir " + passagers + " passagers.");
            return true;
        } else {
            System.out.println("L'avion ne peut pas accueillir " + passagers + " passagers. Capacité maximale : " + capacite + ".");
            return false;
        }
    }

    // Getters et Setters
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
