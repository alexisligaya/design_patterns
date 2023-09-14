package decorator;
import java.util.ArrayList;

public class Rims extends VehicleDecorator {
       public Rims(Vehicle vehicle){
            super(vehicle.lines);
       }

}
