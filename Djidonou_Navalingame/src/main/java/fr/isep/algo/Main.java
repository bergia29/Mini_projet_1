package fr.isep.algo;

import java.util.*;

public class Main {
    // Listes pour stocker les objets
    private static List<Personne> personnes = new ArrayList<>();
    private static List<Employe> employes = new ArrayList<>();
    private static List<Pilote> pilotes = new ArrayList<>();
    private static List<PersonnelCabine> personnelCabine = new ArrayList<>();
    private static List<Passager> passagers = new ArrayList<>();
    private static List<Avion> avions = new ArrayList<>();
    private static List<Vol> vols = new ArrayList<>();
    private static List<Reservation> reservations = new ArrayList<>();
    private static List<Aeroport> aeroports = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choix;
        do {
            System.out.println("\nMenu principal de gestion :");
            System.out.println("1. Gestion des Personnes");
            System.out.println("2. Gestion des Employés");
            System.out.println("3. Gestion des Pilotes");
            System.out.println("4. Gestion du Personnel de Cabine");
            System.out.println("5. Gestion des Passagers");
            System.out.println("6. Gestion des Avions");
            System.out.println("7. Gestion des Vols");
            System.out.println("8. Gestion des Réservations");
            System.out.println("9. Gestion des Aéroports");
            System.out.println("0. Quitter");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    gestionPersonnes();
                    break;
                case 2:
                    gestionEmployes();
                    break;
                case 3:
                    gestionPilotes();
                    break;
                case 4:
                    gestionPersonnelCabine();
                    break;
                case 5:
                    gestionPassagers();
                    break;
                case 6:
                    gestionAvions();
                    break;
                case 7:
                    gestionVols();
                    break;
                case 8:
                    gestionReservations();
                    break;
                case 9:
                    gestionAeroports();
                    break;
                case 0:
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);

        scanner.close();
    }

    // Méthode CRUD pour Personne
    private static void gestionPersonnes() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Personnes :");
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Rechercher une personne");
            System.out.println("3. Supprimer une personne");
            System.out.println("4. Modifier une personne");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrer l'identifiant : ");
                    int identifiant = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrer l'adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Entrer le contact : ");
                    int contact = scanner.nextInt();
                    personnes.add(new Personne(identifiant, nom, adresse, contact));
                    System.out.println("Personne ajoutée !");
                    break;

                case 2:
                    System.out.print("Entrer l'identifiant recherché : ");
                    int idRecherche = scanner.nextInt();
                    boolean trouve = false;
                    for (Personne p : personnes) {
                        if (p.getIdentifiant() == idRecherche) {
                            System.out.println("Personne trouvée : " + p);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) System.out.println("Identifiant non trouvé !");
                    break;

                case 3:
                    System.out.print("Entrer l'identifiant à supprimer : ");
                    int idSuppression = scanner.nextInt();
                    Iterator<Personne> iterator = personnes.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Personne p = iterator.next();
                        if (p.getIdentifiant() == idSuppression) {
                            iterator.remove();
                            System.out.println("Personne supprimée !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) System.out.println("Identifiant non trouvé !");
                    break;

                case 4:
                    System.out.print("Entrer l'identifiant à modifier : ");
                    int idModification = scanner.nextInt();
                    boolean modifie = false;
                    for (ListIterator<Personne> li = personnes.listIterator(); li.hasNext(); ) {
                        Personne p = li.next();
                        if (p.getIdentifiant() == idModification) {
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le nouveau nom : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Entrer la nouvelle adresse : ");
                            String nouvelleAdresse = scanner.nextLine();
                            System.out.print("Entrer le nouveau contact : ");
                            int nouveauContact = scanner.nextInt();
                            li.set(new Personne(idModification, nouveauNom, nouvelleAdresse, nouveauContact));
                            System.out.println("Personne modifiée !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) System.out.println("Identifiant non trouvé !");
                    break;

                case 0:
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);
    }

    private static void gestionEmployes() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Employés :");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Rechercher un employé");
            System.out.println("3. Supprimer un employé");
            System.out.println("4. Modifier un employé");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrer l'identifiant : ");
                    int identifiant = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrer l'adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Entrer le contact : ");
                    int contact = scanner.nextInt();
                    System.out.print("Entrer le numéro d'employé : ");
                    int numeroEmploye = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer la date d'embauche (format YYYY-MM-DD) : ");
                    String dateEmbauche = scanner.nextLine();
                    employes.add(new Employe(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche));
                    System.out.println("Employé ajouté !");
                    break;

                case 2:
                    System.out.print("Entrer le numéro d'employé recherché : ");
                    int numeroRecherche = scanner.nextInt();
                    boolean trouve = false;
                    for (Employe e : employes) {
                        if (e.getNumeroEmploye() == numeroRecherche) {
                            System.out.println("Employé trouvé : " + e);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 3:
                    System.out.print("Entrer le numéro d'employé à supprimer : ");
                    int numeroSuppression = scanner.nextInt();
                    Iterator<Employe> iterator = employes.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Employe e = iterator.next();
                        if (e.getNumeroEmploye() == numeroSuppression) {
                            iterator.remove();
                            System.out.println("Employé supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 4:
                    System.out.print("Entrer le numéro d'employé à modifier : ");
                    int numeroModification = scanner.nextInt();
                    boolean modifie = false;
                    for (ListIterator<Employe> li = employes.listIterator(); li.hasNext(); ) {
                        Employe e = li.next();
                        if (e.getNumeroEmploye() == numeroModification) {
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le nouveau nom : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Entrer la nouvelle adresse : ");
                            String nouvelleAdresse = scanner.nextLine();
                            System.out.print("Entrer le nouveau contact : ");
                            int nouveauContact = scanner.nextInt();
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer la nouvelle date d'embauche : ");
                            String nouvelleDateEmbauche = scanner.nextLine();
                            li.set(new Employe(e.getIdentifiant(), nouveauNom, nouvelleAdresse, nouveauContact, numeroModification, nouvelleDateEmbauche));
                            System.out.println("Employé modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 0:
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionPassagers() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Passagers :");
            System.out.println("1. Ajouter un passager");
            System.out.println("2. Rechercher un passager");
            System.out.println("3. Supprimer un passager");
            System.out.println("4. Modifier un passager");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrer l'identifiant : ");
                    int identifiant = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrer l'adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Entrer le contact : ");
                    int contact = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer le numéro de passeport : ");
                    String passeport = scanner.nextLine();
                    passagers.add(new Passager(identifiant, nom, adresse, contact, passeport));
                    System.out.println("Passager ajouté !");
                    break;

                case 2:
                    System.out.print("Entrer l'identifiant du passager recherché : ");
                    int idRecherche = scanner.nextInt();
                    boolean trouve = false;
                    for (Passager p : passagers) {
                        if (p.getIdentifiant() == idRecherche) {
                            System.out.println("Passager trouvé : " + p);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Identifiant du passager non trouvé !");
                    }
                    break;

                case 3:
                    System.out.print("Entrer l'identifiant du passager à supprimer : ");
                    int idSuppression = scanner.nextInt();
                    Iterator<Passager> iterator = passagers.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Passager p = iterator.next();
                        if (p.getIdentifiant() == idSuppression) {
                            iterator.remove();
                            System.out.println("Passager supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Identifiant du passager non trouvé !");
                    }
                    break;

                case 4:
                    System.out.print("Entrer l'identifiant du passager à modifier : ");
                    int idModification = scanner.nextInt();
                    boolean modifie = false;
                    for (ListIterator<Passager> li = passagers.listIterator(); li.hasNext(); ) {
                        Passager p = li.next();
                        if (p.getIdentifiant() == idModification) {
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le nouveau nom : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Entrer la nouvelle adresse : ");
                            String nouvelleAdresse = scanner.nextLine();
                            System.out.print("Entrer le nouveau contact : ");
                            int nouveauContact = scanner.nextInt();
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le nouveau numéro de passeport : ");
                            String nouveauPasseport = scanner.nextLine();
                            li.set(new Passager(idModification, nouveauNom, nouvelleAdresse, nouveauContact, nouveauPasseport));
                            System.out.println("Passager modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Identifiant du passager non trouvé !");
                    }
                    break;

                case 0:
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionAvions() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Avions :");
            System.out.println("1. Ajouter un avion");
            System.out.println("2. Rechercher un avion");
            System.out.println("3. Supprimer un avion");
            System.out.println("4. Modifier un avion");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrer l'immatriculation : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String immatriculation = scanner.nextLine();
                    System.out.print("Entrer le modèle de l'avion : ");
                    String modele = scanner.nextLine();
                    System.out.print("Entrer la capacité de l'avion : ");
                    int capacite = scanner.nextInt();
                    System.out.print("L'avion est-il disponible ? (true/false) : ");
                    boolean disponible = scanner.nextBoolean();
                    avions.add(new Avion(immatriculation, modele, capacite, disponible));
                    System.out.println("Avion ajouté !");
                    break;

                case 2:
                    System.out.print("Entrer l'immatriculation de l'avion recherché : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String immatriculationRecherche = scanner.nextLine();
                    boolean trouve = false;
                    for (Avion a : avions) {
                        if (a.getImmatriculation().equals(immatriculationRecherche)) {
                            System.out.println("Avion trouvé : " + a);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Immatriculation non trouvée !");
                    }
                    break;

                case 3:
                    System.out.print("Entrer l'immatriculation de l'avion à supprimer : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String immatriculationSuppression = scanner.nextLine();
                    Iterator<Avion> iterator = avions.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Avion a = iterator.next();
                        if (a.getImmatriculation().equals(immatriculationSuppression)) {
                            iterator.remove();
                            System.out.println("Avion supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Immatriculation non trouvée !");
                    }
                    break;

                case 4:
                    System.out.print("Entrer l'immatriculation de l'avion à modifier : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String immatriculationModification = scanner.nextLine();
                    boolean modifie = false;
                    for (ListIterator<Avion> li = avions.listIterator(); li.hasNext(); ) {
                        Avion a = li.next();
                        if (a.getImmatriculation().equals(immatriculationModification)) {
                            System.out.print("Entrer le nouveau modèle : ");
                            String nouveauModele = scanner.nextLine();
                            System.out.print("Entrer la nouvelle capacité : ");
                            int nouvelleCapacite = scanner.nextInt();
                            System.out.print("L'avion est-il disponible ? (true/false) : ");
                            boolean nouvelleDisponibilite = scanner.nextBoolean();
                            li.set(new Avion(immatriculationModification, nouveauModele, nouvelleCapacite, nouvelleDisponibilite));
                            System.out.println("Avion modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Immatriculation non trouvée !");
                    }
                    break;

                case 0:
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionReservations() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Réservations :");
            System.out.println("1. Ajouter une réservation");
            System.out.println("2. Rechercher une réservation");
            System.out.println("3. Supprimer une réservation");
            System.out.println("4. Modifier une réservation");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrer le numéro de réservation : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroReservation = scanner.nextLine();
                    System.out.print("Entrer la date de réservation (format YYYY-MM-DD) : ");
                    String dateReservation = scanner.nextLine();
                    System.out.println("Choisir le statut de la réservation :");
                    System.out.println("1. Confirmée");
                    System.out.println("2. Annulée");
                    System.out.println("3. En attente");
                    int choixStatut = scanner.nextInt();
                    Reservation.Statut statut;
                    switch (choixStatut) {
                        case 1 -> statut = Reservation.Statut.CONFIRMEE;
                        case 2 -> statut = Reservation.Statut.ANNULEE;
                        case 3 -> statut = Reservation.Statut.EN_ATTENTE;
                        default -> {
                            System.out.println("Statut invalide, par défaut 'En attente' sélectionné.");
                            statut = Reservation.Statut.EN_ATTENTE;
                        }
                    }
                    System.out.print("Entrer le numéro du vol associé : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroVol = scanner.nextLine();
                    Vol vol = new Vol(numeroVol); // Vous devrez remplacer cette ligne pour trouver un vol réel
                    System.out.print("Entrer l'identifiant du passager associé : ");
                    int identifiantPassager = scanner.nextInt();
                    Passager passager = new Passager(identifiantPassager, "Nom", "Adresse", 1234, "Passeport"); // Remplacer par une recherche
                    reservations.add(new Reservation(numeroReservation, dateReservation, statut, vol, passager));
                    System.out.println("Réservation ajoutée !");
                    break;

                case 2:
                    System.out.print("Entrer le numéro de réservation recherché : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroRecherche = scanner.nextLine();
                    boolean trouve = false;
                    for (Reservation r : reservations) {
                        if (r.getNumeroReservation().equals(numeroRecherche)) {
                            System.out.println("Réservation trouvée : " + r);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Numéro de réservation non trouvé !");
                    }
                    break;

                case 3:
                    System.out.print("Entrer le numéro de réservation à supprimer : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroSuppression = scanner.nextLine();
                    Iterator<Reservation> iterator = reservations.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Reservation r = iterator.next();
                        if (r.getNumeroReservation().equals(numeroSuppression)) {
                            iterator.remove();
                            System.out.println("Réservation supprimée !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Numéro de réservation non trouvé !");
                    }
                    break;

                case 4:
                    System.out.print("Entrer le numéro de réservation à modifier : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroModification = scanner.nextLine();
                    boolean modifie = false;
                    for (ListIterator<Reservation> li = reservations.listIterator(); li.hasNext(); ) {
                        Reservation r = li.next();
                        if (r.getNumeroReservation().equals(numeroModification)) {
                            System.out.print("Entrer la nouvelle date de réservation (format YYYY-MM-DD) : ");
                            String nouvelleDateReservation = scanner.nextLine();
                            System.out.println("Choisir le nouveau statut :");
                            System.out.println("1. Confirmée");
                            System.out.println("2. Annulée");
                            System.out.println("3. En attente");
                            int choixNouveauStatut = scanner.nextInt();
                            Reservation.Statut nouveauStatut;
                            switch (choixNouveauStatut) {
                                case 1 -> nouveauStatut = Reservation.Statut.CONFIRMEE;
                                case 2 -> nouveauStatut = Reservation.Statut.ANNULEE;
                                case 3 -> nouveauStatut = Reservation.Statut.EN_ATTENTE;
                                default -> {
                                    System.out.println("Statut invalide, par défaut 'En attente' sélectionné.");
                                    nouveauStatut = Reservation.Statut.EN_ATTENTE;
                                }
                            }
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le numéro du nouveau vol : ");
                            String nouveauNumeroVol = scanner.nextLine();
                            Vol nouveauVol = new Vol(nouveauNumeroVol); // Remplacer par une recherche
                            System.out.print("Entrer l'identifiant du nouveau passager : ");
                            int nouvelIdentifiantPassager = scanner.nextInt();
                            Passager nouveauPassager = new Passager(nouvelIdentifiantPassager, "Nom", "Adresse", 1234, "Passeport"); // Remplacer par une recherche
                            li.set(new Reservation(numeroModification, nouvelleDateReservation, nouveauStatut, nouveauVol, nouveauPassager));
                            System.out.println("Réservation modifiée !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Numéro de réservation non trouvé !");
                    }
                    break;

                case 0:
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionVols() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Vols :");
            System.out.println("1. Ajouter un vol");
            System.out.println("2. Rechercher un vol");
            System.out.println("3. Supprimer un vol");
            System.out.println("4. Modifier un vol");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1: // Ajouter un vol
                    System.out.print("Entrer le numéro du vol : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroVol = scanner.nextLine();
                    System.out.print("Entrer l'origine du vol : ");
                    String origine = scanner.nextLine();
                    System.out.print("Entrer la destination du vol : ");
                    String destination = scanner.nextLine();
                    System.out.print("Entrer la date et l'heure de départ (format YYYY-MM-DD HH:MM) : ");
                    String dateHeureDepart = scanner.nextLine();
                    System.out.print("Entrer la date et l'heure d'arrivée (format YYYY-MM-DD HH:MM) : ");
                    String dateHeureArrivee = scanner.nextLine();
                    vols.add(new Vol(numeroVol, origine, destination, dateHeureDepart, dateHeureArrivee));
                    System.out.println("Vol ajouté !");
                    break;

                case 2: // Rechercher un vol
                    System.out.print("Entrer le numéro du vol recherché : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroRecherche = scanner.nextLine();
                    boolean trouve = false;
                    for (Vol v : vols) {
                        if (v.getNumeroVol().equals(numeroRecherche)) {
                            System.out.println("Vol trouvé : " + v);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Numéro du vol non trouvé !");
                    }
                    break;

                case 3: // Supprimer un vol
                    System.out.print("Entrer le numéro du vol à supprimer : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroSuppression = scanner.nextLine();
                    Iterator<Vol> iterator = vols.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Vol v = iterator.next();
                        if (v.getNumeroVol().equals(numeroSuppression)) {
                            iterator.remove();
                            System.out.println("Vol supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Numéro du vol non trouvé !");
                    }
                    break;

                case 4: // Modifier un vol
                    System.out.print("Entrer le numéro du vol à modifier : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String numeroModification = scanner.nextLine();
                    boolean modifie = false;
                    for (ListIterator<Vol> li = vols.listIterator(); li.hasNext(); ) {
                        Vol v = li.next();
                        if (v.getNumeroVol().equals(numeroModification)) {
                            System.out.print("Entrer la nouvelle origine du vol : ");
                            String nouvelleOrigine = scanner.nextLine();
                            System.out.print("Entrer la nouvelle destination du vol : ");
                            String nouvelleDestination = scanner.nextLine();
                            System.out.print("Entrer la nouvelle date et heure de départ (format YYYY-MM-DD HH:MM) : ");
                            String nouvelleDateHeureDepart = scanner.nextLine();
                            System.out.print("Entrer la nouvelle date et heure d'arrivée (format YYYY-MM-DD HH:MM) : ");
                            String nouvelleDateHeureArrivee = scanner.nextLine();
                            li.set(new Vol(numeroModification, nouvelleOrigine, nouvelleDestination, nouvelleDateHeureDepart, nouvelleDateHeureArrivee));
                            System.out.println("Vol modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Numéro du vol non trouvé !");
                    }
                    break;

                case 0: // Quitter la gestion des vols
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionAeroports() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Aéroports :");
            System.out.println("1. Ajouter un aéroport");
            System.out.println("2. Rechercher un aéroport");
            System.out.println("3. Supprimer un aéroport");
            System.out.println("4. Modifier un aéroport");
            System.out.println("5. Lister les vols de départ d’un aéroport");
            System.out.println("6. Lister les vols d’arrivée d’un aéroport");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1: // Ajouter un aéroport
                    System.out.print("Entrer le nom de l'aéroport : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String nom = scanner.nextLine();
                    System.out.print("Entrer la ville de l'aéroport : ");
                    String ville = scanner.nextLine();
                    System.out.print("Entrer une description de l'aéroport : ");
                    String description = scanner.nextLine();
                    aeroports.add(new Aeroport(nom, ville, description));
                    System.out.println("Aéroport ajouté !");
                    break;

                case 2: // Rechercher un aéroport
                    System.out.print("Entrer le nom de l'aéroport recherché : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String nomRecherche = scanner.nextLine();
                    boolean trouve = false;
                    for (Aeroport a : aeroports) {
                        if (a.getNom().equalsIgnoreCase(nomRecherche)) {
                            System.out.println("Aéroport trouvé : " + a);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Nom de l'aéroport non trouvé !");
                    }
                    break;

                case 3: // Supprimer un aéroport
                    System.out.print("Entrer le nom de l'aéroport à supprimer : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String nomSuppression = scanner.nextLine();
                    Iterator<Aeroport> iterator = aeroports.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Aeroport a = iterator.next();
                        if (a.getNom().equalsIgnoreCase(nomSuppression)) {
                            iterator.remove();
                            System.out.println("Aéroport supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Nom de l'aéroport non trouvé !");
                    }
                    break;

                case 4: // Modifier un aéroport
                    System.out.print("Entrer le nom de l'aéroport à modifier : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String nomModification = scanner.nextLine();
                    boolean modifie = false;
                    for (ListIterator<Aeroport> li = aeroports.listIterator(); li.hasNext(); ) {
                        Aeroport a = li.next();
                        if (a.getNom().equalsIgnoreCase(nomModification)) {
                            System.out.print("Entrer le nouveau nom de l'aéroport : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Entrer la nouvelle ville de l'aéroport : ");
                            String nouvelleVille = scanner.nextLine();
                            System.out.print("Entrer une nouvelle description : ");
                            String nouvelleDescription = scanner.nextLine();
                            li.set(new Aeroport(nouveauNom, nouvelleVille, nouvelleDescription));
                            System.out.println("Aéroport modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Nom de l'aéroport non trouvé !");
                    }
                    break;

                case 5: // Lister les vols de départ
                    System.out.print("Entrer le nom de l'aéroport pour afficher les vols de départ : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String nomAeroportDepart = scanner.nextLine();
                    trouve = false;
                    for (Aeroport a : aeroports) {
                        if (a.getNom().equalsIgnoreCase(nomAeroportDepart)) {
                            System.out.println("Vols au départ de l'aéroport " + a.getNom() + " :");
                            a.listerVolsDepart();
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Nom de l'aéroport non trouvé !");
                    }
                    break;

                case 6: // Lister les vols d’arrivée
                    System.out.print("Entrer le nom de l'aéroport pour afficher les vols d’arrivée : ");
                    scanner.nextLine(); // Consomme la ligne restante
                    String nomAeroportArrivee = scanner.nextLine();
                    trouve = false;
                    for (Aeroport a : aeroports) {
                        if (a.getNom().equalsIgnoreCase(nomAeroportArrivee)) {
                            System.out.println("Vols à l'arrivée de l'aéroport " + a.getNom() + " :");
                            a.listerVolsArrivee();
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Nom de l'aéroport non trouvé !");
                    }
                    break;

                case 0: // Quitter la gestion des aéroports
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionPilotes() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion des Pilotes :");
            System.out.println("1. Ajouter un pilote");
            System.out.println("2. Rechercher un pilote");
            System.out.println("3. Supprimer un pilote");
            System.out.println("4. Modifier un pilote");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1: // Ajouter un pilote
                    System.out.print("Entrer l'identifiant : ");
                    int identifiant = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrer l'adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Entrer le contact : ");
                    int contact = scanner.nextInt();
                    System.out.print("Entrer le numéro d'employé : ");
                    int numeroEmploye = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer la date d'embauche : ");
                    String dateEmbauche = scanner.nextLine();
                    System.out.print("Entrer la licence : ");
                    String licence = scanner.nextLine();
                    System.out.print("Entrer les heures de vol : ");
                    int heuresDeVol = scanner.nextInt();
                    pilotes.add(new Pilote(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche, licence, heuresDeVol));
                    System.out.println("Pilote ajouté !");
                    break;

                case 2: // Rechercher un pilote
                    System.out.print("Entrer le numéro d'employé du pilote recherché : ");
                    int numeroRecherche = scanner.nextInt();
                    boolean trouve = false;
                    for (Pilote p : pilotes) {
                        if (p.getNumeroEmploye() == numeroRecherche) {
                            System.out.println("Pilote trouvé : " + p);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 3: // Supprimer un pilote
                    System.out.print("Entrer le numéro d'employé du pilote à supprimer : ");
                    int numeroSuppression = scanner.nextInt();
                    Iterator<Pilote> iterator = pilotes.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        Pilote p = iterator.next();
                        if (p.getNumeroEmploye() == numeroSuppression) {
                            iterator.remove();
                            System.out.println("Pilote supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 4: // Modifier un pilote
                    System.out.print("Entrer le numéro d'employé du pilote à modifier : ");
                    int numeroModification = scanner.nextInt();
                    boolean modifie = false;
                    for (ListIterator<Pilote> li = pilotes.listIterator(); li.hasNext(); ) {
                        Pilote p = li.next();
                        if (p.getNumeroEmploye() == numeroModification) {
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le nouveau nom : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Entrer la nouvelle adresse : ");
                            String nouvelleAdresse = scanner.nextLine();
                            System.out.print("Entrer le nouveau contact : ");
                            int nouveauContact = scanner.nextInt();
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer la nouvelle date d'embauche : ");
                            String nouvelleDateEmbauche = scanner.nextLine();
                            System.out.print("Entrer la nouvelle licence : ");
                            String nouvelleLicence = scanner.nextLine();
                            System.out.print("Entrer les nouvelles heures de vol : ");
                            int nouvellesHeuresDeVol = scanner.nextInt();
                            li.set(new Pilote(p.getIdentifiant(), nouveauNom, nouvelleAdresse, nouveauContact, numeroModification, nouvelleDateEmbauche, nouvelleLicence, nouvellesHeuresDeVol));
                            System.out.println("Pilote modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 0: // Quitter la gestion des pilotes
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

    private static void gestionPersonnelCabine() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nGestion du Personnel de Cabine :");
            System.out.println("1. Ajouter un membre du personnel de cabine");
            System.out.println("2. Rechercher un membre du personnel de cabine");
            System.out.println("3. Supprimer un membre du personnel de cabine");
            System.out.println("4. Modifier un membre du personnel de cabine");
            System.out.println("0. Retour au menu principal");
            System.out.print("Faites votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1: // Ajouter un membre du personnel de cabine
                    System.out.print("Entrer l'identifiant : ");
                    int identifiant = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrer l'adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Entrer le contact : ");
                    int contact = scanner.nextInt();
                    System.out.print("Entrer le numéro d'employé : ");
                    int numeroEmploye = scanner.nextInt();
                    scanner.nextLine(); // Consomme la ligne restante
                    System.out.print("Entrer la date d'embauche : ");
                    String dateEmbauche = scanner.nextLine();
                    System.out.print("Entrer la qualification : ");
                    String qualification = scanner.nextLine();
                    personnelCabine.add(new PersonnelCabine(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche, qualification));
                    System.out.println("Membre du personnel de cabine ajouté !");
                    break;

                case 2: // Rechercher un membre du personnel de cabine
                    System.out.print("Entrer le numéro d'employé du membre recherché : ");
                    int numeroRecherche = scanner.nextInt();
                    boolean trouve = false;
                    for (PersonnelCabine pc : personnelCabine) {
                        if (pc.getNumeroEmploye() == numeroRecherche) {
                            System.out.println("Membre du personnel de cabine trouvé : " + pc);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 3: // Supprimer un membre du personnel de cabine
                    System.out.print("Entrer le numéro d'employé du membre à supprimer : ");
                    int numeroSuppression = scanner.nextInt();
                    Iterator<PersonnelCabine> iterator = personnelCabine.iterator();
                    boolean supprime = false;
                    while (iterator.hasNext()) {
                        PersonnelCabine pc = iterator.next();
                        if (pc.getNumeroEmploye() == numeroSuppression) {
                            iterator.remove();
                            System.out.println("Membre du personnel de cabine supprimé !");
                            supprime = true;
                            break;
                        }
                    }
                    if (!supprime) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 4: // Modifier un membre du personnel de cabine
                    System.out.print("Entrer le numéro d'employé du membre à modifier : ");
                    int numeroModification = scanner.nextInt();
                    boolean modifie = false;
                    for (ListIterator<PersonnelCabine> li = personnelCabine.listIterator(); li.hasNext(); ) {
                        PersonnelCabine pc = li.next();
                        if (pc.getNumeroEmploye() == numeroModification) {
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer le nouveau nom : ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Entrer la nouvelle adresse : ");
                            String nouvelleAdresse = scanner.nextLine();
                            System.out.print("Entrer le nouveau contact : ");
                            int nouveauContact = scanner.nextInt();
                            scanner.nextLine(); // Consomme la ligne restante
                            System.out.print("Entrer la nouvelle date d'embauche : ");
                            String nouvelleDateEmbauche = scanner.nextLine();
                            System.out.print("Entrer la nouvelle qualification : ");
                            String nouvelleQualification = scanner.nextLine();
                            li.set(new PersonnelCabine(pc.getIdentifiant(), nouveauNom, nouvelleAdresse, nouveauContact, numeroModification, nouvelleDateEmbauche, nouvelleQualification));
                            System.out.println("Membre du personnel de cabine modifié !");
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Numéro d'employé non trouvé !");
                    }
                    break;

                case 0: // Quitter la gestion du personnel de cabine
                    System.out.println("Retour au menu principal.");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }
        } while (choix != 0);
    }

}
