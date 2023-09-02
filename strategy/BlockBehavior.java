package strategy;
import java.util.Random;

/**
 * A block behavior in the defense position
 * @author Alexis Peters
 */
public class BlockBehavior implements DefenseBehavior{
    
    /**
     * When the defense action is a block behavior
     * @return String representation that signifies the random action
     */
    public String play(){

        String[] action= {"kick", "punt", "pass", "catch"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("block a " + randomAction);
    }  
}
