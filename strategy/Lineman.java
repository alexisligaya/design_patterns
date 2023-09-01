package strategy;
import java.util.Random;

public class Lineman extends Player{

   

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
