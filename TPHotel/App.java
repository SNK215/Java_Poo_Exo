package org.example.poo.TPHotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void ajouterClient(ArrayList<Client> clients){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le prénom du client :");
        String prenom = scan.next();
        System.out.println("Entrez le nom du client :");
        String nom = scan.next();
        System.out.println("Entrez le numéro de téléphone du client :");
        String telephone = scan.next();
        Client client = new Client(nom,prenom,telephone);
        clients.add(client);
        System.out.println("Client ajouté !");
    }
    public static void afficherClients(ArrayList<Client> clients){
        if (clients.isEmpty()){
            System.out.println("Aucun clients enregistrés");
        }
        for (Client c:
             clients) {
            System.out.println("Client "+c.id+" : "+c.prenom+" "+c.nom+" , "+c.telephone);
        }
    }

    public static void afficherReservationClient(ArrayList<Client> clients,ArrayList<Reservation> reservations){
        String statut = "";
        Scanner scan = new Scanner(System.in);
        Client clientConcerne = null;
        System.out.println("Entrez l'ID du client :");
        for (Client c:
             clients) {
            System.out.println(c.id+"- "+c.prenom+" "+c.nom);
        }
        int id = scan.nextInt();
        for (Client c:
             clients) {
            if (c.id == id){
                clientConcerne = c;
            }
        }
        if (clientConcerne != null){
            for (Reservation r:
                 reservations) {
                if (r.client == clientConcerne){
                    if (!r.statut){
                        statut = "annulée";
                    }
                    System.out.println("Réservation n°"+r.id+"- "+r.client.prenom+" "+r.client.nom+" - Chambre n°"+r.chambre.id+" - "+r.chambre.capacite+" personnes - "+statut);

                }
            }
        } else {
            System.out.println("Aucun client trouvé");
        }
    }

    public static void ajouterReservation(ArrayList<Reservation> reservations,ArrayList<Client> clients,ArrayList<Chambre> chambres){
        Scanner scan = new Scanner(System.in);

        //On récupère le client pour la réservation
        Client clientConcerne = null;
        System.out.println("Quel est l'ID du client souhaitant faire la réservation ?");
        for (Client c:
             clients) {
            System.out.println(c.id+"- "+c.prenom+" "+c.nom);
        }
        int choix = scan.nextInt();
        for (Client c:
                clients) {
            if (c.id == choix){
                clientConcerne = c;
            }
        }
        if (clientConcerne == null){
            System.out.println("Aucun client trouvé");
        };

        //On vérifie la disponibilité
        System.out.println("Pour combien de personnes ?");
        int nbPersonnes = scan.nextInt();

        //On récupère la chambre pour la réservation
        Chambre chambreConcerne = null;
        System.out.println("Quel est l'ID de la chambre à réserver ?");
        for (Chambre c:
             chambres) {
            if (c.statut && c.capacite >= nbPersonnes){
                System.out.println("Chambre "+c.id+" - "+c.capacite+" personnes, "+c.tarif+"€/nuit");
            }
        }
        int choix2 = scan.nextInt();
        for (Chambre c:
                chambres) {
            if ((c.id == choix2) && (c.capacite >= nbPersonnes)){
                chambreConcerne = c;
            }
        }
        if (chambreConcerne == null){
            System.out.println("Aucune chambre trouvée");
        } else {
            Reservation reservation = new Reservation(clientConcerne,chambreConcerne);
            reservations.add(reservation);
            chambreConcerne.statut = false;
            System.out.println("Réservation effectuée !");
        }
    }

    public static void annulerReservation(ArrayList<Reservation> reservations,ArrayList<Chambre> chambres){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez l'ID de la réservation :");
        for (Reservation r:
             reservations) {
            if (r.statut){
                System.out.println("Réservation n°"+r.id+"- "+r.client.prenom+" "+r.client.nom+" - Chambre n°"+r.chambre.id+" - "+r.chambre.capacite+" personnes");
            }
        }
        int choix = scan.nextInt();
        for (Reservation r:
             reservations) {
            if (r.id == choix){
                r.statut = false;
                r.chambre.statut = true;
                System.out.println("Réservation n°"+r.id+" annulée !");
            }
        }
    }

    public static void afficherReservations(ArrayList<Reservation> reservations){
        String statut = "";
        if (reservations.isEmpty()){
            System.out.println("Aucune réservations enregistrées");
        }
        for (Reservation r:
             reservations) {
            if (!r.statut){
                statut = "annulée";
            }
            System.out.println("Réservation n°"+r.id+"- "+r.client.prenom+" "+r.client.nom+" - Chambre n°"+r.chambre.id+" - "+r.chambre.capacite+" personnes - "+statut);
        }
    }

    public static void main(String[] args) {
        boolean boucle = true;
        ArrayList<Client> tabClients = new ArrayList<Client>();
        ArrayList<Reservation> tabReservations = new ArrayList<Reservation>();
        ArrayList<Chambre> tabChambres = new ArrayList<Chambre>();

        tabChambres.add(new Chambre(true,44.99,2));
        tabChambres.add(new Chambre(true,44.99,2));
        tabChambres.add(new Chambre(true,44.99,2));
        tabChambres.add(new Chambre(true,44.99,2));
        tabChambres.add(new Chambre(true,44.99,2));
        tabChambres.add(new Chambre(true,60.99,4));
        tabChambres.add(new Chambre(true,60.99,4));
        tabChambres.add(new Chambre(true,60.99,4));
        tabChambres.add(new Chambre(true,60.99,4));
        tabChambres.add(new Chambre(true,60.99,4));

        System.out.println("Entrez le nom de l'hôtel (pas d'espaces):");
        Scanner scan = new Scanner(System.in);
        String nomHotel = scan.next();
        Hotel hotel = new Hotel(nomHotel,tabChambres,tabReservations,tabClients);

        while (boucle){
            System.out.println("1- Ajouter un client");
            System.out.println("2- Afficher la liste des clients");
            System.out.println("3- Afficher les réservations d'un client");
            System.out.println("4- Ajouter une réservation");
            System.out.println("5- Annuler une réservation");
            System.out.println("6- Afficher la liste des réservations");
            System.out.println("0- Quitter");
            System.out.println("Veuillez faire un choix");
            int choix = scan.nextInt();

            switch (choix){
                case 0:
                    boucle = false;
                    break;
                case 1:
                    ajouterClient(tabClients);
                    break;
                case 2:
                    afficherClients(tabClients);
                    break;
                case 3:
                    afficherReservationClient(tabClients,tabReservations);
                    break;
                case 4:
                    ajouterReservation(tabReservations,tabClients,tabChambres);
                    break;
                case 5:
                    annulerReservation(tabReservations,tabChambres);
                    break;
                case 6:
                    afficherReservations(tabReservations);
                    break;
                default:
                    System.out.println("Veuillez entrer un choix correct");
                    break;
            }
        }
    }
}
