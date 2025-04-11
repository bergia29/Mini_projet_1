package fr.isep.algo;

class PersonnelCabine extends Employe {
    private String qualification; // Utilisation de "qualification" en minuscule

    // Constructeur
    public PersonnelCabine(int identifiant, String nom, String adresse, int contact,
                           int numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification; // Le paramètre et l'attribut sont maintenant cohérents
    }

    // Getters et Setters
    public String getQualification() {
        return qualification; // Utilisation de "qualification" en minuscule
    }

    public void setQualification(String qualification) {
        this.qualification = qualification; // Utilisation de "qualification" en minuscule
    }

    @Override
    public String obtenirRole() {
        return "Personnel de Cabine";
    }

    public void affecterVol(Vol vol) {
        System.out.println("Personnel de cabine " + this.nom + " affecté au vol " + vol.getNumeroVol());
        // Code pour affecter le personnel au vol
    }

    public Vol obtenirVol(String numeroVol) {
        System.out.println("Recherche du vol avec numéro: " + numeroVol + " pour le personnel de cabine " + this.nom);
        // Code pour chercher le vol dans la base de données
        return null;
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Qualification: " + qualification); // Affiche la qualification
    }
}
