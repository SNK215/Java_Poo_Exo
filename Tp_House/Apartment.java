package org.example.poo.Tp_House;

public class Apartment extends House{

    public Apartment() {
        super(50);
    }
    @Override
    public void display(){
        System.out.println("Je suis un appartement, ma surface est " + this.surface + "m²");
    }
}
