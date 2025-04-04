package fr.isep.algo;

class Pilote extends Employe {
    protected int Licence;
    protected String heuresDeVol;

    public Pilote(int Identifiant, String Nom, String Adresse, int Contact, int NumeroEmploye, int DateEmbauche, int Licence, String heuresDeVol){
        super(Identifiant, Nom, Adresse, Contact, NumeroEmploye, DateEmbauche);
        this.Licence = Licence;
        this.heuresDeVol = heuresDeVol;
    }

    public void affecterVol(){
    }
    public void obtenirVol(){
    }

    @Override
    public void obtenirInfos(){
        super.obtenirInfos();
    }
    public void obtenirRole(){
        super.obtenirRole();
    }
}


