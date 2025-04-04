package fr.isep.algo;

class Reservation {
        protected String numeroReservation, dateReservation, statut;
        protected Passager passager;

        public Reservation(String numeroReservation, String dateReservation, String statut) {
            this.numeroReservation = numeroReservation;
            this.dateReservation = dateReservation;
            this.statut = statut;
        }
        public void modifPassager(Passager passager) {
            this.passager = passager;
        }

        public void confirmerReservation() {
            this.statut = "Confirmée";
        }

        public void annulerReservation() {
            this.statut = "Annulée";
        }

        public void modifierReservation(String nouveauStatut) {
            this.statut = nouveauStatut;
        }
}
