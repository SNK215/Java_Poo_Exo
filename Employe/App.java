package org.example.poo.Employe;

public class App {
    public static void main(String[] args) {
        Employe employe = new Employe("John",42,1500);
        Technicien technicien = new Technicien("Melvin",38,1700,2);
        employe.display();
        technicien.display();
        employe.augmentation(250);
        technicien.prime();
        employe.display();
        technicien.display();
    }
}
