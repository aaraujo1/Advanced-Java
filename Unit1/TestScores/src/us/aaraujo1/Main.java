package us.aaraujo1;

//import java.util.ArrayList;
//import java.util.Scanner;

/**
 * Created by aaraujo1 on 09/03/18
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 * This is the main driver class
 * <p>
 * Write a class named TestScores.
 * The class constructor should accept an array of test scores as its argument.
 * The class should have a method that returns the average of the test scores.
 * If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException.
 * Demonstrate the class in a program.
 * Write an exception class named InvalidTestScores.
 * Modify the TestScores class to throw an InvalidTestScore exception if any of the test scores in the array are invalid.
 */
public class Main {

    //private static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        //array literal
        double[] testScores = new double[]{84, 90, 94.5, 89, 99};

        //array literal with negative error
        double[] testScoresNegative = new double[]{-2, 90, 94.5, 89, 99};

        //array literal with greater than 100 error
        double[] testScores100 = new double[]{104, 90, 94.5, 89, 99};

        //normal array
        System.out.println("Normal array: ");
        try {
            TestScores testScores1 = new TestScores(testScores);
            System.out.println(testScores1.AverageTestScores());
        } catch (Exception e){
            System.out.println(e);
        }


        //array with a negative
        System.out.println();
        System.out.println("Array with a negative test score: ");
        try {
            TestScores testScores1 = new TestScores(testScoresNegative);
            System.out.println(testScores1.AverageTestScores());
        } catch (InvalidTestScores e){
            System.out.println(e.getMessage());
        }

        //array with a greater than 100
        System.out.println();
        System.out.println("Array with a test score greater than 100: ");
        try {
            TestScores testScores1 = new TestScores(testScores100);
            System.out.println(testScores1.AverageTestScores());
        } catch (InvalidTestScores e){
            System.out.println(e.getMessage());
        }


        //Ask user for input
        //removed for simplicity
        /*
        double testScore;
        String exit;

        do {
            System.out.println("Enter a test score: ");
            try {
                testScore = k.nextDouble();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please type a number.");
            }
        } while ();
        */
    }
}
