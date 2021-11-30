package nl.novi.javaprogrammeren.huiswerk.inheritance.overerving;

public class Lion extends Animal {
    String cage;
    String lastDayFed;
    String landOfOrigin;
    int amountOfChildren;

    public Lion() {}

    public void setCage(String cage) {
        this.cage = cage;
    }

    public String getCage() {
        return cage;
    }

    public void setLastDayFed(String lastDayFed) {
        this.lastDayFed = lastDayFed;
    }

    public String getLastDayFed() {
        return lastDayFed;
    }

    public void setLandOfOrigin(String landOfOrigin) {
        this.landOfOrigin = landOfOrigin;
    }

    public String getLandOfOrigin() {
        return landOfOrigin;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    @Override
    public void makeSound(){
        System.out.println("MEOWW");
    }
}
