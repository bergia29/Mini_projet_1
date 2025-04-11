package fr.isep.algo;

import java.util.*;

class Personne {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int contact;

    public Personne(int identifiant, String nom, String adresse, int contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    // Getters
    public int getIdentifiant(){
        return identifiant;
    }

    public String getNom(){
        return nom;
    }

    public String getAdresse(){
        return adresse;
    }

    public int getContact(){
        return contact;
    }

    // Setters
    public void setIdentifiant(int identifiant){
        this.identifiant = identifiant;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public void setContact(int contact){
        this.contact = contact;
    }

    @Override
    public String toString(){
        return identifiant + " " + nom + " " + adresse + " " + contact;
    }

    // Méthode
    public void obtenirInfos() {
        System.out.println("Informations sur la personne:");
        System.out.println("Identifiant: " + identifiant);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Contact: " + contact);
    }
}
