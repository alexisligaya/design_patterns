package strategy;

/**
 * A OBlock behavior in the offense position
 * @author Alexis Peters
 */
class OBlockBehavior implements OffenseBehavior{
    
    /**
     * When the offense action is a OBlock behavior
     * @return String representation of what the OBlock action is
     */
    public String play(){
        return "Block Defenders";
    }

}
