package observer;

public class HoleScoreDisplay implements Observer {
 
    public Subject golfer; //?
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
        return "\nCurrent Hole stats: Par (" + par + ") Strokes (" + strokes +") \n" ;
    }

}