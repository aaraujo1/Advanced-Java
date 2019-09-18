/**
 * Observer class that doesn't convert the state, but indicates whether it is negative, positive or zero and test it
 * @author andregaraujo
 * @version 1
 */

public class PosNegObserver extends Observer {
    private String posNegString = "";

    /**
     * Constructor for PosNegObserver
     * @param subject of type Subject that attaches this observer
     */
    public PosNegObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Override update method to print out if positive or negative
     */
    @Override
    public void update(){

        if (subject.getState() < 0) {
            posNegString = "negative";
        } else if (subject.getState() > 0) {
            posNegString = "positive";
        } else {
            posNegString = "zero";
        }

        System.out.println("+/- Number: " + posNegString);


    }


}


