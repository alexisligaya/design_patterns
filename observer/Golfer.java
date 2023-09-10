package observer;
import java.util.ArrayList;

/**
 * A golfer's name is entered
 * @author Alexis Peters
 */
public class Golfer implements Subject{
    
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    protected String name;

    /**
     * Creates a string representation for the receivers' name 
     * @param name Golfer's name 
     */
    public Golfer(String name){
            this.name=name;
    }

    public void registerObserver(Observer observer){
            observers.add(observer);
    }

    public void removeObserver(Observer observer){
            observers.remove(observer);
    }
    
    public void notifyObservers(int strokes, int par){
            for(Observer observer: observers){
                observer.update(strokes, par);
            }
    }

    public void enterScore(int strokes, int par){
            notifyObservers(strokes,par);
    }

    /**
     * When the golfers' name is inputed
     * @return String representation that states the golfer's name
     */
    public String getName(){
        return this.name;
    }
}
