package strategy;
import java.util.Random;

/**
 * A football player in the lineman position
 * @author Alexis Peters
 */
public class Lineman extends Player{

   
     /**
     * Creates a string representation for the receivers' name 
     * @param firstName Linemans' first name 
     * @param lastName Linemans' last name 
     * @param offense Randomly chooses whether offense position 
     */
    public Lineman(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior(){
        offenseBehavior = new OBlockBehavior();
    }

    public void setDefenseBehavior(){
          Random random = new Random();

          int rand = random.nextInt(3);
          if(rand==1){
               defenseBehavior = new BlockBehavior();
          }
          else if(rand==2){
               defenseBehavior = new StripBehavior();
          }  
          else{
               defenseBehavior = new SackBehavior();
          }
    }
}
