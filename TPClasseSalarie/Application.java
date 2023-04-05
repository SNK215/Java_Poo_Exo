package org.example.poo.TPClasseSalarie;

public class Application {
    protected Salarie[] salaries;

    public Application(Salarie[] salaries) {
        this.salaries = salaries;
    }
    
    public void main(){
        int total = 0;
        for (Salarie salarie:
             salaries) {
            total += salarie.salaire;
        }
        System.out.println("Le montant total des salaires mensuels est de " + total + "€");
    }


}
