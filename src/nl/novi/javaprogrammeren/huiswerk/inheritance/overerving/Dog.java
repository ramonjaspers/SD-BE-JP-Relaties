package nl.novi.javaprogrammeren.huiswerk.inheritance.overerving;

public class Dog extends Pet {

    public Dog() {
    }

    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}
