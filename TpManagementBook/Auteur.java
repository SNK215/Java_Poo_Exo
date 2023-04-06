package org.example.poo.TpManagementBook;

public class Auteur {
    protected int id;
    protected String prenom;
    protected String nom;

    public Auteur(int id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }
    @Override
    public String toString(){
        return "Je suis l'auteur "+prenom+" "+nom;
    }
}
