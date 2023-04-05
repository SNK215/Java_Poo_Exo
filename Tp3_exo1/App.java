package org.example.poo.Tp3_exo1;

import org.example.polyInterface.Demo;
import org.example.poo.Tp3_exo1.Person;
import org.example.poo.Tp3_exo1.Student;
import org.example.poo.Tp3_exo1.Teacher;

public class App {
    public static void main( String[] args )
    {
        Person p = new Person(0);
        p.sayHello();
        Student s = new Student(0);
        s.setAge(15);
        s.sayHello();
        s.goingToClass();
        Teacher t = new Teacher(0, "Math");
        t.sayHello();
        t.setAge(40);
        t.explains();
    }
}
