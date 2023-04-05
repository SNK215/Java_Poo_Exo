package org.example.poo.TpClassHeritageInterface;

public class Commercial extends Salarie{
    protected int chiffreAffaire;
    protected int commission;
    protected int distanceParcourue;

    public Commercial(String nom, int matricule, String categorie, String service, int salaire, int chiffreAffaire, int commission) {
        super(nom, matricule, categorie, service, salaire);
        this.chiffreAffaire = chiffreAffaire;
        this.commission = commission;
        this.distanceParcourue = 0;
    }
    @Override
    public void calculerSalaire(){
        System.out.println("Le salaire de " + nom + " avec commission est de : " + (salaire+commission) + "€");
    }
    public void seDeplacer(){
        this.distanceParcourue += 1000;
    }

    public int getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(int chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }
}
