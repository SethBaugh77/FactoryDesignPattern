package FactoryDesignPattern;

/**
 * Class that represents a bike factory and store. 
 * @author Seth Baugh
 */
public class BikeStore {

    /**
     * Method that calls to the createBike method in order to create a bike.
     * @param type of bike to be made.
     * @return a created bike.
     */
    public Bike orderBike(String type) {
        Bike _bik = createBike(type);
        return _bik;

    }

    /**
     * Method that creates a bike depending on its type.
     * @param type of bike to be made.
     * @return a created bike.
     */
    private Bike createBike(String type) {

        if (type == "kids bike") {
            Bike bik = new KidsBike();
            bik.createBike();
            return bik;
        } else if (type == "strider") {
            Bike bik = new Strider();
            bik.createBike();
            return bik;
        }

        else {
            Bike bik = new Tricycle();
            bik.createBike();
            return bik;
        }

    }

}
