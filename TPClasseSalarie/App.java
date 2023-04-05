package org.example.poo.TPClasseSalarie;

public class App {
    public static void main(String[] args){
        Salarie salarie1 = new Salarie(1250,"technicien","SAV","John", 1700);
        Salarie salarie2 = new Salarie(1251,"technicien","SAV","Sandra", 1700);
        Salarie salarie3 = new Salarie(1252,"PDG","Direction","Michael", 2500);
        Salarie[] tab = {salarie1,salarie2,salarie3};
        Application application = new Application(tab);
        System.out.println("Le nombre de salarié est de : " + Salarie.compteur);
        application.main();

    }

}
