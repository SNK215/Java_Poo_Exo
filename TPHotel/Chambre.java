package org.example.poo.TPHotel;

public class Chambre {
    protected static int count = 1;

    protected int id;
    protected boolean statut;
    protected double tarif;
    protected int capacite;

    public Chambre(boolean statut, double tarif, int capacite) {
        this.statut = statut;
        this.tarif = tarif;
        this.capacite = capacite;
        this.id = count++;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
