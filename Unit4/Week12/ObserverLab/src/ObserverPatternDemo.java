/**
 * Observer Pattern Lab
 *
 * 1. Build the Conversion Project from the code in the slides for the Observer pattern.
 * 2. Add another observer class that doesn't convert the state, but indicates whether it is negative, positive or zero and test it.
 * 3. Implement a detach() method on the Subject, and demonstrate detaching a selected Observer in the main method.
 * 4. Include JUnit tests and JavaDoc where appropriate.
 * 5. Upload a Class diagram, including your new observer class, in response to this question.
 * 6. Load your project into a GitHub repository named ObserverLab.
 *
 * Driver class
 * @author andregaraujo
 * @version 1
 */

public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new Subject();

        //new HexaObserver(subject);
        //new OctalObserver(subject);
        //new BinaryObserver(subject);
        new PosNegObserver(subject);

        //named objects instead so I can detach them
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);


        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("\nSecond state change: 10");
        subject.setState(10);
        System.out.println("\nThird state change: 5");
        subject.setState(5);
        System.out.println("\nFourth state change: 0");
        subject.setState(0);
        System.out.println("\nFifth state change: -5");
        subject.setState(-5);

        //detaching
        subject.detach(hexaObserver);
        subject.detach(octalObserver);
        subject.detach(binaryObserver);

        System.out.println("\nSixth state change: -10");
        subject.setState(-10);
    }
}