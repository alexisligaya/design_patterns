package decorator;

public class Paint extends VehicleDecorator{
    Vehicle vehicle; 

    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines);
    }
}
