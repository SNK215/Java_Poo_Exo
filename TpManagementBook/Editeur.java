package org.example.poo.TpManagementBook;

public class Editeur {
    protected int id;
    protected String nom;

    public Editeur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    @Override
    public String toString(){
        return "Je suis l'éditeur "+nom;
    }
}
