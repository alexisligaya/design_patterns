package strategy;
import java.util.Random;

/**
 * A pass behavior in the offense position
 * @author Alexis Peters
 */
class PassBehavior implements OffenseBehavior{

    /**
     * When the offense action is a pass behavior
     * @return String representation that signifies the random pass action
     */
    public String play(){

        String[] action= {"slant route", "out route", "seem route", "screen pass", "hail mary"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("throws a " + randomAction);
    }
    
}
