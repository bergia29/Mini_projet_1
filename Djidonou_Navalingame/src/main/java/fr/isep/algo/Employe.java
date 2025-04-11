package fr.isep.algo;

class Employe extends Personne {
    protected int numeroEmploye;
    protected String dateEmbauche;

    public Employe(int identifiant, String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche){
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
        this.numeroEmploye = numeroEmploye;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole() {
        return "Employé";
    }

    @Override
    public void obtenirInfos(){
        super.obtenirInfos();
        System.out.println("Numéro Employé: " + numeroEmploye);
        System.out.println("Date d'embauche: " + dateEmbauche);
        System.out.println("Rôle: " + obtenirRole());
    }

    @Override
    public String toString() {
        return super.toString() + " numeroEmploye=" + numeroEmploye + ", dateEmbauche = " + dateEmbauche;
    }
}
