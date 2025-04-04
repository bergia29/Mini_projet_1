package fr.isep.algo;

class PersonnelCabine extends Employe {
    protected String qualification;

    public PersonnelCabine(int Identifiant, String Nom, String Adresse, int Contact, int NumeroEmploye, int DateEmbauche, String qualification){
        super(Identifiant, Nom, Adresse, Contact, NumeroEmploye, DateEmbauche);
        this.qualification = qualification;
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
