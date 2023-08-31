package strategy;

public abstract class Player {
    private String firstName;
    private String lastName;
    
    public Player(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String play(){
       
    }

    public abstract void setDefenseBehavior();

    public abstract void setOffenseBehavior();

    public void turnover(){
        System.out.println("turnover");
    }

    public String toString(){
        return this.firstName + "\t" + this.lastName;
    }
}
