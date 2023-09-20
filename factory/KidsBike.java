package factory;
/**
 * A kids bike is built.
 * @author Alexis Peters
 */
public class KidsBike extends Bike{

    public KidsBike(){
        name = "Kids Bike";
        price = 30.0;
        numWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }

}