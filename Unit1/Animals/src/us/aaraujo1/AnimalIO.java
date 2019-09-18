package us.aaraujo1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This is a class to get user input for three objects
 */

public class AnimalIO {
    private static Scanner k = new Scanner(System.in);
    private static PrintWriter outStream = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));

    /**
     * The method asks the user for a cat name and the number of mouses killed and returns a Cat object
     *
     * @return a Cat object with the user's input
     */
    public static Cat addCat() {
        String name = "";
        int mousesKilled = -1;

        outStream.println("Enter the cat's name: ");
        //flush PrintWriter
        outStream.flush();

        try {
            name = inStream.readLine();
        } catch (IOException e) {
            //display error
            e.printStackTrace();
        }

        //loop to ask for number of mouses killed
        do {

            System.out.println("Enter the number of mouses killed: ");

            try {
                mousesKilled = k.nextInt();
            } catch (Exception e) {
                //warn user
                System.out.println("You did not enter a number. Try again.");
                //clear Scanner
                k.nextLine();
            }

        } while (mousesKilled <= -1);

        return new Cat(mousesKilled, name);
    }

    /**
     * The method asks the user for a dog name and the disposition and returns a Dog object
     *
     * @return a Dog object with the user's input
     */
    public static Dog addDog() {
        String name = "";
        boolean friendly;
        char answer = 'a';

        outStream.println("Enter the dog's name: ");
        //flush PrintWriter
        outStream.flush();

        try {
            name = inStream.readLine();
        } catch (IOException e) {
            //display error
            e.printStackTrace();
        }

        //loop to ask for the disposition of the dog as a T/F
        do {

            System.out.println("Is the dog friendly? (Y/N) ");

            try {
                //only the first character
                answer = k.next().toUpperCase().charAt(0);

            } catch (Exception e) {
                /*
                This might never happen
                //warn user
                System.out.println("Please type Y or N.");
                //clear Scanner
                k.nextLine();
                */
                e.printStackTrace();
            }

        } while (answer != 'Y' && answer != 'N');

        //if answer is Y, friendly is true, else, false
        //simplified ternary operator
        friendly = answer == 'Y';

        return new Dog(friendly, name);
    }

    /**
     * The method asks the user for a student's name and their age and returns a Student object
     *
     * @return a Student object with the user's input
     */
    public static Student addStudent() {
        String name = "";
        int age = -1;

        outStream.println("Enter the student's name: ");
        //flush PrintWriter
        outStream.flush();

        try {
            name = inStream.readLine();
        } catch (IOException e) {
            //display error
            e.printStackTrace();
        }


        //loop to ask for number of mouses killed
        do {

            System.out.println("Enter the age of the student: ");

            try {
                age = k.nextInt();
            } catch (Exception e) {
                //warn user
                System.out.println("You did not enter a number. Try again.");
                //clear Scanner
                k.nextLine();
            }

        } while (age <= -1);

        return new Student(age, name);
    }
}
