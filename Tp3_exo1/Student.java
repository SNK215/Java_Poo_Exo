package org.example.poo.Tp3_exo1;

public class Student extends Person {
    public Student(int age) {
        super(age);
    }

    public void goingToClass(){
        System.out.println("Im going to class");
    }
    public void displayAge(){
        System.out.println("My age is : " + age + " years old");
    }
}
