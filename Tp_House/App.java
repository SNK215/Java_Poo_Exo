package org.example.poo.Tp_House;

public class App {
    public static void main(String[] args)
    {
        Apartment apartment = new Apartment();
        Person person = new Person("John",apartment);
        person.display();

    }
}
