public class RoundScoreDisplay implements Observer {

    private Subject golfer;
    private int strokesTotal;
    private int par;
    
    public RoundScoreDisplay(Subject golfer){
        this.golfer=golfer;
        this.strokesTotal=0;
        this.par=0;
    }

    public void update(int strokes, int par){
        this.strokesTotal=strokesTotak;
        this.par=par;
    }

    public String toString(){
        return "Strokes: " + strokesTotal + ", Par: " + par;
    }
}
