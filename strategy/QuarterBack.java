package strategy;
import java.util.Random;

public class QuarterBack extends Player{
    
    public QuarterBack(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior(){
        Random random = new Random();

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
