package factory;
/**
 * A strider bike is built.
 * @author Alexis Peters
 */
public class Strider extends Bike{
    //boolean for having training wheels or bikes
    public Strider(){
        name = "Strider";
        price = 20.0;
        numWheels = 2;
        hasPedals = false;
        hasTrainingWheels = false;
    }
}