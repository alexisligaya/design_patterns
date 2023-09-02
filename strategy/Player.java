package strategy;

/**
 * A Football Player 
 * @author Alexis Peters
 */

public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    DefenseBehavior defenseBehavior;
    OffenseBehavior offenseBehavior;

    /**
     * A string representation of the player's first and last name
     * @param firstName String representation of the players' first name
     * @param lastName String representation of the players' last name
     * @param offense Boolean for offense position
     */
    public Player(String firstName, String lastName, boolean offense){
        this.firstName=firstName;
        this.lastName=lastName;
        this.offense=offense;
        setDefenseBehavior();
        setOffenseBehavior();
    }
        
    public abstract void setDefenseBehavior();
   
    public abstract void setOffenseBehavior();

    /**
     * Checks offense and defense positions
     * @return String represention whether the player is playing on offense or defense
     */
    public String play(){
    
       if(offense && offenseBehavior != null){

            return offenseBehavior.play();
       }
       else if(!offense && defenseBehavior != null ){

            return defenseBehavior.play();
       }
       return "not playing";
       
    }

    public void turnover(){
       offense = !offense;
    }

    /**
     * @return String representation of player's name
     */
    public String toString(){
        return this.firstName + " " + this.lastName;
    }


}
