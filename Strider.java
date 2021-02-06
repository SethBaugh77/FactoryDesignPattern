package FactoryDesignPattern;

/**
 * This class represents a strider bike.
 * @author Seth Baugh
 */
public class Strider extends Bike {

    /**
     * Constructor for the class that creates the object.
     */
    public Strider() {
        name = "strider";
        price = 65.99;
        numWheels = 2;
        hasPeddals = false;
    }

}
