package strategy;

public class Lineman extends Player{
    
    public Lineman(String firstName, String lastName, boolean offense){

        super(firstName, lastName, offense);

    }

    public void setOffenseBehavior(){
        offenseBehavior = new OBlockBehavior();
    }

    public void setDefenseBehavior(){
       

    }
}
