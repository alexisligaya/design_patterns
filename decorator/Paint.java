package decorator;
/**
 * The different paint colors for a vehicle.
 * @author Alexis Peters
 */
public class Paint extends Vehicle{

    /**
     * Constructs the paint colors of the vehicles.
     * @param vehicle The paint will be added to the vehicle.
     * @param color The colors of the paint.
     */ 
    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines);
        paintCar(color);
    }

    /**
     * Lists the color specifics.
     * @return String representation that displays the color codes.
     */
    public String getColorCode(String color){
        if(color.equalsIgnoreCase("black"))
            return "\u001B[0m";
        else if(color.equalsIgnoreCase("red"))
            return "\u001B[31m";
        else if(color.equalsIgnoreCase("green"))
            return "\u001B[32m";
        else if(color.equalsIgnoreCase("yellow"))
            return "\u001B[33m";
        else if(color.equalsIgnoreCase("blue"))
            return "\u001B[34m";
        else if(color.equalsIgnoreCase("purple"))
            return "\u001B[35m";
        else if(color.equalsIgnoreCase("cyan"))
            return "\u001B[36m";
        return "";
    }

     /**
     * @param color The colors of the paint.
     */ 
    private void paintCar(String color){
        String newLine = getColorCode(color) + lines.get(0);
        lines.set(0, newLine);

        String back = lines.get(lines.size()-1) + getColorCode("black");
        lines.set(lines.size()-1, back);
    }

}
