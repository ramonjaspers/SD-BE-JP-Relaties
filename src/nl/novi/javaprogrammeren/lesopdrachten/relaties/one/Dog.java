package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class Dog {
    public String name;
    private String species;
    public int age;
    private Gender gender;

    public Dog(String name, String species, int age, Gender sex) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.gender = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void increaseAge() {
        this.age++;
    }

    public String getSpecies() {
        return species;
    }

    public Gender getGender() {
        return gender;
    }
}
