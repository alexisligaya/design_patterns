package strategy;

/**
 * A football player in the receiver position
 * @author Alexis Peters
 */
public class Receiver extends Player{
    
    /**
     * Creates a string representation for the receivers' name 
     * @param firstName Receivers' first name 
     * @param lastName Receivers' last name 
     * @param offense Randomly chooses whether offense position 
     */
    public Receiver(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }
    
    public void setOffenseBehavior(){
       offenseBehavior = new ReceiveBehavior();
    }

    public void setDefenseBehavior(){
    }


}
