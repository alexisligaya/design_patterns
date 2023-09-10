package observer;


public class HoleScoreDisplay implements Observer {

    private Subject golfer; 
    private int strokes;
    private int par=3;

   public HoleScoreDisplay(Subject golfer){
        this.golfer=golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par){
        this.strokes=strokes;
        this.par=par;
    }

    public String toString(){
        String checkPar;
        if(strokes > par){
            checkPar= strokes-par + " over par";
        }
        else if(strokes == par){
            checkPar = "Making par";
        }
        else{
            checkPar = par-strokes + " under par";
        }
       return "\nCurrent Hole stats: Par (" + par + ") Strokes (" + strokes +"), " + checkPar;
    }

}