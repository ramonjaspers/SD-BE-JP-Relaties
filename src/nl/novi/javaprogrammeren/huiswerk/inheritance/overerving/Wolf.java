package nl.novi.javaprogrammeren.huiswerk.inheritance.overerving;

/**
 * Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
 * herkomst op. Ook willen we de naam van de roedel weten.
 */
public class Wolf extends Animal {
    String cage;
    String lastDayFed;
    String landOfOrigin;
    String pack;
    public Wolf() {
    }

    @Override
    public void makeSound(){
        System.out.println("WOOOOF");
    }
}
