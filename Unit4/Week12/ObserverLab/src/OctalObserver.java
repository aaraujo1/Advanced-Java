/**
 * Observer class that converts the state to octal
 * @author andregaraujo
 * @version 1
 */

public class OctalObserver extends Observer{

    /**
     * Constructor for OctalObserver
     * @param subject of type Subject that attaches this observer
     */
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Override update method to print out octal of state
     */
    @Override
    public void update() {
        System.out.println("Octal: " +
                Integer.toOctalString(subject.getState() ) );
    }
}