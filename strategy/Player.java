package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;


    public Player(String firstName, String lastName, boolean offense){

    }
        
    public void setDefenseBehavior(){

    }
   
    public void setOffenseBehavior(){

    }

    public String play(){
        return null;
    }

    public void turnover(){
        return;
    }


    public String toString(){
        return this.firstName + "\t" + this.lastName;
    }


}
