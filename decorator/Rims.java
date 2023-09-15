package decorator;

public class Rims extends VehicleDecorator {

       public Rims(Vehicle vehicle){
            super(vehicle.lines);
            IntegrateDecor(FileReader.getLines("decorator/rims.txt"));
       }

}
