package us.aaraujo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aaraujo1 on 9/3/18.
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 * This is the main driver class
 * <p>
 * File encryption is the science of writing the contents of a file in a secret code.
 * Your encryption program should work like a filter, reading the contents the contents of one file, modifying the data into a code, and then writing the coded contents out to a second file.
 * The second file will be a version of the first file, but written in a secret code.
 * Although there are complex encryption techniques, you should come up with a simple one of your own.
 * For example, you could read the first file one character at a time, and add 10 to the character code of each character before it is written to the second file.
 * <p>
 * Write a method that decrypts the encrypted file.
 * The data should be restored to its original state and printed to the console.
 * Include JavaDoc comments to explain your encryption/decryption approaches.
 * Create Unit tests for the encryption and decryption methods.
 */

public class Main {
    //variable to hold a line of text
    private static String text;
    //encryption key
    private final static int encrypt = 10;
    //boolean to encrypt or decrypt
    //private static boolean choice;

    //Scanner to talk to user
    private static Scanner k = new Scanner(System.in);
    //Stream Writer and Reader


    public static void main(String[] args) {

        //enter program
        int option = 0;
        do {

            System.out.println("What would you like to do?");
            System.out.println("1) Encrypt my file");
            System.out.println("2) Decrypt my file");
            System.out.println("3) End Program");

            try {
                option = k.nextInt();

            } catch (Exception e) {
                //warn user
                System.out.println("You did not enter a number.");
                //clear Scanner
                k.nextLine();
            }
            if (option < 1 || option > 3){
                System.out.println("Please enter 1, 2, or 3.");
            }
        }
        while (option < 1 || option > 3);

        if (option == 1) {
            //choice = true;
            /*-- TO ENCRYPT --*/
            //read file
            //filepath of plain text file to read
            FileReader inFileEncrypt = new FileReader("plainText.txt");

            //put string in variable
            //the file only has one line so I'm not looping through to capture each line
            text = inFileEncrypt.fileRead();

            //close file
            inFileEncrypt.fileClose();

            //output to file
            //filepath of encrypted text file to write to
            FileWriter outFileEncrypt = new FileWriter("encryptText.txt");

            //output string to file
            //Because it is one line, no need to loop
            outFileEncrypt.fileWrite(Encrypt(text));

            //close file
            outFileEncrypt.fileClose();

            System.out.println("File encypted!");
        }else if (option == 2){
            //choice = false;

            /*-- TO DECRYPT --*/
            //read file
            FileReader inFileDecrypt = new FileReader("encryptText.txt");

            //put string in variable
            //the file only has one line so I'm not looping through to capture each line
            text = inFileDecrypt.fileRead();

            //close file
            inFileDecrypt.fileClose();

            //output to console
            System.out.println(Decrypt(text));

        }else {
            System.out.println("Goodbye!");
            //do nothing and end program
        }
    }
/*
    /**
     * Method that takes a line of text and puts each character into an array.
     * Based on boolean variable, each character is encrypted or decrypted it when it is added to the array.
     * The array is then returned as a String.
     *
     * @param text   the original line of text as a String
     * @param choice boolean based on menu choice
     * @return the encrypted line of text as a String
     */
    /*public static String Splitter(String text, boolean choice) {

        //create an ArrayList
        ArrayList<Character> characterArray = new ArrayList<Character>();

        //for each loop
        //for each character (type variable named char)
        //in the string Text (now an array of chars using the toCharArray() method)
        //breaking it apart into ArrayList
        //alter each char
        for (char c : text.toCharArray()) {
            //implicit convert to int for char code
            //SOURCE: https://stackoverflow.com/questions/2006533/how-can-i-get-a-unicode-characters-code
            int charCode = (int) c;
            //conditional based on menu choice
            if (choice) {
                //chosen to encrypt

                charCode += encrypt;
            } else {
                //chosen to decrypt

                charCode -= encrypt;
            }

            char cEncrypt = (char) charCode;
            //add to arrayList
            characterArray.add(cEncrypt);
        }

        //use StringBuilder to convert character array to string
        //SOURCE: https://stackoverflow.com/questions/6324826/converting-arraylist-of-characters-to-a-string
        StringBuilder sb = new StringBuilder(characterArray.size());
        //for each loop to add characters from characterArray into the StringBuilder
        for (Character ch : characterArray) {
            sb.append(ch);
        }

        //return and convert to string
        return sb.toString();
    }
    */

    /**
     * Method to Encrypt
     * Takes a line of text and puts each character into an array.
     * Based on boolean variable, each character is encrypted  it when it is added to the array.
     * The array is then returned as a String.
     *
     * @param text the original line of text as a String
     * @return the encrypted line of text as a String
     */
    public static String Encrypt (String text){
        //create an ArrayList
        ArrayList<Character> characterArray = new ArrayList<Character>();

        //for each loop
        //for each character (type variable named char)
        //in the string Text (now an array of chars using the toCharArray() method)
        //breaking it apart into ArrayList
        //alter each char
        for (char c : text.toCharArray()) {
            //implicit convert to int for char code
            //SOURCE: https://stackoverflow.com/questions/2006533/how-can-i-get-a-unicode-characters-code
            int charCode = (int) c;
            //add encrypt value
            charCode += encrypt;
            //return to character
            char cEncrypt = (char) charCode;
            //add to arrayList
            characterArray.add(cEncrypt);
        }

        //use StringBuilder to convert character array to string
        //SOURCE: https://stackoverflow.com/questions/6324826/converting-arraylist-of-characters-to-a-string
        StringBuilder sb = new StringBuilder(characterArray.size());
        //for each loop to add characters from characterArray into the StringBuilder
        for (Character ch : characterArray) {
            sb.append(ch);
        }

        //return and convert to string
        return sb.toString();
    }

    /**
     * Method to Decrypt
     * Takes a line of text and puts each character into an array.
     * Based on boolean variable, each character is decrypted it when it is added to the array.
     * The array is then returned as a String.
     *
     * @param text the encrypted line of text as a String
     * @return the decrypted line of text as a String
     */
    public static String Decrypt (String text) {
        //create an ArrayList
        ArrayList<Character> characterArray = new ArrayList<Character>();

        //for each loop
        //for each character (type variable named char)
        //in the string Text (now an array of chars using the toCharArray() method)
        //breaking it apart into ArrayList
        //alter each char
        for (char c : text.toCharArray()) {
            //implicit convert to int for char code
            //SOURCE: https://stackoverflow.com/questions/2006533/how-can-i-get-a-unicode-characters-code
            int charCode = (int) c;
            //subtract encrypt value
            charCode -= encrypt;
            //return to character
            char cEncrypt = (char) charCode;
            //add to arrayList
            characterArray.add(cEncrypt);
        }

        //use StringBuilder to convert character array to string
        //SOURCE: https://stackoverflow.com/questions/6324826/converting-arraylist-of-characters-to-a-string
        StringBuilder sb = new StringBuilder(characterArray.size());
        //for each loop to add characters from characterArray into the StringBuilder
        for (Character ch : characterArray) {
            sb.append(ch);
        }

        //return and convert to string
        return sb.toString();
    }


}

