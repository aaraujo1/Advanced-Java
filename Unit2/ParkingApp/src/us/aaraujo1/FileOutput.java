package us.aaraujo1;

import java.io.*;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * Class to handle File Output
 */

public class FileOutput {

    public Writer out = null;
    private String fileName;

    /**
     * This constructor initializes the FileOutput with a filename string
     *
     * @param fileName the name of the file
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * void method to write a line
     *
     * @param line string of line in file
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * void method to close when there are no more lines in the file
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
