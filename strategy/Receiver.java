package strategy;

public class Receiver extends Player{
    
    public Receiver(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }
    
    public void setOffenseBehavior(){
       offenseBehavior = new ReceiveBehavior();
    }

    public void setDefenseBehavior(){
        //returns 
    }


}
