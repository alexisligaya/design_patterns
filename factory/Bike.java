package factory;
/**
 * A bike is selected and built.
 * @author Alexis Peters
 */
public abstract class Bike{
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * States the name of the bike, adds the wheels, and adds the pedals.
     * @return String representation that displays the bike specifications.
     */
    public String assembleBike(){
        return "Creating a " + name + "\n" + createFrame() + addWheels() + addPedals();
    }

    /**
     * States the bike frame.
     * @return String representation that displays the specific bike frame. 
     */
    private String createFrame(){
        return "- Assembling " + name + " frame \n";
    }

     /**
     * Adds wheels to the bike.
     * @return String representation that displays the number of wheels and wheter it has training wheels. 
     */
    private String addWheels(){
        if(hasTrainingWheels){
            return "- Adding " + numWheels + " wheel(s)\n- Adding training wheels\n";
        }
        else
            return "- Adding " + numWheels + " wheel(s)\n";
    }

    /**
     * Adds pedals to the bike.
     * @return String representation that displays if pedals are added. 
     */
    private String addPedals(){
        if(hasPedals)
            return "- Adding pedals";
        else    
            return "";
    }

    /**
     * Lists the price of the bike.
     * @return Double representation of the price. 
     */
    public double getPrice(){
        return price;
    }
}