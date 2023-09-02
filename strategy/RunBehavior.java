package strategy;
import java.util.Random;

/**
 * A run behavior in the offense position
 * @author Alexis Peters
 */
public class RunBehavior implements OffenseBehavior{

     /**
     * When the offense action is a run behavior
     * @return String representation that signifies the random run action
     */
    public String play(){
    
        String[] action= {"drive(up the gut)", "draw", "pitch", "reverse"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("runs a " + randomAction);
    }
}
