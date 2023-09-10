package observer;

/**
 * A golfer's result of total strokes and par
 * @author Alexis Peters
 */
public class RoundScoreDisplay implements Observer {

    private Subject golfer; 
    private int strokesTotal;
    private int parTotal;

    /**
     * Creates a golfer
     * @param golfer Sets the golfer as the subject
     */ 
    public RoundScoreDisplay(Subject golfer){
        this.golfer=golfer;
        golfer.registerObserver(this);
    }

    /**
     * Receives the input for total strokes and total par values
     * @param strokes Golfer's number of total strokes
     * @param par Golfer's number of total par
     */
    public void update(int strokesTotal, int parTotal){
        this.strokesTotal+=strokesTotal;
        this.parTotal+=parTotal;
    }

    /**
     * Compares the amount of total strokes and par 
     * @return String representation that displays the total results and whether the golfer was over or under par.
     */
    public String toString(){
        String overallPar;
        if(strokesTotal > parTotal){
            overallPar= strokesTotal-parTotal + " over par";
        }
        else if(strokesTotal == parTotal){
            overallPar = "Making par";
        }
        else{
            overallPar = parTotal-strokesTotal + " under par";
        }
        return "Overall Hole stats: Par (" + parTotal + ") Strokes (" + strokesTotal +"), " + overallPar;
    }
}
