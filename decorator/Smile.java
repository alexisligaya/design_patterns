package decorator;

public class Smile extends VehicleDecorator{
    Vehicle vehicle;

    public Smile(Vehicle vehicle){
        super(vehicle.lines);
    }
}
