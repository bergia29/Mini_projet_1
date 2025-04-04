package fr.isep.algo;

class Employe extends Personne {
    protected int NumeroEmploye;
    protected int DateEmbauche;

    public Employe(int Identifiant, String Nom, String Adresse, int Contact, int NumeroEmploye, int DateEmbauche){
        super(Identifiant, Nom, Adresse, Contact);
        this.NumeroEmploye = NumeroEmploye;
        this.DateEmbauche = DateEmbauche;
    }
    public void obtenirRole(){
    }

    @Override
    public void obtenirInfos(){
        super.obtenirInfos();
    }
}
