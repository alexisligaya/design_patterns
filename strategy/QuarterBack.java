package strategy;
import java.util.Random;
/**
 * A football player in the quarterback position
 * @author Alexis Peters
 */
public class QuarterBack extends Player{
    
    /**
     * Creates a string representation for the quarterback's name 
     * @param firstName Quarterback's first name 
     * @param lastName Quarterback's last name 
     * @param offense Randomly chooses whether offense position 
     */
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
    }

    

}
