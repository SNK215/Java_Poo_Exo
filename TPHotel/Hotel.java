package org.example.poo.TPHotel;

import java.util.ArrayList;

public class Hotel {
    protected String nom;
    protected ArrayList<Chambre> chambres;
    protected ArrayList<Reservation> reservations;
    protected ArrayList<Client> clients;

    public Hotel(String nom, ArrayList<Chambre> chambres, ArrayList<Reservation> reservations, ArrayList<Client> clients) {
        this.nom = nom;
        this.chambres = chambres;
        this.reservations = reservations;
        this.clients = clients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
