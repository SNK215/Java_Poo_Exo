package org.example.poo.TpManagementBook;

import java.awt.print.Book;
import java.util.Arrays;

public class BookService {
    public void filterBooksByAuthor(Auteur auteur, Livre[] livres){
        System.out.println("Livres écrits par " + auteur.prenom + " " + auteur.nom + " :");
        for (Livre l:
             livres) {
            if (Arrays.asList(l.auteurs).contains(auteur)){
                System.out.println(l.nom);
            }
        }
    }
    public void filterBooksByPublisher(Editeur editeur,Livre[] livres){
        System.out.println("Livres publiés par " + editeur.nom + " :");
        for (Livre l:
                livres) {
            if (Arrays.asList(l.editeur).contains(editeur)){
                System.out.println(l.nom);
            }
        }
    }
    public void filterBooksAfterSpecifiedYear(int yearFromInclusively, Livre[] livres){
        System.out.println("Livres publiés après "+yearFromInclusively);
        for (Livre l:
                livres) {
            if (l.anneePublication >= yearFromInclusively){
                System.out.println(l.nom);
            }
        }
    }
}
