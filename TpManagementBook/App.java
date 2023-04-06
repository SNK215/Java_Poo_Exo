package org.example.poo.TpManagementBook;

public class App {
    public static void main(String[] args) {
        Auteur[] auteur1 = {new Auteur(1, "Frank", "Herbert")};
        Auteur[] auteur2 = {new Auteur(2, "Philip K.", "Dick")};
        Auteur[] auteur3 = {new Auteur(3, "Charles-Louis", "Hanon")};
        Editeur editeur1 = new Editeur(1,"editeur1");
        Editeur editeur2 = new Editeur(2,"2");


        Livre[] livres = new Livre[] {
                new Livre(1,"Dune",auteur1,editeur1,1965,500,14.99,CoverType.RELIE),
                new Livre(2,"Le Messie de Dune",auteur1,editeur1,1969,350,12.99,CoverType.RELIE),
                new Livre(3,"L'Homme dans le Haut-Chateau",auteur2,editeur1,1962,700,13.99,CoverType.RELIE),
                new Livre(4,"Le pianiste virtuose",auteur3,editeur2,1873,50,10.99,CoverType.BROCHE),
        };
        BookService bookService = new BookService();
        bookService.filterBooksByAuthor(auteur1[0],livres);
        System.out.println("-----------");
        bookService.filterBooksByPublisher(editeur1,livres);
        System.out.println("-----------");
        bookService.filterBooksAfterSpecifiedYear(1965,livres);
    }
}
