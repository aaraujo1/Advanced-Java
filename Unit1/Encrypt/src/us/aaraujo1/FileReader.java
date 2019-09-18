package us.aaraujo1;

import java.io.*;

/**
 * Created by aaraujo1 on 9/3/18.
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 *
 * A class to read a file
 */

public class FileReader {

    private BufferedReader in = null;
    private String fileName;

    /**
     * The FileReader constructor requires the filename as a string
     *
     * @param fileName is the name of the file to read
     */
    public FileReader(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new java.io.FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * A method to get a line from a file as a String
     *
     * @return null
     */
    public String fileRead() {
        try {
            String text = in.readLine();
            return text;
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * Void method to close the file
     *
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



}
