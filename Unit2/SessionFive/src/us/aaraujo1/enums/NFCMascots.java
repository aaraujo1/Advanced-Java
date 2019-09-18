package us.aaraujo1.enums;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 */

public enum NFCMascots {
    //Removed due to duplicate
    //CAR("Arizona Cardinals"),
    FAL("Atlanta Falcons"),
    PAN("Carolina Panthers"),
    BEA("Chicago Bears"),
    COW("Dallas Cowboys"),
    LIO("Detroit Lions"),
    PAC("Green Bay Packers"),
    RAM("Los Angeles Rams"),
    VIK("Minnesota Vikings"),
    SAI("New Orleans Saints"),
    GIA("New York Giants"),
    EAG("Philadelphia Eagles"),
    FOR("San Francisco Forty-Niners"),
    //Removed due to duplicate
    //SEA("Seattle Seahawks"),
    BUC("Tampa Bay Buccaneers"),
    RED("Washington Redskins");

    private String mascot;

    /**
     * Constructor to instantiate the enum with a String
     * @param mascot string of enum
     */
    NFCMascots(String mascot) {
        this.mascot = mascot;
    }

    /**
     * Method to get enum value
     * @return value of enum
     */
    public String getMascot() {
        return mascot;
    }
}
