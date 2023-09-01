package strategy;
import java.util.Random;

public class QuarterBack extends Player{

     Random random = new Random();
    
    public QuarterBack(String firstName, String lastName, boolean offense){
            super(firstName, lastName, offense);
    }

    public void setOffenseBehavior(){
        defenseBehavior = new BlockBehavior();
        offenseBehavior = new PassBehavior();
    }

    public void setDefenseBehavior(){
        //returns nothing
    }

    

}
