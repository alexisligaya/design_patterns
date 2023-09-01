package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;


    public Player(String firstName, String lastName, boolean offense){
        this.firstName=firstName;
        this.lastName=lastName;
        this.offense=offense;
    }
        
    public void setDefenseBehavior(){

    }
   
    public void setOffenseBehavior(){

    }

    public String play(){
       if(offense){
        return offenseBehavior.play();
       }
       else{
        return defenseBehavior.play();
       }
    }

    public void turnover(){
       offense = !offense;
    }


    public String toString(){
        return this.firstName + "\t" + this.lastName;
    }


}
