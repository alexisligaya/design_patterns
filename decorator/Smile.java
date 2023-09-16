package decorator;
/**
 * The 'smile' part of the vehicle.
 * @author Alexis Peters
 */
public class Smile extends VehicleDecorator{
    Vehicle vehicle;

    /**
     * Constructs the 'smile' of the vehicle.
     * @param vehicle Where the 'smile' is added.
     */ 
    public Smile(Vehicle vehicle){
        super(vehicle.lines);
    }
}
