package fr.isep.algo;
import fr.isep.algo.Personne;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Créer une instance de la classe Employer
        Employer personne = new Employer("Jean", "Dupont", "jdupont@exemple.com");

        Scanner scanner = new Scanner(System.in);
        int nombreChoix = -1;

        // Boucle principale pour le menu
        do {
            // Affichage du menu
            System.out.println("---------MENU PRINCIPALE---------");
            System.out.println("Cliquer un nombre pour les différentes fonctionnalités du projet");
            System.out.println("1 : Gestion des personnes");
            System.out.println("2 : Gestion des réservations");
            System.out.println("3 : Gestion des vols");
            System.out.println("4 : Gestion des avions");
            System.out.println("5 : Lire le fichier Vols.txt");  // Option ajoutée pour lire le fichier
            System.out.println("0 : Quitter");

            System.out.print("Entrez votre choix : ");
            nombreChoix = scanner.nextInt();

            switch (nombreChoix) {
                case 1:
                    // Afficher les informations de la personne
                    System.out.println("Choix 1 : Gestion des personnes");
                    System.out.println(personne);
                    
                    break;
                case 2:
                    System.out.println("Choix 2 : Gestion des réservations");
                    break;
                case 3:
                    System.out.println("Choix 3 : Gestion des vols");
                    break;
                case 4:
                    System.out.println("Choix 4 : Gestion des avions");
                    break;
                case 5:
                    // Lire le fichier Vols.txt
                    String pathFile = "C:/Users/naval/Downloads/Test/11042025Suite_Projet/Vols.txt";
                    lireFichier(pathFile);
                    break;
                case 0:
                    System.out.println("Quitter le programme...");
                    break;
                default:
                    System.out.println("Choix invalide, essayez encore !");
                    break;
            }
        } while (nombreChoix != 0);

        // Fermer le scanner à la fin
        scanner.close();
    }

    // Méthode pour lire un fichier et afficher son contenu
    public static void lireFichier(String pathFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    // Classe Employer pour représenter un employé
    public static class Employer {
        private String prenom;
        private String nom;
        private String email;

        // Constructeur de la classe Employer
        public Employer(String prenom, String nom, String email) {
            this.prenom = prenom;
            this.nom = nom;
            this.email = email;
        }

        // Getters et Setters
        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email;
        }
    }
}
