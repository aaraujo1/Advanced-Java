/**
 * Observer abstract class that all implementations will contain a Subject type and update methog
 * @author andregaraujo
 * @version 1
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}