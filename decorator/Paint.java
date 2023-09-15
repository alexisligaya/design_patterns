package decorator;

public class Paint extends VehicleDecorator{

    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines);
        paintCar(color);
    }

    public String getColorCode(String color){
        if(color.equalsIgnoreCase("black"))
            return "\u001B[0m";
        if(color.equalsIgnoreCase("red"))
            return "\u001B[31m";
        if(color.equalsIgnoreCase("green"))
            return "\u001B[32m";
        if(color.equalsIgnoreCase("yellow"))
            return "\u001B[33m";
        if(color.equalsIgnoreCase("blue"))
            return "\u001B[34m";
        if(color.equalsIgnoreCase("purple"))
            return "\u001B[35m";
        if(color.equalsIgnoreCase("cyan"))
            return "\u001B[36m";
        return "";
    }

    private void paintCar(String color){
        String newLine = getColorCode(color) + lines.get(0);
        lines.set(0, newLine);

        String back = lines.get(lines.size()-1) + getColorCode("black");
        lines.set(lines.size()-1, back);
    }

}
