package decorator;

public class Paint extends VehicleDecorator{
    
    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines);
    }
}
