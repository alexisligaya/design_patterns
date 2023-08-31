package strategy;
import java.util.Random;

class BlockBehavior implements DefenseBehavior{
    
    public String play(){

        String[] action= {"kick", "punt", "pass", "catch"};

        Random random = new Random();
        
        int rand = random.nextInt(action.length);
        String randomAction = action[rand];
        System.out.println("block a " + randomAction);

        return null; //returns nothing 
    }
    
}
