package fr.isep.algo;

class Aeroport {
    private String Nom, Ville, Description;

    public Aeroport(String Nom, String Ville, String Description) {
        this.Nom = Nom;
        this.Ville = Ville;
        this.Description = Description;
    }

    public void affecterVol(Vol vol) {
        System.out.println("Vol " + vol + " affecté à l'aéroport " + Nom);
    }
}
