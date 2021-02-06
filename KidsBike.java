package FactoryDesignPattern;

/**
 * This class represents a kids bike.
 * @author Seth Baugh
 */
public class KidsBike extends Bike {

    /**
     * Constructor for the class that creates the object.
     */
    public KidsBike() {
        name = "kids bike";
        price = 80.99;
        numWheels = 2;
        hasPeddals = true;
    }

}
