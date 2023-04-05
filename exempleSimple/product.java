package org.example.poo.exempleSimple;

public class product {
    protected int id;
    protected String name;

    public product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void quiSuisJe(){
        System.out.println("Je suis un product");
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
