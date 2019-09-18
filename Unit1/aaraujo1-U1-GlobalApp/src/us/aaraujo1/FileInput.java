package us.aaraujo1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by andrearaujo on 9/10/18
 *
 * This class is for file input
 */

public class FileInput {
    private BufferedReader in = null;
    private String fileName;

    /**
     * The FileInput constructor requires the filename as a string
     *
     * @param fileName is the name of the file to read
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * A void method that tries to read the file
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     * A method to get a line from a file as a String
     *
     * @return line of text or null if there's an error
     */
    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * Void method to close the file
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /**
     *Method to make an arrayList from a CSV file
     * @return an ArrayList of arrays from a CSV file
     */

    public ArrayList<String[]> fileToArrayList() {
        ArrayList<String[]> s = new ArrayList<>();

        //String variable for reading a line of text
        String line;

        //Array of Strings to capture input
        String[] fields;

        //make array based on FileInput, and add to ArrayList
        while ((line = this.fileReadLine()) != null) {
            fields = line.split(",");
            s.add(fields);
        }
        return s;

    }
}