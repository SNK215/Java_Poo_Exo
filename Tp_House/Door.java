package org.example.poo.Tp_House;

public class Door {
    private String color;

    public Door() {
        color = "bleu";
    }
    public void display(){
        System.out.println("Je suis une porte, ma couleur est " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
