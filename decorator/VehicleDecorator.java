package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle{
    protected ArrayList<String> lines;

    public VehicleDecorator(ArrayList<String> lines){
        super(lines);
         this.lines=lines;
    }

    protected void IntegrateDecor(ArrayList<String> decor){

    }

}
