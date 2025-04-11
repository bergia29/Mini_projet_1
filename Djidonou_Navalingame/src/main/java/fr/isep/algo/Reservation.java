package fr.isep.algo;

class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private Statut statut;  // Utilisation de l'énumération Statut
    private Vol vol;
    private Passager passager;

    // Constructeur
    public Reservation(String numeroReservation, String dateReservation, Statut statut, Vol vol, Passager passager) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.vol = vol;
        this.passager = passager;
    }

    // Getters et Setters
    public String getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(String numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    // Méthode
    @Override
    public String toString() {
        return "Réservation [Numéro: " + numeroReservation + ", Date: " + dateReservation + ", Statut: " + statut + ", Vol: " + vol + ", Passager: " + passager + "]";
    }


    public void confirmerReservation() {
        this.statut = Statut.CONFIRMEE;  // Utilisation de l'énumération
        this.modifier();
        System.out.println("Réservation confirmée: " + this.numeroReservation);
    }

    public void annulerReservation() {
        this.statut = Statut.ANNULEE;  // Utilisation de l'énumération
        this.modifier();
        System.out.println("Réservation annulée: " + this.numeroReservation);
    }

    public void modifierReservation(Vol nouveauVol, String nouvelleDateReservation) {
        this.vol = nouveauVol;
        this.dateReservation = nouvelleDateReservation;
        this.modifier();
        System.out.println("Réservation modifiée: " + this.numeroReservation);
    }

    private void modifier() {
        System.out.println("Réservation " + this.numeroReservation + " mise à jour.");
    }

    public enum Statut {
        CONFIRMEE,
        ANNULEE,
        EN_ATTENTE
    }
}
