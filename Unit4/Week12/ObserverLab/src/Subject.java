import java.util.ArrayList;
import java.util.List;

/**
 * Subject class to attach and detach observers
 *
 * @author andregaraujo
 * @version 1
 */


public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    /**
     * Method that get the state
     * @return the state as an int
     */
    public int getState() {
        return state;
    }

    /**
     * Method to set the state
     * @param state as an int
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * Method to attach an observer
     * @param observer as an Observer type
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * Method to detach an observer
     * @param observer as an Observer type
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Method to run all attached observers to run their update method
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}