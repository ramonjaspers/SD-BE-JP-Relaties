package nl.novi.javaprogrammeren.huiswerk.inheritance.overerving;

public abstract class Animal {
    public String name;
    public Gender gender;
    public String food;

    public Animal(){
    }


    public void move() {
        System.out.println(name + " has moves 0.5 meters");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + "eats " + food);
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
