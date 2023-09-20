package factory;

public abstract class Bike{
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public String assembleBike(){
        return "Creating a " + name + "\n" + createFrame() + addWheels() + addPedals();
    }

    private String createFrame(){
        return "- Assembling " + name + " frame \n";
    }

    private String addWheels(){
        if(hasTrainingWheels){
            return "- Adding " + numWheels + " wheel(s)\n- Adding training wheels\n";
        }
        else
            return "- Adding " + numWheels + " wheel(s)\n";
    }

    private String addPedals(){
        if(hasPedals)
            return "- Adding pedals";
        else    
            return "";
    }

    public double getPrice(){
        return price;
    }
}