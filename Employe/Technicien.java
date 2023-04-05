package org.example.poo.Employe;

public class Technicien extends Employe{
    protected int grade;

    public Technicien(String nom, int age, int salaire, int grade) {
        super(nom, age, salaire);
        this.grade = grade;
    }
    public void prime(){
        if (grade == 1){
            augmentation(100);
        } else if (grade == 2) {
            augmentation(200);
        } else if (grade == 3) {
            augmentation(300);
        }
    }
}
