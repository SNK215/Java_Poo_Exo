package org.example.poo.TpClassHeritageInterface;

public class Manager extends Salarie{
    protected int distanceParcourue;

    public Manager(String nom, int matricule, String categorie, String service, int salaire) {
        super(nom, matricule, categorie, service, salaire);
        this.distanceParcourue += 1000;
    }
}
