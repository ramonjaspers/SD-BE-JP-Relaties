package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    private String name;
    private Gender gender;
    private Dog dog;

    public DogOwner(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " has a " + dog.getGender() + " it is " + dog.getAge() + " years old and is a: " + dog.getSpecies() + ". De dog's name is " + dog.getName();
    }

    // Getters and setters
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void increaseDogAge(){
        dog.age++;
    }

    public void setDogName(String name) {
        dog.name = name;
    }

}
