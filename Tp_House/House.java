package org.example.poo.Tp_House;

public class House {
    protected int surface;
    protected Door door;

    public House(int surface) {
        door = new Door();
        this.surface = surface;
    }
    public void display(){
        System.out.println("Je suis une maison, ma surface est " + surface + "m²");
    }

    public int getSurface(){
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
    public Door getDoor(){
        return door;
    }

}
