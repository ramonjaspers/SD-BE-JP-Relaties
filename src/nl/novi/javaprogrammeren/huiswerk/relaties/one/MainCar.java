package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {
        // Construct cars
        Car bimmer = new Car("69-420-GG", "BMW", "E30", 352343);
        Car volvo = new Car("11-123-22", "Volvo", "adsf", 123123);
        // Construct owners
        CarOwner fastBimmerBoi = new CarOwner("Giorgi Tevzadze", 26);
        CarOwner jongeSjonnie = new CarOwner("Sjonnie Johnny", 16);
        // Construct dealer
        CarDealer bruinBarrelDealer = new CarDealer("Bruin Barrel en CO");

        // Add cars to dealer
        bruinBarrelDealer.addCar(bimmer);
        bruinBarrelDealer.addCar(volvo);

        // Show in log that no cars are owned
        System.out.println(bruinBarrelDealer.getName() + " has " + bruinBarrelDealer.getCars().size() + " cars");
        System.out.println(fastBimmerBoi.getName() + " has " + fastBimmerBoi.getCars().size() + " cars");

        // Try to sell the cars to persons
        bruinBarrelDealer.setNewCarOwner(bimmer, fastBimmerBoi);
        bruinBarrelDealer.setNewCarOwner(volvo, jongeSjonnie);

        System.out.println(bruinBarrelDealer.getName() + " has " + bruinBarrelDealer.getCars().size() + " cars");
        System.out.println(fastBimmerBoi.getName() + " has " + fastBimmerBoi.getCars().size() + " cars");
        System.out.println(jongeSjonnie.getName() + " has " + jongeSjonnie.getCars().size() + " cars");
        System.out.println(bimmer.getSubType() + " " + bimmer.getNumberPlate() + " Owner " + bimmer.getOwner().getName());
        System.out.println(volvo.getSubType() + " " + volvo.getNumberPlate() + " Owner " + volvo.getOwner().getName());
    }
}
