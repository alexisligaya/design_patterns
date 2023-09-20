package factory;
/**
 * A tricycle is built.
 * @author Alexis Peters
 */
public class Tricycle extends Bike{

    public Tricycle(){
        name = "Tricycle";
        price = 10.0;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }

}