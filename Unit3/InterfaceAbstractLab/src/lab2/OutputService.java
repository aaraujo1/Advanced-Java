package lab2;

import javax.swing.*;

/**
 * This class is responsible to output.
 *
 * @author andregaraujo
 * @version 1.1
 */


public class OutputService {

    private String message = "";

    /**
     * Method to add to the output message
     * @param message the String to add to the message
     */
    public void addToMessage(String message){
        this.message += message + "\n";
    }

    /**
     * Method to clear the message
     */
    public void clearMessage() {
        message = "";
    }

    /**
     * Method to output message
     */
    public void output() {

        JOptionPane.showMessageDialog(null,message);
    }


}
