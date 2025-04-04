package fr.isep.algo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Vol {
        protected String numeroVol, Origine, Destination, Etat;
        protected Date dateHeureDepart, dateHeureArrivee;
        protected List<Passager> passagers = new ArrayList<>();

        public Vol(String numeroVol, String Origine, String Destination, Date dateHeureDepart, Date dateHeureArrivee) {
            this.numeroVol = numeroVol;
            this.Origine = Origine;
            this.Destination = Destination;
            this.dateHeureDepart = dateHeureDepart;
            this.dateHeureArrivee = dateHeureArrivee;
            this.Etat = "Prévu";
        }

        public void planifierVol() {
            this.Etat = "Planifié";
        }

        public void annulerVol() {
            this.Etat = "Annulé";
        }

        public void modifierVol(String nouvelEtat) {
            this.Etat = nouvelEtat;
        }

        public void ajouterPassager(Passager passager) {
            passagers.add(passager);
        }
    }

