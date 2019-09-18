package us.aaraujo1;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * Interface to display a welcome message
 */
public interface Display {

    /**
     * Method to display welcome screen
     */
    void welcomeOutput();

    /**
     * Method to get user's option from the display
     * @return option as an int
     */
    int getDisplayOption();
}
