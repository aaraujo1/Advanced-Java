package us.aaraujo1;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Interface to display a welcome message
 */
public interface Displayable {

    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/

    /**
     * Method to display welcome screen
     */
    void welcomeOutput();

    /**
     * Method to get user's option from the display
     *
     * @return option as an int
     */
    int getDisplayOption();

    /**
     * Method to set user's option from the display
     *
     * @param displayOption as int
     */
    void setDisplayOption(int displayOption);
}
