package decorator;
import java.util.ArrayList;
/**
 * The Vehicle is created.
 * @author Alexis Peters
 */
public abstract class Vehicle {
    protected ArrayList<String> lines;

    /**
     * The vehicle is set up with the lines.
     * @param lines Sets the lines into an array list.
     */ 
    public Vehicle(ArrayList<String> lines){
        this.lines = lines;
    }

    /**
     * Returns the result of the array list's contents.
     * @return Displays string representation of lines. 
     */
    public String toString(){
        //loop through array list
        String end = "";
        
        for(int i = 0; i < lines.size(); i++){
            end+= lines.get(i) + "\n";
        }
        
        return end;
    }
}
