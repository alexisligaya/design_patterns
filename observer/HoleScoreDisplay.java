import java.util.Observer;

public class HoleScoreDisplay implements Observer {
 
    private Subject golfer;
    private int strokes;
    private int par;
    
    public HoleScoreDisplay(Subject golfer){
        this.golfer=golfer;
        this.strokes=0;
        this.par=0;
    }

    public void update(int strokes, int par){
        this.strokes=strokes;
        this.par=par;
    }

    public String toString(){
        return "Strokes: " + strokes + ", Par: " + par;
    }

}