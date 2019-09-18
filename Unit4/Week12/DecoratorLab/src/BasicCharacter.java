/**
 * Class that implements the Character interface and its methods
 *
 * @author andregaraujo
 * @version 1
 */

public class BasicCharacter implements Character {
    String name;
    double health;

    /**
     * Constructor for BasicCharacter
     * @param name of character name as String
     *             sets default health to 0
     */
    public BasicCharacter(String name) {
        this.name = name;
        this.health = 0;
    }

    /**
     * Method to get nanme
     * @return name as string
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get health
     * @return health as double
     */
    public double getHealth() {
        return health;
    }
}