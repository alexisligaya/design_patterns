package strategy;

public class Player {
    private String firstName;
    private String lastName;
    private boolean offense;


    public Player(String firstName, String lastName, boolean offense){
         
    }

    public void setDefenseBehavior(){

    }

    public void setOffenseBehavior(){

    }

    public void turnover(){

    }

    public String toString(){
        return this.firstName + "\t" + this.lastName;
    }
}
