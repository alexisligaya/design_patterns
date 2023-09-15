package decorator;
import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines){
        this.lines = lines;
    }

    public String toString(){
        //loop through array list
        
        return lines.toString();
    }
}
