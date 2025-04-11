package fr.isep.algo;
import fr.isep.algo.Personne;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
            System.out.println("6 : Ecrire dans un fichier");
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
                case 6:
                    String pathFile1 = "C:/Users/naval/Downloads/Test/11042025Suite_Projet/Vols.txt";
                    ecrireFichier(pathFile1);
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

    public static void ecrireFichier(String pathFile1) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile1, true))) { // `true` pour ajouter à la fin du fichier
            writer.write("Ceci est un exemple de texte ajouté au fichier.");
            writer.newLine();  
            writer.write("Une autre ligne de texte.");
            writer.newLine();  
            System.out.println("Le texte a été écrit dans le fichier avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
    
}


