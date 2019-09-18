package us.aaraujo1;

/**
 * Created by aaraujo1 on 09/03/18
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 * <p>
 * InvalidTestScores exceptions are thrown by
 * the TestScores class when
 * a negative test score is found
 * a test score that is greater than 100 is found
 */
public class InvalidTestScores extends Exception {

    /**
     * No-argument constructor
     */
    public InvalidTestScores() {
        super("Error: invalid test score");
    }

    /**
     * Constructor to accept a test score
     *
     * @param d test score as a double
     */

    public InvalidTestScores(double d) {
        super("Error: " + d + " is and invalid test score.");

    }
}
