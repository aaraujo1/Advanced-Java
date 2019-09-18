package us.aaraujo1.enums;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 */

public enum NFCTeam {
    ARI("Arizona Cardinals"),
    ATL("Atlanta Falcons"),
    CAR("Carolina Panthers"),
    CHI("Chicago Bears"),
    DAL("Dallas Cowboys"),
    DET("Detroit Lions"),
    GRE("Green Bay Packers"),
    LOS("Los Angeles Rams"),
    MIN("Minnesota Vikings"),
    NEW("New Orleans Saints"),
    //Removed due to duplicate
    //NEW("New York Giants"),
    PHI("Philadelphia Eagles"),
    SAN("San Francisco 49ers"),
    SEA("Seattle Seahawks"),
    TAM("Tampa Bay Buccaneers"),
    WAS("Washington Redskins");

    private String team;

    /**
     * Constructor to instantiate the enum with a String
     * @param team string of enum
     */
    NFCTeam(String team) { this.team = team; }

    /**
     * Method to get enum value
     * @return value of enum
     */
    public String getTeam() {
        return team;
    }
}
