package strategy;
import java.util.Random;

/**
 * A receive behavior in the offense position
 * @author Alexis Peters
 */
public class ReceiveBehavior implements OffenseBehavior {

    /**
     * When the offense action is a receive behavior
     * @return String representation that signifies the random receive action
     */
    public String play(){

        String[] action= {"slant route", "out route", "seem route", "screen pass", "hail mary"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("runs a " + randomAction);
    }
}
