package strategy;
/**
 * A strip behavior in the defense position
 * @author Alexis Peters
 */
public class StripBehavior implements DefenseBehavior{
    
    /**
     * When the defense action is a strip behavior
     * @return String representation of what the strip action is
     */
    public String play(){
        return "Strip a ball from runners hands";
    }

}
