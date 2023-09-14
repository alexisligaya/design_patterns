package decorator;

public class Rims extends VehicleDecorator {
     Vehicle vehicle;

       public Rims(Vehicle vehicle){
            super(vehicle.lines);
       }

}
