package org.example.poo.TPClasseSalarie;

public class Salarie {
    public int matricule;
    public String categorie;
    public String service;
    public String nom;
    public int salaire;
    static int compteur;

    public Salarie(int matricule, String categorie, String service, String nom, int salaire) {
        this.matricule = matricule;
        this.categorie = categorie;
        this.service = service;
        this.nom = nom;
        this.salaire = salaire;
        compteur++;
    }
    public void afficherSalaire(){
        System.out.println("Le salaire de " + nom + " est de " + salaire + "€");
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
