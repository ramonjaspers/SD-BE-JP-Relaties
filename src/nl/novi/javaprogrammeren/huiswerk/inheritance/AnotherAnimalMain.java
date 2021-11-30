package nl.novi.javaprogrammeren.huiswerk.inheritance;

import nl.novi.javaprogrammeren.huiswerk.inheritance.overerving.Cat;
import nl.novi.javaprogrammeren.huiswerk.inheritance.overerving.CatType;
import nl.novi.javaprogrammeren.huiswerk.inheritance.overerving.Gender;
import nl.novi.javaprogrammeren.huiswerk.inheritance.overerving.Lion;

public class AnotherAnimalMain {
    public static void main(String[] args) {
        Lion lionHenry = new Lion();
        lionHenry.setName("Henry");
        lionHenry.setGender(Gender.Female);
        lionHenry.setFood("Filet mignon");;
        lionHenry.makeSound();
        lionHenry.sleep();
        lionHenry.move();
        lionHenry.eat();

        Cat catPeter = new Cat();
        catPeter.setName("peter");
        catPeter.setGender(Gender.Male);
        catPeter.setFood("Salmon");
        catPeter.makeSound();
        catPeter.sleep();
        catPeter.move();
        catPeter.eat();
    }
// LET OP: het eerste gedeelte is hetzelfde als de klassikale opdracht.

    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    X Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een huisdier beweegt print je in
    de console dat deze 0.25 is verplaatst. Bij alle andere dieren is dat 0.50.

    X Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    X Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    X Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    X Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */

    /*
    UITBREIDING
    Maak nu ook de subklassen en override of super de methodes waar jij denkt dat je het nodig acht.
    Zorg ervoor dat de Animal-klasse niet geinstantieerd kan worden.

    Er zijn hier meerdere oplossingen mogelijk. Bijna allemaal zijn ze goed, zolang je jouw oplossing maar kan
    beargumenteren.
     */
}
