package nl.novi.javaprogrammeren.huiswerk.inheritance.overerving;

public abstract class Pet extends Animal{
    private String owner;
    private String favouriteFoodBrand;
    private String species;

    public Pet() {
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setFavouriteFoodBrand(String favouriteFoodBrand) {
        this.favouriteFoodBrand = favouriteFoodBrand;
    }

    public String getFavouriteFoodBrand() {
        return favouriteFoodBrand;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void move() {
        System.out.println(name + "has moved 0.25 meters");
    }


}
