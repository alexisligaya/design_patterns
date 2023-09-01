package strategy;
import java.util.Random;

public class RunBehavior implements OffenseBehavior{

    public String play(){
    
        String[] action= {"drive(up the gut)", "draw", "pitch", "reverse"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("runs a a " + randomAction);
    }
}
