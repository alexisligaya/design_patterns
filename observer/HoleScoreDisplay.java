package observer;

/**
 * A golfer's result of strokes and par
 * @author Alexis Peters
 */
public class HoleScoreDisplay implements Observer {

    private Subject golfer; 
    private int strokes;
    private int par=3;

   /**
     * Creates a golfer
     * @param golfer Sets the golfer as the subject
     */ 
   public HoleScoreDisplay(Subject golfer){
        this.golfer=golfer;
        golfer.registerObserver(this);
    }

    /**
     * Receives the input for strokes and par
     * @param strokes Golfer's number of strokes
     * @param par Golfer's number of par
     */
    public void update(int strokes, int par){
        this.strokes=strokes;
        this.par=par;
    }

    /**
     * Compares the amount of strokes and par 
     * @return String representation that displays the results and whether the golfer was over or under par.
     */
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
       return "\nCurrent Hole stats: Par (" + par + ") Strokes (" + strokes +"), " + checkPar + "\n";
    }

}