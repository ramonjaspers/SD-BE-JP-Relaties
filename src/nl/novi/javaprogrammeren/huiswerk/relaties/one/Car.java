package nl.novi.javaprogrammeren.huiswerk.relaties.one;

/**
 * Car heeft: kenteken, merk, subtype, aantalKmGereden
 * Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
 * leeg (null).
 */
public class Car {
    private String numberPlate;
    private String brand;
    private String subType;
    private int amountOfKilometers;

    private CarOwner owner;

    public Car(String numberPlate, String brand, String subType, int amountOfKilometers) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.subType = subType;
        this.amountOfKilometers = amountOfKilometers;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getSubType() {
        return subType;
    }

    public void setAmountOfKilometers(int amountOfKilometers) {
        this.amountOfKilometers = amountOfKilometers;
    }

    public int getAmountOfKilometers() {
        return amountOfKilometers;
    }

    public CarOwner getOwner() {
        return this.owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }
}
