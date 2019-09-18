package us.aaraujo1;

/**
 * Created by aaraujo1 on 09/03/18
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 * This is the TestScores class
 *
 * Write a class named TestScores.
 * The class constructor should accept an array of test scores as its argument.
 * The class should have a method that returns the average of the test scores.
 * If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
 * Demonstrate the class in a program.
 * Write an exception class named InvalidTestScores.
 * Modify the TestScores class to throw an InvalidTestScore exception if any of the test scores in the array are invalid.
 */

public class TestScores {

    //I would rather use an ArrayList, but assignment asks for an array
    //ArrayList<Double> testScoresArray = new ArrayList<>();

    /**
     * An array of test scores
     */
    private double[] testScores;

    /**
     * Constructor that accepts an array of test scores and check their validity
     * @param testScores an array of test scores as a doubles
     * @throws InvalidTestScores if a score if less that 0 or greater than 100
     */
    public TestScores (double[] testScores) throws InvalidTestScores {
        //The class constructor should accept an array of test scores as its argument.
        this.testScores=testScores;

        //for loop to check array items
        for (double d : testScores){

            /* //conditional test to check if valid score
            if (d < 0){
                //throw new IllegalArgumentException("A test score is below zero");
                throw new InvalidTestScores(d);
            }
            else if (d > 100){
                //throw new IllegalArgumentException("A test score is above 100");
                throw new InvalidTestScores(d);
            }*/

            //conditional test to check if valid score
            if (d < 0 || d > 100){
                throw new InvalidTestScores(d);
            }
        }

    }

    /**
     * Method to get the number of items in an array, total the items in an array, and calculate the average
     * @return the total of the items in an array divided by the number of tests scores
     */
    public double AverageTestScores(){
        int tests = testScores.length;
        double total = 0;
        for (double i : testScores){
            total += i;
        }
        return total / tests;
    }
}
