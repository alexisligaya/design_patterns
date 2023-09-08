package observer;

public class RoundScoreDisplay implements Observer {

    public Subject golfer; //?
    private int strokesTotal;
    private int par;
    
    public RoundScoreDisplay(Subject golfer){
        this.golfer=golfer;
    }

    public void update(int strokesTotal, int par){
        this.strokesTotal=strokesTotal;
        this.par=par;

        int score = strokesTotal- par;

        if(score < 0)
            System.out.println("Under Par");
        else if(score == 0)
            System.out.println("Making par");
        else 
            System.out.println("over par");
    }

    public String toString(){
        return "Overall Hole stats: Par (" + par + ") Strokes (" + strokesTotal +")";
    }
}
