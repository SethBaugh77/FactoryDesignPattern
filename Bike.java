package FactoryDesignPattern;

/**
 * This is an abstract class that represents a bike.
 * @author Seth Baugh
 */
public abstract class Bike {

    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    /**
     * This method calls to all the other methods in the class.
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
        System.out.println("Price: $" + getPrice());
    }

    /**
     * This method creates the frame of the bike.
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * This method adds the wheels to the bike.
     */
    private void addWheels() {
        if (numWheels == 2) {
            System.out.println("Adding 2 wheels");
            if (name == "kids bike") {

                System.out.println("Adding training wheels");
            }

        } else if (numWheels == 3)
            System.out.println("Adding 3 wheels");
    }

    /**
     * This method adds the pedals to the bike.
     */
    private void addPedals() {
        if (hasPeddals == true)
            System.out.println("Adding pedals");
    }

    /**
     * This method returns the price of the bike.
     * @return price of the bike.
     */
    public double getPrice() {
        return price;
    }

}
