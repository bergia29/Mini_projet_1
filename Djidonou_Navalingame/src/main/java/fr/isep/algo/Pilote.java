package fr.isep.algo;

class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    // Constructeur
    public Pilote(int identifiant, String nom, String adresse, int contact,
                  int numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    // Getters et Setters
    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getHeuresDeVol() {
        return heuresDeVol;
    }

    public void setHeuresDeVol(int heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }

    public void affecterVol(Vol vol) {
        System.out.println("Pilote " + this.nom + " affecté au vol " + vol.getNumeroVol());
        // Code pour affecter le pilote au vol
    }

    public Vol obtenirVol(String numeroVol) {
        System.out.println("Recherche du vol avec numéro: " + numeroVol + " pour le pilote " + this.nom);
        // Code pour chercher le vol dans la base de données
        return null;
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Licence: " + licence);
        System.out.println("Heures de vol: " + heuresDeVol);
    }
}
