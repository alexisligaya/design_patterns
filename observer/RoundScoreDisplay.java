package observer;

public class RoundScoreDisplay implements Observer {

    private Subject golfer; 
    private int strokesTotal;
    private int par;

    public RoundScoreDisplay(Subject golfer){
        this.golfer=golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokesTotal, int par){
        this.strokesTotal=strokesTotal;
        this.par=par;
    }

    public String toString(){
        String overallPar;
        if(strokesTotal > par){
            overallPar= strokesTotal-par + " over par";
        }
        else if(strokesTotal == par){
            overallPar = "Making par";
        }
        else{
            overallPar = par-strokesTotal + " under par";
        }
        return "Overall Hole stats: Par (" + par + ") Strokes (" + strokesTotal +"), " + overallPar;
    }
}
