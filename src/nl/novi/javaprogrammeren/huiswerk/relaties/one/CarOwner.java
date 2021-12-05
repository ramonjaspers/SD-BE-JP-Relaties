package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;

/**
 * Een CarOwner kan 0 of meerdere auto's hebben.
 * owner must be atleast 18
 */
public class CarOwner {
    private String name;
    private int age;
    private ArrayList<Car> cars;


    public CarOwner(String name, int age) {
        this.age = age;
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public boolean hasValidAge() {
        return this.age > 18;
    }

    public boolean addCar(Car car) {
        if (!ownsCar(car)) {
            this.cars.add(car);
            return true;
        }
        return false;
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
