/**
 * Observer class that converts the state to binary
 * @author andregaraujo
 * @version 1
 */

public class BinaryObserver extends Observer{

    /**
     * Constructor for BinaryObserver
     * @param subject of type Subject that attaches this observer
     */
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Override update method to print out binary of state
     */
    @Override
    public void update() {
        System.out.println( "Binary String: " +
                Integer.toBinaryString( subject.getState()));
    }
}