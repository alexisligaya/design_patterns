package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    DefenseBehavior defenseBehavior;
    OffenseBehavior offenseBehavior;

    public Player(String firstName, String lastName, boolean offense){
        this.firstName=firstName;
        this.lastName=lastName;
        this.offense=offense;
        setDefenseBehavior();
        setOffenseBehavior();
    }
        
    public abstract void setDefenseBehavior();
   
    public abstract void setOffenseBehavior();

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

    public String toString(){
        return this.firstName + " " + this.lastName;
    }


}
