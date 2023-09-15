package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle{
    protected ArrayList<String> lines;

    public VehicleDecorator(ArrayList<String> lines){
        super(lines);
         this.lines=lines;
    }

    protected void IntegrateDecor(ArrayList<String> decor){
        for(int i =0; i < lines.size(); i++){
            String line = "";
            for(int j = 0; j < lines.get(i).length(); j++){
                if(decor.get(i).length() > j && decor.get(i).charAt(j) != ' '){
                    line += decor.get(i).charAt(j);
                }
                else 
                    line += lines.get(i).charAt(j);
            }
            lines.set(i, line);
        }
    }

}
