package decorator;
/**
 * The rims of a vehicle.
 * @author Alexis Peters
 */
public class Rims extends VehicleDecorator {

     /**
     * Constructs the rims of the vehicle.
     * @param vehicle The rims of the vehicle.
     */ 
       public Rims(Vehicle vehicle){
            super(vehicle.lines);
            IntegrateDecor(FileReader.getLines("decorator/rims.txt"));
       }

}
