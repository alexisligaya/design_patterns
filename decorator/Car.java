package decorator;
/**
 * The Car is created as a type of vehicle.
 * @author Alexis Peters
 */
public class Car extends Vehicle{
    public Car(){
           super(FileReader.getLines("decorator/car.txt"));
        }
}
