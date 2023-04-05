package org.example.poo.Employe;

public class Employe {
    protected String nom;
    protected int age;
    protected int salaire;

    public Employe(String nom, int age, int salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }
    public void augmentation(int montant){
        this.salaire += montant;
    };
    public void display(){
        System.out.println("Je suis " + nom + ", j'ai " + age + " ans, et j'ai un salaire mensuel de " + salaire + "€");
    };
    public void calculeSalaire(){};

}
