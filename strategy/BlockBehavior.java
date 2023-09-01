package strategy;
import java.util.Random;

public class BlockBehavior implements DefenseBehavior{
    
    public String play(){

        String[] action= {"kick", "punt", "pass", "catch"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("block a " + randomAction);
    }  
}
