package us.aaraujo1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This is the main driver class
 */


public class Main {

    //moving inside main because opening both files caused a problem
    //private final static FileOutput outFile = new FileOutput("animals.txt");
    //private final static FileInput inFile = new FileInput("animals.txt");

    private final static String filename = "animals.txt";

    public static void main(String[] args) {

        //new array list of Talkable objects
        ArrayList<Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        /*zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));*/
        //End Lines to Replace

        //new way to get input for zoo array list
        AnimalIO aIO = new AnimalIO();
        zoo.add(aIO.addCat());
        zoo.add(aIO.addDog());
        zoo.add(aIO.addStudent());

        //Removed because no longer reading from a file
        //FileInput fi = new FileInput("animals.txt");
        //inFile.fileReadLine();

        //open file for output
        FileOutput outFile = new FileOutput(filename);

        //loop to print lines using the printOut method
        for (Talkable thing : zoo) {
            printOut(thing, outFile);
        }

        //close file for output
        outFile.fileClose();

        //Read File for input
        FileInput inFile = new FileInput(filename);

        //read file
        inFile.fileRead();
        //close file for input
        inFile.fileClose();

        /*
        //this read the file I just created as a way to check
        FileInput indata = new FileInput(filename);
        //adding line to tell console this method is occurring
        System.out.println("indata starting");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
        indata.fileClose();
        */

    }

    //for outputting
    //redid method to accept FileOutput object because FileInput is instantiated in main method
    public static void printOut(Talkable p, FileOutput fo) {
        //write to terminal
        System.out.println(p.getName() + " says=" + p.talk());
        //write to file
        fo.fileWrite(p.getName() + "|" + p.talk());
    }

    //for outputting
    /*
    public static void printOut(Talkable p) {
        //write to terminal
        System.out.println(p.getName() + " says=" + p.talk());
        //write to file
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }*/


}
