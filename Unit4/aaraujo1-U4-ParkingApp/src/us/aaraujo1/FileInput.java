package us.aaraujo1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class to handle file input
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
}

