package strategy;

/**
 * A sack behavior in the defense position
 * @author Alexis Peters
 */
public class SackBehavior implements DefenseBehavior{
    
    /**
     * When the defense action is a sack behavior
     * @return String representation of what the sack action is
     */
    public String play(){
        return "Sack the quaterback";
    }

}
