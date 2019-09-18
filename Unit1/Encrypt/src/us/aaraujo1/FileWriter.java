package us.aaraujo1;

import java.io.*;

/**
 * Created by aaraujo1 on 9/3/18.
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 *
 * a class to write to a file
 */

public class FileWriter {

    Writer out = null;
    private String fileName;

    /**
     * This constructor initializes the FileOutput with a filename string
     *
     * @param fileName a string of the filename
     */
    public FileWriter(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * void method to write a line to file
     *
     * @param line string of line in file
     */
    public void fileWrite(String line) {
        try {
            out.write(line + "\n");
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }



    /**
     * void method to close when there are no more lines in the file
     *
     */
    public void fileClose() {
        if (out != null) {
            try {
                //add flush
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
