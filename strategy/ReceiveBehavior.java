package strategy;
import java.util.Random;

public class ReceiveBehavior {

    public String play(){

        String[] action= {"slant route", "out route", "seem route", "screen pass", "hail mary"};

        Random random = new Random();

        int rand = random.nextInt(action.length);
        String randomAction = action[rand];

        return("runs a " + randomAction);
    }
    

}
