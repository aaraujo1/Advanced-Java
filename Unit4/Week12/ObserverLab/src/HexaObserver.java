/**
 * Observer class that converts the state to hexadecimal
 * @author andregaraujo
 * @version 1
 */

public class HexaObserver extends Observer{

    /**
     * Constructor for HexaObserver
     * @param subject of type Subject that attaches this observer
     */
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Override update method to print out hexadecimal of state
     */
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(
                subject.getState() ).toUpperCase() );
    }
}