package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;

/**
 * Een CarDealer kan 0 of meerdere auto's hebben.
 *
 */
public class CarDealer {
    private String name;
    private ArrayList<Car> cars;

    public CarDealer(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public void putCar(Car car) {
        Car
        this.cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void moveToOwner (Car newTarget)
    {
        this.owner = newTarget;
    }

}
