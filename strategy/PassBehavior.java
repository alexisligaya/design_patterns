package strategy;
import java.util.Random;

class PassBehavior implements OffenseBehavior{
    public String play(){

        String[] action= {"slant route", "out route", "seem route", "screen pass", "hail mary"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("throws a " + randomAction);
    }
    
}
