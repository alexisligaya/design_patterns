package decorator;
import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines){
        this.lines = lines;
    }

    public String toString(){
        //loop through array list
        String result = "";
        
        for(int i = 0; i < lines.size(); i++){
            result += lines.get(i) + "\n";
        }
        
        return result;
    }
}
