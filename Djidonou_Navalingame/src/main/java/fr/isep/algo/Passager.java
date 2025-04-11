package fr.isep.algo;

class Passager extends Personne {
    protected String passeport;

    public Passager(int identifiant, String nom, String adresse, int contact, String passeport){
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    // Méthodes pour gérer la réservation
    public void reserverVol() {
    }

    public void annulerReservation() {
    }

    public void obtenirReservation() {
    }

    @Override
    public void obtenirInfos() {
        super.obtenirInfos();
        System.out.println("Passeport: " + passeport);
    }
}
