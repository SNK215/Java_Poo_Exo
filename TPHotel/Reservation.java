package org.example.poo.TPHotel;

public class Reservation {
    protected static int count = 1;
    protected int id;
    protected boolean statut = true;
    protected Client client;
    protected Chambre chambre;

    public Reservation(Client client, Chambre chambre) {
        this.client = client;
        this.chambre = chambre;
        this.id = count++;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}
