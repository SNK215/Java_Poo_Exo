package org.example.poo.TpClassHeritageInterface;

import java.util.Objects;
import java.util.Scanner;

public class App {

    static Salarie[] salaries;
    static void ajouterEmploye(){
        int choix = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Ajouter un employé ===");
        System.out.println("1-- Salarie");
        System.out.println("2-- Commercial");
        System.out.println("3-- Manager");
        choix = sc.nextInt();

        System.out.println("Entrez un nom :");
        String nom = sc.next();
        System.out.println("Entrez un matricule :");
        int matricule = sc.nextInt();
        System.out.println("Entrez une catégorie :");
        String categorie = sc.next();
        System.out.println("Entrez un service :");
        String service = sc.next();
        System.out.println("Entrez le salaire mensuel :");
        int salaire = sc.nextInt();

        if (choix == 1){
            Salarie nouveauSalarie = new Salarie(nom,matricule,categorie,service,salaire);
        } else if (choix == 2){
            System.out.println("Entrez le chiffre d'affaire");
            int chiffreAffaire = sc.nextInt();
            System.out.println("Entrez la commisssion");
            int commission = sc.nextInt();
            Commercial nouveauCommercial = new Commercial(nom,matricule,categorie,service,salaire,chiffreAffaire,commission);

        } else if (choix == 3) {
            Manager nouveauManager = new Manager(nom,matricule,categorie,service,salaire);
        }
    };
    static void afficherSalaires(){
        System.out.println("=== Afficher les salaires des employés ===");
        for (Salarie salarie:
             salaries) {
            salarie.afficherSalaire();
        }
        System.out.println("\n");
    };
    static void rechercherEmploye(){
        System.out.println("=== Rechercher un employé par prénom ===");
        System.out.println("Entrez le prénom de l'employé (sans fautes)");
        Scanner sc = new Scanner(System.in);
        String nomRecherche = sc.next();
        for (Salarie salarie:
             salaries) {
            String nomCompare = salarie.nom.substring(0, salarie.nom.indexOf(' '));
            if (Objects.equals(nomRecherche,nomCompare)){
                salarie.afficherSalaire();
            }
        }
        System.out.println("\n");
    };
    public static void main(String[] args) {
        int choix;
        boolean boucle = true;
        Salarie salarie1 = new Salarie("John Doe",157,"C002", "S002", 1300);
        Salarie salarie2 = new Salarie("Richard James",158,"C002", "S004", 1200);
        Salarie salarie3 = new Salarie("Christopher Nolan",159,"C002", "S005", 1400);
        Commercial commercial1 = new Commercial("Thomas Bangalter",160,"C106","S248",1500,2500,150);
        Commercial commercial2 = new Commercial("Jean Michel Jarre",161,"C106","S259",1500,2500,150);
        Commercial commercial3 = new Commercial("Miles Davis",162,"C106","S224",1760,2000,250);
        salaries = new Salarie[]{salarie1, salarie2, salarie3, commercial1, commercial2, commercial3};

        while (boucle) {
            choix = 0;
            System.out.println("=== Gestion des employés == ");
            System.out.println("1-- Ajouter un employé");
            System.out.println("2-- Afficher le salaire des employés");
            System.out.println("3-- Rechercher un employé par nom");
            System.out.println("0-- Quitter\n");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            if (choix == 0) {
                boucle = false;
            } else if (choix == 1){
                ajouterEmploye();
            } else if (choix == 2) {
                afficherSalaires();
            } else if (choix == 3) {
                rechercherEmploye();
            } else if (choix < 0 || choix > 3) {
                System.out.println("Veuillez entrer un choix correct\n");
            };
        }


    }
}
