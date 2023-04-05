package org.example.poo.Tp3_exo1;

public class Teacher extends Person {
    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    public String subject;

    public void explains(){
        System.out.println("Explanation begins");
    }
}
