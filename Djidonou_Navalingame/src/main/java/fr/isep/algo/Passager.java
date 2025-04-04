package fr.isep.algo;

class Passager extends Personne{
    protected String Passeport;

    public Passager(int Identifiant, String Nom, String Adresse, int Contact, String Passeport){
        super(Identifiant, Nom, Adresse, Contact);
        this.Passeport = Passeport;
    }

    public void reserverVol(){
    }
    public void annulerReservation(){
    }
    public void obtenirReservation(){
    }

    @Override
    public void obtenirInfos(){
        super.obtenirInfos();
    }
}
