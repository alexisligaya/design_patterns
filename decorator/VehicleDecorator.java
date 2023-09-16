package decorator;
import java.util.ArrayList;
/**
 * The Vehicle Decorator is integrated.
 * @author Alexis Peters
 */
public abstract class VehicleDecorator extends Vehicle{
    protected ArrayList<String> lines;

    /**
     * The vehicle decorator is set pu with the lines.
     * @param lines Sets the lines into an array list.
     */ 
    public VehicleDecorator(ArrayList<String> lines){
        super(lines);
        this.lines=lines;
    }

     /**
     * The vehicle decoration is implemented.
     * @param decor String representation of the array list for the vehicle decoration.
     */ 
    protected void IntegrateDecor(ArrayList<String> decor){
        for(int i =0; i < lines.size(); i++){
            String line = "";
            for(int j = 0; j < lines.get(i).length(); j++){
                if(decor.get(i).length() > j && decor.get(i).charAt(j) != ' '){
                    line += decor.get(i).charAt(j);
                }
                else {
                    line += lines.get(i).charAt(j);
                }
            }
            lines.set(i, line);
        }
    }

}
