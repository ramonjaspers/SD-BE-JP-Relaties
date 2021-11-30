package nl.novi.javaprogrammeren.huiswerk.inheritance.overerving;

public class Cat extends Pet {
    public CatType catType;
    public Cat() {
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    public CatType getCatType() {
        return catType;
    }

    @Override
    public void makeSound(){
        System.out.println("meow");
    }
}
