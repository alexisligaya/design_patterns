package factory;
/**
 * A bike is chosen between a tricycle, strider, and a kids bike.
 * @author Alexis Peters
 */
public class BikeStore {

    public BikeStore(){};

    /**
     * Creates the specific type of bike.
     * @return The bike depending on the user's decision.  
     */
    public Bike createBike(String type){
        Bike bike;

        if(type.equals("tricycle")){
            bike = new Tricycle();
        }
        else if(type.equals("strider")){
            bike = new Strider();
        }
        else if(type.equals("kids bike")){
            bike = new KidsBike();
        }
        else{
            bike = new Tricycle();
        }
        return bike;
    }

}