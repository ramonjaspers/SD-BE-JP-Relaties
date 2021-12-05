package nl.novi.javaprogrammeren.huiswerk.relaties.one;

/**
 *     Een CarOwner kan 0 of meerdere auto's hebben.
 *     owner must be atleast 18
 */
public class CarOwner {
    private int age;


    public boolean hasValidAge(){
    return this.age > 18;
    }
}
