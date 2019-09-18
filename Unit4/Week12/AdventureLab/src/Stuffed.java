/**
 * Starving concrete class that extends CharacterDecorator
 *
 * @author andregaraujo
 * @version 1
 */

public class Stuffed extends CharacterDecorator {

    /**
     * Constructor for Stuffed decorator
     * @param tempCharacter of Character type to be used by parent class (wrapping - decorating parent class)
     */
    public Stuffed(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Method to get character name
     * @return character name as string, with Stuffed title
     */
    public String getName() {
        return tempCharacter.getName() + " The Stuffed";
    }

    /**
     * Method to get character health
     * @return character character as double, with 3 added from Stuffed
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 3;
    }
}