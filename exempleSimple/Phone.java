package org.example.poo.exempleSimple;

public class Phone extends product{
    int price;

    public Phone(int id, String name, int price) {
        super(id, name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void quiSuisJe(){
        super.quiSuisJe();
        System.out.println("Je suis un phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
