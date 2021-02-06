package FactoryDesignPattern;

/**
 * This class represents a tricycle bike.
 * @author Seth Baugh
 */
public class Tricycle extends Bike {

    /**
     * Constructor for the class that creates the object.
     */
    public Tricycle() {
        name = "tricycle";
        price = 54.95;
        hasPeddals = true;
        numWheels = 3;
    }

}
