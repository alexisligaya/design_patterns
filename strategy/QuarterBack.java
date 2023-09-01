package strategy;
import java.util.Random;

public class QuarterBack extends Player{

    private Random random = new Random();
    
    public QuarterBack(String firstName, String lastName, boolean offense){
            super(firstName, lastName, offense);
    }

    public void setOffenseBehavior(){
        if(random.nextBoolean()){
            offenseBehavior = new PassBehavior();
        }
        else {
            offenseBehavior = new RunBehavior();
        }
        
    }

    public void setDefenseBehavior(){
        defenseBehavior = null;
        //returns nothing
    }

    

}
