package fr.isep.algo;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class Personne {
    protected int Identifiant;
    protected String Nom;
    protected String Adresse;
    protected int Contact;

    public Personne(int Identifiant, String Nom, String Adresse, int Contact) {
        this.Identifiant = Identifiant;
        this.Nom = Nom;
        this.Adresse = Adresse;
        this.Contact = Contact;
    }

    public int getIdentifiant(){
        return Identifiant;
    }
    public String toString(){
        return Identifiant+" "+Nom+" "+Adresse+" "+Contact;
    }

    public void obtenirInfos() {
        System.out.println("Id :" + Identifiant + "Nom :" + Nom + "Adresse :" + Adresse + "Contact :" + Contact);
    }

    class CRUDDemo {
        public static void main(String[] args) {
            Collection<Personne> collection = new ArrayList<Personne>();
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner (System.in);
            int choix;
            do {
                System.out.println("1.ADD");
                System.out.println("2.UPDATE");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("Faites votre choix :");
                choix = s1.nextInt();

                switch(choix) {
                    case 1:
                        System.out.println("Entrer l'identifiant :");
                        int Identifiant = s1.nextInt();
                        System.out.println("Entrer le nom :");
                        String Nom = s2.nextLine();
                        System.out.println("Entrer l'adresse :");
                        String Adresse = s2.nextLine();
                        System.out.println("Entrer le contact :");
                        int Contact = s1.nextInt();
                        collection.add(new Personne(Identifiant, Nom, Adresse, Contact));
                        break;
                    case 2:
                        System.out.println(collection);
                        break;
                    case 3:
                        Iterator<Personne> i = collection.iterator();
                        boolean found = false;
                        System.out.println("Entrer l'identifiant recherché :");
                        int Id = s1.nextInt();
                        System.out.println("----------------------------------");
                        i = collection.iterator();
                        while(i.hasNext()){
                            Personne p = i.next();
                            if(p.getIdentifiant() == Id)  {
                                System.out.println(p);
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Record Not Found");
                        }
                        System.out.println("----------------------------------");
                        break;
                    case 4:
                        break;
                }
            } while (choix != 0);
        }
    }
}