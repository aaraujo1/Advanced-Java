package us.aaraujo1;

import java.io.*;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 */
public class FileOutput {

    //made public to change it JUnit test
    public Writer out = null;
    private String fileName;



    /**
     * This constructor initializes the FileOutput with a filename string
     *
     * @param fileName a string of the filename
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            //true appends to file
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * void method to write a line
     *
     * @param line string of line in file
     */
    public void fileWrite(String line) {
        try {
            out.write(line + "\n");
            //add flush
            //out.flush();
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     * void method to close when there are no more lines in the file
     */
    public void fileClose() {
        if (out != null) {
            try {
                //add flush
                out.flush();
                //close
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}