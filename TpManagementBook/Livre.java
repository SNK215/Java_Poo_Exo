package org.example.poo.TpManagementBook;

public class Livre {
    protected int id;
    protected String nom;
    protected Auteur[] auteurs;
    protected Editeur editeur;
    protected int anneePublication;
    protected int nbPage;
    protected double prix;
    protected CoverType coverType;

    public Livre(int id, String nom, Auteur[] auteurs, Editeur editeur, int anneePublication, int nbPage, double prix, CoverType coverType) {
        this.id = id;
        this.nom = nom;
        this.auteurs = auteurs;
        this.editeur = editeur;
        this.anneePublication = anneePublication;
        this.nbPage = nbPage;
        this.prix = prix;
        this.coverType = coverType;
    }
    @Override
    public String toString(){
        return "Je suis le livre "+nom+" écrit par "+auteurs+" et publié par "+editeur+". J'ai "+nbPage+" pages, j'ai une couverture de type "+coverType+" et je suis vendu à "+prix+"€";
    }
}

