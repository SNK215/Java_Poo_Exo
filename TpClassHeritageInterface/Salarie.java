package org.example.poo.TpClassHeritageInterface;

public class Salarie {
    private static int compteur = 0;
    public String nom;
    protected int matricule;
    protected String categorie;
    protected String service;
    protected int salaire;

    public Salarie(String nom, int matricule, String categorie, String service, int salaire) {
        this.nom = nom;
        this.matricule = matricule;
        this.categorie = categorie;
        this.service = service;
        this.salaire = salaire;
        compteur++;
    }
    public void afficherSalaire(){
        System.out.println("Le salaire de " + nom + " est de " + salaire + "€");
    }
    public void calculerSalaire(){};

    static int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
