package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;

/**
 * Een CarDealer kan 0 of meerdere auto's hebben.
 */
public class CarDealer {
    private String name;
    private ArrayList<Car> cars;

    public CarDealer(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public boolean addCar(Car car) {
        if (!ownsCar(car)) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public void removeCar(Car car) {
        if (ownsCar(car)) {
            cars.remove(car);
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner
     * CarOwner moet 18 of ouder zijn
     *
     * @param car
     * @param newOwner
     */
    public void setNewCarOwner(Car car, CarOwner newOwner) {
        //validate age and add car to the new owner
        if (newOwner.hasValidAge() && newOwner.addCar(car)) {
            car.setOwner(newOwner);
            //when car is added to the new owner, remove it from the dealer
            this.removeCar(car);
        }
    }

    public boolean ownsCar(Car car) {
        // Loop over all the cars of the dealer
        for (Car ownedCar : this.cars) {
            if (ownedCar.getNumberPlate().equals(car.getNumberPlate())) {
                return true;
            }
        }
        return false;
    }
}
